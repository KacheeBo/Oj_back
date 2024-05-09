package cn.jsu.oj.service;

import cn.jsu.oj.pojo.web.dto.AccountInfo;
import cn.jsu.oj.pojo.web.dto.StudentInfo;
import cn.jsu.oj.pojo.web.dto.UnitInfo;
import cn.jsu.oj.pojo.web.dto.UserInfo;
import cn.jsu.oj.pojo.web.vo.InvitedMakeQuestionVO;
import cn.jsu.oj.pojo.web.vo.ShowPersonalInfoVO;
import cn.jsu.oj.pojo.web.vo.StudentAuthenticationVO;
import cn.jsu.oj.pojo.web.vo.UpdateUserPasswordVO;

import java.util.List;

/**
 *
 * @Author: wws
 * @Date: 2020/12/28 22:17
 * describe:
 *
 */
public interface PersonalService {

    public Integer updateUserNickname(AccountInfo accountInfo);

    public Integer updateUserEmail(AccountInfo accountInfo);

    public Integer updateUserPassword(UpdateUserPasswordVO vo);

    public UnitInfo showTeacherUnit(Integer accountId);

    public ShowPersonalInfoVO showPersonalInfo(Integer accountId);

    public Integer updatePersonalInfo(UserInfo userInfo);

    public List<UnitInfo> showBindInfo(Integer accountId);

    public Integer studentAuthentication(StudentAuthenticationVO vo);

    public String queryStudentName(StudentInfo studentInfo);

    public Integer invitedMakeQuestion(InvitedMakeQuestionVO vo);

}
