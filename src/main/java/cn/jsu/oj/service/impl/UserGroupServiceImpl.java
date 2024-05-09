package cn.jsu.oj.service.impl;

import cn.jsu.oj.dao.UserGroupDao;
import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.*;
import cn.jsu.oj.service.UserGroupService;
import cn.jsu.oj.util.SplitString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

/**
<<<<<<< HEAD
 *
 * @Author: wws
 * @Date: 2020/12/25 16:03
 * describe:
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    UserGroupDao userGroupDao;

    @Autowired
    SplitString splitString;

    @Override
    public Integer createGroup(UserGroupInfo userGroupInfo) {
        Integer teacherId = userGroupDao.getUnitId(userGroupInfo.getTeacherId());
        userGroupInfo.setUnitId(teacherId);
        return userGroupDao.createGroup(userGroupInfo);
    }

    @Override
    public List<UserGroupInfo> showGroupBasic(UserGroupInfo userGroupInfo) {
        return userGroupDao.showGroupBasic(userGroupInfo);
    }

    @Override
    public Boolean addGroupInvited(AddGroupInvitedVO addGroupInvitedVO) {
        String[] emails = splitString.splitEmail(addGroupInvitedVO.getEmailValue());
        Integer userGroupId = addGroupInvitedVO.getUserGroupId();
        Integer accountId;
        for (String email : emails) {
            accountId = userGroupDao.getAccountIdByEmails(email);
            if (accountId == null) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return false;
            }
            Integer i = userGroupDao.checkAccountIdIsBind(userGroupId, accountId);
            if (i == null) {
                Integer b = userGroupDao.addGroupInvited(userGroupId, accountId);
                if (b < 1) {
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                }
            }
        }
        userGroupDao.countUserGroupNumberByGroupId(userGroupId);
        return true;
    }

    @Override
    public List<ShowGroupTopicSetVO> showGroupTopicSet(UserGroupInfo userGroupInfo) {
        return userGroupDao.showGroupTopicSet(userGroupInfo);
    }

    @Override
    public Integer addGroupInvitedCode(UserGroupInviteCode userGroupInviteCode) {
        return userGroupDao.addGroupInvitedCode(userGroupInviteCode);
    }

    @Override
    public List<QueryGroupUnitVO> queryGroupUnit(Integer teacherId) {
        return userGroupDao.queryGroupUnit(teacherId);
    }

    @Override
    public Integer deleteGroupInvitedCode(Integer inviteCodeId) {
        return userGroupDao.deleteGroupInvitedCode(inviteCodeId);
    }

    @Override
    public List<QueryGroupUnitUserVO> queryGroupUnitUser(Integer userGroupId) {
        return userGroupDao.queryGroupUnitUser(userGroupId);
    }

    @Override
    public List<ShowUserGroupInvitedInfo> showGroupInvited(Integer userGroupId) {
        return userGroupDao.showGroupInvited(userGroupId);
    }

    @Override
    public Integer deleteGroupInvitedUser(UserGroupInvite userGroupInvite) {

        userGroupDao.deleteGroupInvitedUser(userGroupInvite.getInviteId());
        return  userGroupDao.countUserGroupNumberByGroupId(userGroupInvite.getUserGroupId());
    }

    @Override
    public List<ShowGroupInvitedVO> showGroupStudent(Integer userGroupId) {
        return userGroupDao.showGroupStudent(userGroupId);
    }

    @Override
    public Integer deleteGroupEmpower(Integer authorityId) {
        return userGroupDao.deleteGroupEmpower(authorityId);
    }

    @Override
    public Boolean deleteGroup(Integer[] userGroupIds) {
        Integer i;
        for (Integer userGroupId : userGroupIds) {
            i = userGroupDao.deleteGroup(userGroupId);
            if (i < 1) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return false;
            }
        }
        return true;
    }

    @Override
    public Boolean removeGroup(Integer[] userGroupIds) {
        Integer i;
        for (Integer userGroupId : userGroupIds) {
            i = userGroupDao.removeGroup(userGroupId);
            if (i < 1) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return false;
            }
        }
        return true;
    }

    @Override
    public Boolean recoverGroup(Integer[] userGroupIds) {
        Integer i;
        for (Integer userGroupId : userGroupIds) {
            i = userGroupDao.recoverGroup(userGroupId);
            if (i < 1) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return false;
            }
        }
        return true;
    }

    @Override
    public Integer updateGroupBasic(UserGroupInfo userGroupInfo) {
        return userGroupDao.updateGroupBasic(userGroupInfo);
    }

    @Override
    public QueryGroupByIdVO queryGroupById(Integer userGroupId) {
        return userGroupDao.queryGroupById(userGroupId);
    }

    @Override
    public Integer deleteGroupStudent(UserGroupBind userGroupBind) {
        userGroupDao.deleteGroupStudent(userGroupBind.getBindId());
        return userGroupDao.countUserGroupNumberByGroupId(userGroupBind.getUserGroupId());
    }

    @Override
    public List<UserGroupAuthority> showGroupEmpower(Integer integer) {
        return userGroupDao.showGroupEmpower(integer);
    }

    @Override
    public Boolean addGroupStudent(AddGroupStudentVO addGroupStudentVO) {

        Integer unitId = userGroupDao.queryUnitId(addGroupStudentVO.getUserGroupId());

        Integer userGroupId = addGroupStudentVO.getUserGroupId();

        List<StudentInfo> selectUserInfoList = addGroupStudentVO.getSelectUserInfo();

        if (selectUserInfoList != null) {
            for (StudentInfo studentInfo : selectUserInfoList) {
                Integer bindId = userGroupDao.queryBindId(userGroupId, studentInfo.getStudentId());
                if (bindId == null) {
                    userGroupDao.addUserGroupBind(userGroupId, studentInfo.getStudentId());
                }
            }
        }


        if (addGroupStudentVO.getUserInfo() != null) {
            List<StudentInfo> list = splitString.splitStudentNumberAndName(addGroupStudentVO.getUserInfo());
            if (list == null) {
                return false;
            }
            for (StudentInfo studentInfo : list) {
                Integer studentId = userGroupDao.queryStudentId(studentInfo.getStudentNumber(), unitId);
                if (studentId == null) {
                    studentInfo.setUnitId(unitId);
                    userGroupDao.addStudentInfo(studentInfo);
                    userGroupDao.addUserGroupBind(userGroupId, studentInfo.getStudentId());
                } else {
                    Integer bindId = userGroupDao.queryBindId(userGroupId, studentId);
                    if (bindId == null) {
                        userGroupDao.addUserGroupBind(userGroupId, studentId);
                    }
                }
            }
        }
        userGroupDao.countUserGroupNumberByGroupId(userGroupId);
        return true;
    }

    public List<UserGroupInviteCode> showGroupInvitedCode(Integer userGroupId) {
        return userGroupDao.showGroupInvitedCode(userGroupId);
    }

    public Boolean addGroupEmpower(AddGroupEmpowerVO addGroupEmpowerVO) {
        Integer userGroupId = addGroupEmpowerVO.getUserGroupId();
        UserGroupAuthority userGroupAuthority = addGroupEmpowerVO.getUserGroupAuthority();
        for (Integer topicSetId : addGroupEmpowerVO.getTopicSetId()) {
            userGroupAuthority.setUserGroupId(userGroupId);
            userGroupAuthority.setTopicSetId(topicSetId);
            Integer i = userGroupDao.addGroupEmpower(userGroupAuthority);
            if (i<1){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return false;
            }
        }
        return true;
    }

    @Override
    public List<QueryGroupStudentResponseVO>  queryGroupStudent(QueryGroupStudentRequestVO queryGroupStudentRequestVO) {
        return userGroupDao.queryGroupStudent(queryGroupStudentRequestVO);
    }

    @Override
    public List<UserGroupInfo> queryGroupBasic(UserGroupInfo userGroupInfo) {
        return userGroupDao.queryGroupBasic(userGroupInfo);
    }

    @Override
    public Integer updateGroupEmpower(UserGroupAuthority userGroupAuthority) {
        return userGroupDao.updateGroupEmpower(userGroupAuthority);
    }

}
