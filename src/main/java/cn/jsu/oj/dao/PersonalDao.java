package cn.jsu.oj.dao;

import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.InvitedMakeQuestionVO;
import cn.jsu.oj.pojo.web.vo.ShowPersonalInfoVO;
import cn.jsu.oj.pojo.web.vo.StudentAuthenticationVO;
import cn.jsu.oj.pojo.web.vo.UpdateUserPasswordVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wws
 * @Date: 2020/12/28 21:54
 * describe:
 */
@Mapper
@Repository
public interface PersonalDao {

    public Integer updateUserNickname(AccountInfo accountInfo);

    public Integer updateUserEmail(AccountInfo accountInfo);

    public Integer queryEmail(AccountInfo accountInfo);

    public Integer checkAccountPassWord(@Param("accountId") Integer accountId, @Param("accountPassword") String accountPassword);

    public Integer updateUserPassword(UpdateUserPasswordVO vo);

    public UnitInfo showTeacherUnit(Integer accountId);

    public ShowPersonalInfoVO showPersonalInfo(Integer accountId);

    public Integer updatePersonalInfo(UserInfo userInfo);

    public List<UnitInfo> showBindInfo(Integer accountId);

    public Integer studentAuthentication(@Param("accountId")Integer accountId,@Param("studentId")Integer studentId);

    public String queryStudentName(StudentInfo studentInfo);

    public Integer findGroupIdByBindCode(String bindCode);

    public Integer findStdIdByUnitAndStdNumber(StudentAuthenticationVO vo);

    public Integer findBindIdByStdIdAndGroupId(@Param("userGroupId") Integer userGroupId, @Param("studentId") Integer studentId);

    public Integer invitedMakeQuestion(InvitedMakeQuestionVO vo);

    public Integer findGroupIdByInviteCode(String inviteCodeContent);

    public Integer findInvitedIdByAccountIdAndGroupId(UserGroupInvite userGroupInviteCode);
}
