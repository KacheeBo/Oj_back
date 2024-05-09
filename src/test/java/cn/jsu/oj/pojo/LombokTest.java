package cn.jsu.oj.pojo;

import cn.jsu.oj.pojo.web.vo.CommonResult;
import org.junit.Test;

/**
 * @author: suixuexue
 * @date: 2020/12/17 15:21
 * describe:
 */
public class LombokTest
{

    @Test
    public void test()
    {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(1);
        commonResult.setMessage("2");
        System.out.println(commonResult.toString());
    }
}
