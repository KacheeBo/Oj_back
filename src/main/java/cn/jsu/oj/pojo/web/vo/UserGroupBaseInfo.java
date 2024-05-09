package cn.jsu.oj.pojo.web.vo;

import cn.jsu.oj.pojo.web.dto.UserGroupInfo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @Author: wws
 * @Date: 2020/12/26 9:55
 * describe:
 *   显示用户组基本信息功能 所需数据
 */
public class UserGroupBaseInfo extends UserGroupInfo implements Serializable {
    private String teacherName;

    public UserGroupBaseInfo() {
    }

    public UserGroupBaseInfo(Integer userGroupId, String userGroupName, Boolean userGroupPermission, Date userGroupTime, String userGroupDescribe, String userGroupCode, Integer teacherId, Integer unitId, String userGroupInCode, Boolean userGroupRecycled, Integer userGroupNum, String teacherName) {
        super(userGroupId, userGroupName, userGroupPermission, userGroupTime, userGroupDescribe, userGroupCode, teacherId, unitId, userGroupInCode, userGroupRecycled, userGroupNum);
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
