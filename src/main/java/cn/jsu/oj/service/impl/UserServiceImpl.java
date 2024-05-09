package cn.jsu.oj.service.impl;

import cn.jsu.oj.dao.UserDao;
import cn.jsu.oj.pojo.web.dto.AccountInfo;
import cn.jsu.oj.pojo.web.dto.TeacherInfo;
import cn.jsu.oj.pojo.web.dto.UserInfo;
import cn.jsu.oj.pojo.web.vo.CommonResult;
import cn.jsu.oj.pojo.web.vo.LoginResponseVo;
import cn.jsu.oj.pojo.web.vo.LoginVo;
import cn.jsu.oj.service.UserService;
import cn.jsu.oj.util.CpachaUtil;
import cn.jsu.oj.util.JWTUtil;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    UserDao userDao;

    @Autowired
    ServletContext servletContext;

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    private HashSet<String> set = new HashSet<>();

    @Override
    public Integer register(AccountInfo account)
    {
        int i = userDao.queryAccountInfo(account.getAccountEmail());
        if (i > 0)
        {
            return 1;
        }
        int i1 = userDao.insertAccountInfo(account);
        int i2 = userDao.insertUserInfoCountId(account.getAccountId());
        if (i1 > 0 && i2 > 0)
        {
            return 2;
        }
        return 0;
    }

    @Override
    public CommonResult login(LoginVo loginVo, HttpServletRequest request)
    {
        HttpSession session = request.getSession();
        //String vCode = (String) session.getAttribute("vCode");
        String data = loginVo.getData();
        String s = redisTemplate.opsForValue().get(data);
        //if (loginVo.getCode().equalsIgnoreCase(vCode))
        if (s.equalsIgnoreCase(loginVo.getCode()))
        {
            try
            {
                int i = userDao.queryAccountInfo(loginVo.getAccountEmail());
                if (i < 0)
                {
                    return new CommonResult(444, "该邮箱未注册，请进行注册");
                }
                LoginResponseVo login = userDao.login(loginVo);
                if (!login.equals("") || !login.equals("null"))
                {
                    HashMap<String, String> payload = new HashMap<>();
                    payload.put("accountId", login.getAccountId() +  "");
                    //生成JWT令牌
                    String token = JWTUtil.getTOKEN(payload);
                    login.setToken(token);
                    //System.out.println(":::::::::::::::::::::"+request.getHeader("jmx"));
                    System.out.println("这次请求的token是"+"============================"+token);
                    if (login.getAccountTypeId() == 3)
                    {
                        TeacherInfo tea = userDao.queryTeacher(login.getAccountId());
                        login.setTeacherId(tea.getTeacherId());
                        login.setTeacherName(tea.getTeacherName());
                    }
                    UserInfo userInfo = userDao.queryImg(login.getAccountId());
                    login.setiHead(String.valueOf(userInfo));
                    return new CommonResult(200, "登录成功", login);
                }
            }
            catch (Exception e)
            {
                return new CommonResult(444, "登录失败！邮箱或密码错误！");
            }
            set.remove(loginVo.getCode());
        }
        else
        {
            return new CommonResult(444, "验证码错误!");
        }
        return null;
    }

    @Override
    public CommonResult<Map> verificationCode(String data, HttpServletRequest request, HttpServletResponse response)
    {
        Map<String, Object> result = null;
        HttpSession session = request.getSession();
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        CpachaUtil cpachaUtil = new CpachaUtil();
        String vCode = cpachaUtil.generatorVCode();
        //redisTemplate.opsForValue().set(data, vCode, 60L, TimeUnit.DAYS);
        BufferedImage bufferedImage = cpachaUtil.generatorRotateVCodeImage(vCode, true);
        try
        {
            ImageIO.write(bufferedImage, "jpg", jpegOutputStream);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        //定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        ServletOutputStream responseOutputStream = null;
        try
        {
            responseOutputStream = response.getOutputStream();
            //将图片转换陈字符串给前端
            Base64 base64 = new Base64();
            long l = System.currentTimeMillis();
            redisTemplate.opsForValue().set(l+"", vCode, 60L, TimeUnit.SECONDS);
            String encode = base64.encodeAsString(captchaChallengeAsJpeg);
            //封装数据
            result = new HashMap<String, Object>();
            result.put("image", "data:image/png;base64,"+encode);
            result.put("vCode", l);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return new CommonResult<>(200,"验证码", result);
    }

    @Override
    public void img(int account, HttpServletResponse response)
    {
        UserInfo userInfo = userDao.queryImg(account);
        byte[] data = userInfo.getiHead();
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        // response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        response.setCharacterEncoding("UTF-8");
        OutputStream outputStream = null;
        try
        {
            outputStream = response.getOutputStream();
            outputStream.write(data);
            outputStream.flush();
            outputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
