package cn.jsu.oj.config;

import cn.jsu.oj.util.JWTUtil;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.javafx.geom.transform.SingularMatrixException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * @author xiaxia
 * @title: JWTInterceptor
 * @projectName oj
 * @description: TODO
 * @Version 1.0
 * @date 2021/1/617:09
 */
public class JWTInterceptor implements HandlerInterceptor
{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        HashMap<Object, Object> map = new HashMap<>();
        //获取请求头中令牌
        String token = request.getHeader("token");
        try
        {
            JWTUtil.verify(token);//验证令牌
            return true;//请求放行
        }
        catch (SingularMatrixException e)
        {
            e.printStackTrace();
            map.put("msg", "无效签名!");
        }
        catch (TokenExpiredException e)
        {
            e.printStackTrace();
            map.put("msg", "令牌过期!");
        }
        catch (AlgorithmMismatchException e)
        {
            e.printStackTrace();
            map.put("msg", "token算法不一致!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            map.put("msg", "token无效!");
        }
        map.put("state", false);//设置状态
        //将map转化为json jackson
        String json = new ObjectMapper().writeValueAsString(map);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().println(json);
        return false;
    }

    //@Override
    //public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    //{
    //    HashMap<Object, Object> map = new HashMap<>();
    //    //获取请求头中令牌
    //    String token = request.getHeader("token");
    //    try
    //    {
    //        JWTUtil.verify(token);//验证令牌
    //        //    return true;//请求放行
    //    }
    //    catch (SingularMatrixException e)
    //    {
    //        e.printStackTrace();
    //        map.put("msg", "无效签名!");
    //    }
    //    catch (TokenExpiredException e)
    //    {
    //        e.printStackTrace();
    //        map.put("msg", "令牌过期!");
    //    }
    //    catch (AlgorithmMismatchException e)
    //    {
    //        e.printStackTrace();
    //        map.put("msg", "token算法不一致!");
    //    }
    //    catch (Exception e)
    //    {
    //        e.printStackTrace();
    //        map.put("msg", "token无效!");
    //    }
    //    map.put("state", false);//设置状态
    //    //将map转化为json jackson
    //    String json = new ObjectMapper().writeValueAsString(map);
    //    response.setContentType("application/json;charset=utf-8");
    //    response.getWriter().println(json);
    //}
}
