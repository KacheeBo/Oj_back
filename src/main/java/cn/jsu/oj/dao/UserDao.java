package cn.jsu.oj.dao;

import cn.jsu.oj.pojo.web.dto.AccountInfo;
import cn.jsu.oj.pojo.web.dto.TeacherInfo;
import cn.jsu.oj.pojo.web.dto.UserInfo;
import cn.jsu.oj.pojo.web.vo.LoginResponseVo;
import cn.jsu.oj.pojo.web.vo.LoginVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao
{
    // 根据邮箱查询是否已经存在
    int queryAccountInfo(String account_email);

    // 将前端得到的注册信息存入数据库
    int insertAccountInfo(AccountInfo AccountInfo);

    // 将前端得到的注册的自增编号插入用户信息表中
    int insertUserInfoCountId(Integer account_id);

    // 根据账号和密码取查询数据
    LoginResponseVo login(LoginVo loginVo);

    // 根据账号编号查询教师的信息
    TeacherInfo queryTeacher(Integer account_id);

    // 查询用户头像信息
    UserInfo queryImg(Integer account_id);
}
