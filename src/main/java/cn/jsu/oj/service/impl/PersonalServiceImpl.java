package cn.jsu.oj.service.impl;

import cn.jsu.oj.dao.PersonalDao;
import cn.jsu.oj.dao.UserGroupDao;
import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.InvitedMakeQuestionVO;
import cn.jsu.oj.pojo.web.vo.ShowPersonalInfoVO;
import cn.jsu.oj.pojo.web.vo.StudentAuthenticationVO;
import cn.jsu.oj.pojo.web.vo.UpdateUserPasswordVO;
import cn.jsu.oj.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @Author: wws
 * @Date: 2020/12/28 22:17
 * describe:
 *
 */
@Service
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    PersonalDao personalDao;

    @Autowired
    UserGroupDao userGroupDao;

    @Override
    public Integer updateUserNickname(AccountInfo accountInfo) {
        return personalDao.updateUserNickname(accountInfo);
    }

    @Override
    public Integer updateUserEmail(AccountInfo accountInfo) {
        Integer i1 = personalDao.queryEmail(accountInfo);

        if (i1 != null) {
            return 1;
        }
        Integer i2 = personalDao.checkAccountPassWord(accountInfo.getAccountId(), accountInfo.getAccountPassWord());
        if (i2 == null) {
            return 2;
        }
        Integer i3 = personalDao.updateUserEmail(accountInfo);
        if (i3 > 0) {
            return 3;
        } else {
            return 4;
        }
    }

    @Override
    public Integer updateUserPassword(UpdateUserPasswordVO vo) {
        String accountPassword = vo.getAccountPassword();
        String checkAccountPassword = vo.getCheckAccountPassword();
        if (!accountPassword.equals(checkAccountPassword)) {
            return 1;
        }
        Integer i1 = personalDao.checkAccountPassWord(vo.getAccountId(), vo.getOldPassword());
        if (i1 == null) {
            return 2;
        }
        Integer i2 = personalDao.updateUserPassword(vo);
        if (i2 > 0) {
            return 3;
        } else {
            return 4;
        }

    }

    @Override
    public UnitInfo showTeacherUnit(Integer accountId) {
        return personalDao.showTeacherUnit(accountId);
    }

    public ShowPersonalInfoVO showPersonalInfo(Integer accountId) {
        return personalDao.showPersonalInfo(accountId);
    }

    @Override
    public Integer updatePersonalInfo(UserInfo userInfo) {
        return personalDao.updatePersonalInfo(userInfo);
    }

    @Override
    public List<UnitInfo> showBindInfo(Integer accountId) {
        return personalDao.showBindInfo(accountId);
    }

    public Integer studentAuthentication(StudentAuthenticationVO vo) {
        //查询绑定码是否存在，然后返回groupId
        Integer groupId = personalDao.findGroupIdByBindCode(vo.getUserGroupBindCode());
        //if null  return
        if (null == groupId) {
            return 1;
        }
        //unitId+number   find studentId
        Integer studentId = personalDao.findStdIdByUnitAndStdNumber(vo);
        //if null  return
        if (null == studentId) {
            return 2;
        }
        //groupId + studentId find bindId
        Integer bindId = personalDao.findBindIdByStdIdAndGroupId(groupId, studentId);
        if (null == bindId) {
            return 3;
        }

        Integer i = personalDao.studentAuthentication(vo.getAccountId(), studentId);
        if (i > 0) {
            return 4;
        } else {
            return 5;
        }

    }

    @Override
    public String queryStudentName(StudentInfo studentInfo) {
        return personalDao.queryStudentName(studentInfo);
    }

    @Override
    public Integer invitedMakeQuestion(InvitedMakeQuestionVO vo) {
        Integer groupId = personalDao.findGroupIdByInviteCode(vo.getInviteCodeContent());
        System.out.println(groupId);
        if (null == groupId) {
            return 1;
        }
        UserGroupInvite userGroupInviteCode = new UserGroupInvite();
        userGroupInviteCode.setAccountId(vo.getAccountId());
        userGroupInviteCode.setUserGroupId(groupId);
        Integer invitedId = personalDao.findInvitedIdByAccountIdAndGroupId(userGroupInviteCode);
        if (null != invitedId) {
            return 2;
        }
        Integer i1 = personalDao.invitedMakeQuestion(vo);
        Integer i2 = userGroupDao.countUserGroupNumberByGroupId(groupId);

        if (i1 > 0 && i2 > 0) {
            return 3;
        } else {
            return 4;
        }
    }


}
