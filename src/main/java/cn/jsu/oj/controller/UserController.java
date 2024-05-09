package cn.jsu.oj.controller;

import cn.jsu.oj.pojo.web.dto.AccountInfo;
import cn.jsu.oj.pojo.web.vo.CommonResult;
import cn.jsu.oj.pojo.web.vo.LoginVo;
import cn.jsu.oj.service.UserService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600,allowCredentials="true")
//@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController
{

    @Autowired
    ServletContext servletContext;

    @Autowired
    private UserService userService;

    @Autowired
    StringRedisTemplate redisTemplate;

    @PostMapping("/register")
    @ApiModelProperty("注册")
    public CommonResult register(@RequestBody AccountInfo account)
    {
        int i = userService.register(account);
        switch (i)
        {
            case 1:
                return new CommonResult(444, "该邮箱已被注册");
            case 2:
                return new CommonResult(200, "注册成功");
            default:
                return new CommonResult(444, "注册失败");

        }
    }

    @PostMapping("/login")
    @ApiModelProperty("登录")
    public CommonResult login(@RequestBody LoginVo loginVo, HttpServletRequest request)
    {
        return userService.login(loginVo, request);
    }

    @PostMapping("/verificationCode")
    @ApiModelProperty("验证码请求")
    public CommonResult<Map> verificationCode(@RequestBody String data, HttpServletRequest request, HttpServletResponse response)
    {
        CommonResult<Map> mapCommonResult = userService.verificationCode(data, request, response);
        return mapCommonResult;
    }

    @PostMapping("/photo")
    @ApiModelProperty("查询用户头像信息")
    public void photo(@RequestBody int account, HttpServletResponse response)
    {
        userService.img(account, response);
    }

}
