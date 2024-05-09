package cn.jsu.oj.service;

import cn.jsu.oj.pojo.web.dto.QTestTopic;
import cn.jsu.oj.pojo.web.vo.CommonResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * @author: suixuexue
 * @date: 2020/12/29 9:58
 * describe:
 */
public interface FileService
{
    public CommonResult upLoadTest(MultipartFile file,QTestTopic qTestTopic);

    public CommonResult downloadTestByIdX(QTestTopic qTestTopic, HttpServletResponse response);
}
