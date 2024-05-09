package cn.jsu.oj.util;

import cn.jsu.oj.pojo.web.dto.StudentInfo;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @Author: wws
 * @Date: 2020/12/27 17:12
 * describe:
 *
 */
@Component
public class SplitString {

    public List<StudentInfo>  splitStudentNumberAndName(String in) {
        String[] strings = in.split("\n");
        List<StudentInfo> list = new ArrayList<>();
        for (String s : strings) {
            String[] b = s.split("\\s+");
            if (b.length != 2) {
                return null;
            }
            list.add(new StudentInfo(b[0],b[1]));
        }
        return list;
    }

    public String[] splitEmail(String string) {
        return string.split("\n");
    }

}
