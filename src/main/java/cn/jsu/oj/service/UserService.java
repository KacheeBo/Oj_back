package cn.jsu.oj.service;

import cn.jsu.oj.pojo.web.dto.AccountInfo;
import cn.jsu.oj.pojo.web.vo.CommonResult;
import cn.jsu.oj.pojo.web.vo.LoginVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public interface UserService
{

    public Integer register(AccountInfo account);

    public CommonResult login(LoginVo loginVo, HttpServletRequest request);

    public CommonResult<Map> verificationCode(String data, HttpServletRequest request, HttpServletResponse response);

    public void img(int account, HttpServletResponse response);
}
