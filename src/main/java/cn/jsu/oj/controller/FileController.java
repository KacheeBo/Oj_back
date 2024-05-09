package cn.jsu.oj.controller;

import cn.jsu.oj.pojo.web.dto.KnowledgePoints;
import cn.jsu.oj.pojo.web.dto.QTestTopic;
import cn.jsu.oj.pojo.web.dto.UserInfo;
import cn.jsu.oj.pojo.web.vo.CommonResult;
import cn.jsu.oj.service.FileService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/28 19:13
 * describe:
 */
@CrossOrigin
@RestController
@RequestMapping("/file")
public class FileController
{
    @Autowired
    FileService fileService;

    @PostMapping("/upLoadTest")
    @ApiModelProperty
    public CommonResult upLoadTest(@RequestParam("File") MultipartFile file, QTestTopic qTestTopic)
    {
        return fileService.upLoadTest(file, qTestTopic);
    }

    @PostMapping("/downloadTestByIdX")
    @ApiModelProperty
    public void downloadTestByIdX(@RequestBody QTestTopic qTestTopic, HttpServletResponse response)
    {
        fileService.downloadTestByIdX(qTestTopic, response);
    }

    @PostMapping("/addOneKnowLedgeJ")
    @ApiModelProperty("祖父知识点")
    public CommonResult addOneKnowLedgeJ(@RequestBody KnowledgePoints knowledgePoints)
    {
        fileService.addOneKnowLedgeJ(knowledgePoints.getKnowledgeType(), knowledgePoints.getKnowledgeFatherId());
        return new CommonResult(200, "添加祖父知识点成功");
    }

    @PostMapping("/upLoadUserImg")
    @ApiModelProperty("用户上传头像")
    public CommonResult upLoadUserImg(@RequestParam("File") MultipartFile file, HttpServletRequest request, HttpServletResponse response)
    {
        return fileService.upLoadUserImg(file, request, response);
    }

    @PostMapping("/test")
    @ApiModelProperty("用户上传头像")
    public CommonResult test(@RequestParam("File") MultipartFile file, HttpServletRequest request, HttpServletResponse response)
    {
        List<UserInfo> test = fileService.test();
        return new CommonResult(444, "该邮箱已被注册", test);
    }
}