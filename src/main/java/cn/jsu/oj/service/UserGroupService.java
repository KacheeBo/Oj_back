package cn.jsu.oj.service;

import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.*;

import java.util.List;

/**
 * @Author: wws
 * @Date: 2020/12/25 16:03
 * describe:
 * 用户组接口
 */
public interface UserGroupService {

    //创建用户组
    public Integer createGroup(UserGroupInfo userGroupInfo);

    //显示用户组基本信息
    public List<UserGroupInfo> showGroupBasic(UserGroupInfo userGroupInfo);

    public List<ShowUserGroupInvitedInfo> showGroupInvited(Integer userGroupId);

    public Integer deleteGroupInvitedUser(UserGroupInvite userGroupInvite);

    public List<ShowGroupInvitedVO> showGroupStudent(Integer userGroupId);

    public Integer deleteGroupStudent(UserGroupBind userGroupBind);

    public List<UserGroupAuthority> showGroupEmpower(Integer integer);

    public List<UserGroupInviteCode> showGroupInvitedCode(Integer userGroupId);

    //添加用户组受邀用户信息
    public Boolean addGroupInvited(AddGroupInvitedVO addGroupInvitedVO);

    public Boolean addGroupStudent(AddGroupStudentVO addGroupStudentVO);

    public List<ShowGroupTopicSetVO> showGroupTopicSet(UserGroupInfo userGroupInfo);

    public Integer addGroupInvitedCode(UserGroupInviteCode userGroupInviteCode);

    public List<QueryGroupUnitVO> queryGroupUnit(Integer teacherId);

    public Integer deleteGroupInvitedCode(Integer inviteCodeId);

    public List<QueryGroupUnitUserVO> queryGroupUnitUser(Integer userGroupId);

    public Integer deleteGroupEmpower(Integer authorityId);

    public Boolean deleteGroup(Integer[] userGroupId);

    public Boolean removeGroup(Integer[] userGroupId);

    public Boolean recoverGroup(Integer[] userGroupId);

    public Integer updateGroupBasic(UserGroupInfo userGroupInfo);

    public QueryGroupByIdVO queryGroupById(Integer userGroupId);

    public Boolean addGroupEmpower(AddGroupEmpowerVO addGroupEmpowerVO);

    public List<QueryGroupStudentResponseVO> queryGroupStudent(QueryGroupStudentRequestVO queryGroupStudentRequestVO);

    public List<UserGroupInfo> queryGroupBasic(UserGroupInfo userGroupInfo);

    public Integer updateGroupEmpower(UserGroupAuthority userGroupAuthority);
}
