package cn.jsu.oj.util;

/**
 * @author xiaxia
 * @title: JWTUtil
 * @projectName oj
 * @description: TODO
 * @Version 1.0
 * @date 2021/1/617:08
 */

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

public class JWTUtil
{
    //Token的私钥
    private static final String TOKEN = "jsuOJ";
    //Token的过期时间
    private static final long EXPIRE_TIME = 15 * 60 * 1000;

    //生成token
    public static String getTOKEN(Map<String, String> map)
    {
        JWTCreator.Builder builder = JWT.create();
        map.forEach((k, v) ->
        {
            builder.withClaim(k, v);
        });

        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.MINUTE, 1000*60*60);//设置过期时间
        builder.withExpiresAt(instance.getTime());
        return builder.sign(Algorithm.HMAC256(TOKEN)).toString();
    }

    //验证token
    public static void verify(String token)
    {
        System.out.println(token+"::::::::::::::::::::::::::::::蒋梦霞是沙雕");
        JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
    }

    //获取token中的payload
    public static DecodedJWT getToken(String token)
    {
        return JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
    }
}