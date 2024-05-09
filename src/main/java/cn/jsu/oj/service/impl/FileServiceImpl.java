package cn.jsu.oj.service.impl;

import cn.jsu.oj.dao.FileDao;
import cn.jsu.oj.pojo.web.dto.QTestTopic;
import cn.jsu.oj.pojo.web.dto.TestPointInfo;
import cn.jsu.oj.pojo.web.vo.CommonResult;
import cn.jsu.oj.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import static org.apache.catalina.startup.ExpandWar.deleteDir;

/**
 * @author: suixuexue
 * @date: 2020/12/29 9:58
 * describe:
 */
@Service
public class FileServiceImpl implements FileService
{
    @Autowired
    FileDao fileDao;

    private static final String filePath = "D:"+ File.separatorChar+"Shared"+File.separatorChar+"test"+File.separatorChar;
    private static final int    BUFFER   = 2048;
    private static final String compile  = "[\\u4e00-\\u9fa5]";

    @Override
    public CommonResult upLoadTest(MultipartFile file, QTestTopic qTestTopic)
    {
        String cent = qTestTopic.getTopicTypeId() + "-" + qTestTopic.getTopicId();
        if (file.isEmpty())
        {
            return new CommonResult(444, "上传文件失败!文件为空!");
        }
        delete(cent);
        String fileName = file.getOriginalFilename();
        Pattern pattern = Pattern.compile(compile);
        Matcher matcher = pattern.matcher(fileName);
        if (matcher.find())
        {
            return new CommonResult(444, "上传文件失败!文件名包含中文!");
        }
        String fileNameO = filePath + fileName;
        File dest = new File(fileNameO);
        try
        {
            file.transferTo(dest);
            File newFile = new File(filePath  + cent+".zip");
            System.out.println("修改后文件名称是："+newFile.getName());
            dest.renameTo(newFile);
            int i = unCompress(filePath, fileName, qTestTopic);
            File file1 = new File(filePath+fileName);
            ArrayList<String> story = find(cent);
            story(story, qTestTopic);
            if (file1.exists())
            {
                file1.delete();
            }
            if (i <= 0)
            {
                return new CommonResult(444, "上传文件失败!格式不正确!");
            } else
            {
                return new CommonResult(200, "上传文件成功!");
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return new CommonResult(444, "上传文件失败!");
    }

    private void delete(String cent)
    {
        File file2 = new File(filePath + cent + ".zip");
        if (file2.exists()){
            file2.delete();
        }
        File file = new File(filePath + cent);
        //判断是否为文件夹
        if(file.isDirectory()){
            //获取该文件夹下的子文件夹
            File[] files = file.listFiles();
            //循环子文件夹重复调用delete方法
            for (int i = 0; i < files.length; i++) {
                deleteDir(files[i]);
            }
        }
        //若为空文件夹或者文件删除，File类的删除方法
        file.delete();
    }

    private void story(ArrayList<String> list, QTestTopic qTestTopic)
    {
        TestPointInfo testPointInfo = new TestPointInfo();
        Integer topicId = qTestTopic.getTopicId();
        Integer topicTypeId = qTestTopic.getTopicTypeId();
        testPointInfo.setTopicId(topicId);
        testPointInfo.setTopicTypeId(topicTypeId);
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            String substring = s.substring(0, s.length() - 1);
            System.out.println(substring);//
            int k = substring.lastIndexOf("#");
            System.out.println(k);//
            String tip = substring.substring(k+1, substring.length());
            System.out.println(tip);//
            String substring1 = substring.substring(0, k-1).trim().replace("\uFEFF", "");
            int score = Integer.valueOf(substring1).intValue();
            testPointInfo.setTestPointScore(score);
            testPointInfo.setTestPointNumber(i);
            testPointInfo.setTopicTip(tip);
            TestPointInfo query = fileDao.query(testPointInfo);
            if (query != null){
                testPointInfo.setTestPointId(query.getTestPointId());
                fileDao.update(testPointInfo);
            } else {
                fileDao.story(testPointInfo);
            }
        }
    }

    private ArrayList<String> find(String cent)
    {
        ArrayList<String> list = new ArrayList<>();
        String fileName = filePath +cent+ File.separatorChar +"scores.txt";
        File file = new File(fileName);
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        try
        {
            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
            bufferedReader = new BufferedReader(inputStreamReader);
            String lineTxt = null;
            while((lineTxt = bufferedReader.readLine()) != null){
                String replace = lineTxt.replace("\uFEFF", "").replaceAll(" ", "");
                int i = replace.lastIndexOf("#");
                if (i < 0){
                    break;
                }
                list.add(lineTxt);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try{
                inputStreamReader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            try{
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try{
                fileInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public CommonResult downloadTestByIdX(QTestTopic qTestTopic, HttpServletResponse response)
    {
        String fileName = qTestTopic.getTopicTypeId() +"-" +qTestTopic.getTopicId();
        File file = new File(filePath + fileName + ".zip");
        if (file.exists())
        {
            response.setContentType("application/octet-stream;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            try
            {
                response.setHeader("Content-Disposition", "attachment;fileName=" + java.net.URLEncoder.encode(fileName,"UTF-8"));
            }
            catch (UnsupportedEncodingException e)
            {
                e.printStackTrace();
            }
            byte[] buffer = new byte[BUFFER];
            FileInputStream fis = null; //文件输入流
            BufferedInputStream bis = null;
            OutputStream os = null; //输出流
            try {
                os = response.getOutputStream();
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                int i = bis.read(buffer);
                while(i != -1){
                    os.write(buffer);
                    i = bis.read(buffer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            return new CommonResult(444, "下载失败!没有相应文件");
        }
        return new CommonResult(200, "下载成功");
    }

    public static int unCompress(String pathName, String fileName, QTestTopic qTestTopic)
    {
        int result = 0;
        Integer topicTypeId = qTestTopic.getTopicTypeId();
        Integer topicId = qTestTopic.getTopicId();
        String cent = topicTypeId + "-" + topicId;
        String totalName = pathName + cent;
        new File(pathName +cent).mkdirs();
        ZipFile zipFile = null;
        try
        {
            zipFile = new ZipFile(totalName+".zip");
            Enumeration enu = zipFile.entries();
            while (enu.hasMoreElements())
            {
                ZipEntry zipEntry = (ZipEntry) enu.nextElement();
                System.out.println("目录时结束");
                if (zipEntry.isDirectory())
                {
                    break;
                }
                BufferedInputStream bis = new BufferedInputStream(zipFile
                        .getInputStream(zipEntry));
                String name = zipEntry.getName();
                String substring = name.replace(fileName+".zip", "");
                int i = name.lastIndexOf(".");
                String sub = name.substring(i, name.length());
                if (sub.equals(".in") || sub.equals(".out") || sub.equals(".txt"))
                {
                    System.out.println("判断时结束");
                    File file = new File(pathName+ File.separatorChar +cent+ File.separatorChar +substring);
                    File parent = file.getParentFile();
                    if (parent != null && !parent.exists())
                    {
                        parent.mkdirs();
                    }
                    FileOutputStream fos = new FileOutputStream(file);
                    BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER);
                    int count;
                    byte[] array = new byte[BUFFER];
                    while ((count = bis.read(array, 0, BUFFER)) != -1)
                    {
                        bos.write(array, 0, BUFFER);
                    }
                    bos.flush();
                    bos.close();
                    fos.close();
                    bis.close();
                }
            }
            result = 1;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }finally
        {
            if (zipFile != null)
            {
                try
                {
                    zipFile.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}