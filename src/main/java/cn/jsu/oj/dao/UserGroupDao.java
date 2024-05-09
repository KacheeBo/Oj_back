package cn.jsu.oj.dao;

import cn.jsu.oj.pojo.web.dto.StudentInfo;
import cn.jsu.oj.pojo.web.dto.UserGroupAuthority;
import cn.jsu.oj.pojo.web.dto.UserGroupInfo;
import cn.jsu.oj.pojo.web.dto.UserGroupInviteCode;
import cn.jsu.oj.pojo.web.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @Author: wws
 * @Date: 2020/12/25 16:02
 * describe:
 */
@Mapper
@Repository
public interface UserGroupDao {
    //创建用户组
    public Integer createGroup(UserGroupInfo userGroupInfo);

    public Integer getUnitId(Integer teacherId);

    //显示用户组基本信息
    public List<UserGroupInfo> showGroupBasic(UserGroupInfo userGroupInfo);

    public Integer getAccountIdByEmails(String email);

    public Integer checkAccountIdIsBind(@Param("userGroupId") Integer userGroupId, @Param("accountId") Integer accountId);

    public Integer addGroupInvited(@Param("userGroupId") Integer userGroupId, @Param("accountId") Integer accountId);

    public List<ShowUserGroupInvitedInfo> showGroupInvited(Integer userGroupId);

    public Integer deleteGroupInvitedUser(Integer invitedId);

    public List<ShowGroupInvitedVO> showGroupStudent(Integer userGroupId);

    public Integer deleteGroupStudent(Integer bindId);

    public List<UserGroupAuthority> showGroupEmpower(Integer userGroupId);

    public List<UserGroupInviteCode> showGroupInvitedCode(Integer userGroupId);

    public List<ShowGroupTopicSetVO> showGroupTopicSet(UserGroupInfo userGroupInfo);

    public Integer addGroupInvitedCode(UserGroupInviteCode userGroupInviteCode);

    public List<QueryGroupUnitVO> queryGroupUnit(Integer teacherId);

    public List<QueryGroupUnitUserVO> queryGroupUnitUser(Integer userGroupId);

    public Integer deleteGroupInvitedCode(Integer inviteCodeId);

    public Integer deleteGroupEmpower(Integer authorityId);

    public Integer queryStudentId(@Param("studentNumber") String studentNumber, @Param("unitId") Integer unitId);

    public Integer addStudentInfo(StudentInfo studentInfo);

    public Integer addUserGroupBind(@Param("userGroupId") Integer userGroupId, @Param("studentId") Integer studentId);

    public Integer queryBindId(@Param("userGroupId") Integer userGroupId, @Param("studentId") Integer studentId);

    public Integer queryUnitId(Integer unitId);

    public Integer deleteGroup(Integer userGroupId);

    public Integer removeGroup(Integer userGroupId);

    public Integer recoverGroup(Integer userGroupId);

    public Integer updateGroupBasic(UserGroupInfo userGroupInfo);

    public QueryGroupByIdVO queryGroupById(Integer userGroupId);

    public Integer addGroupEmpower(UserGroupAuthority userGroupAuthority);

    public List<QueryGroupStudentResponseVO>  queryGroupStudent(QueryGroupStudentRequestVO queryGroupStudentRequestVO);

    public List<UserGroupInfo> queryGroupBasic(UserGroupInfo userGroupInfo);

    public Integer updateGroupEmpower(UserGroupAuthority userGroupAuthority);

    public Integer countUserGroupNumberByGroupId(Integer userGroupId);

}
