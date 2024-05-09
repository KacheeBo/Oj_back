package cn.jsu.oj.service.impl;

import cn.jsu.oj.dao.TopicSetDao;
import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.*;
import cn.jsu.oj.service.TopicSetService;
import cn.jsu.oj.util.CWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author: suixuexue
 * @date: 2020/12/17 17:17
 * describe:
 */
@Service
public class TopicSetServiceImpl implements TopicSetService
{

    @Autowired
    TopicSetDao topicSetDao;

    @Autowired
    CWT cwt;

    @Override
    public int createTopicSet(TopicSetInfo topicSetInfo)
    {
        return topicSetDao.createTopicSet(topicSetInfo);
    }

    @Override
    public List<TopicSetBaseInfo> showTopicSet(Integer teacherId, boolean topicSetRecycled)
    {
        List<TopicSetBaseInfo> topicSetInfos = topicSetDao.showTopicSet(teacherId, topicSetRecycled);
        for (TopicSetBaseInfo topicSetInfo : topicSetInfos)
        {
            HashMap<String, Date> map = new HashMap<>();
            map.put("start", topicSetInfo.getTopicSetStartTime());
            map.put("end", topicSetInfo.getTopicSetEndTime());
            String result = cwt.cwt(map);
            topicSetInfo.setTopicSetStatus(result);
        }
        return topicSetInfos;
    }

    @Override
    public HashMap queryLanguage()
    {
        List<CompilerLanguage> compilerLanguages = topicSetDao.queryLanguage();
        List<MultipleChoiceRule> multipleChoiceRules = topicSetDao.queryMultipleChoiceRule();
        HashMap<String, Object> map = new HashMap<>();
        map.put("language", compilerLanguages);
        map.put("judgeRule", multipleChoiceRules);
        return map;
    }

    @Override
    public List<TopicSetType> queryTopicSetType()
    {
        return topicSetDao.queryTopicSetType();
    }

    @Override
    public List<TopicSetLabel> queryTopicSetSort(Integer teacherId)
    {
        List<TopicSetLabel> topicSetLabels = topicSetDao.queryTopicSetSort(teacherId);
        return topicSetLabels;
    }

    @Override
    public TopicSetSpecific queryTopicSetInfoById(Integer teacherId, Integer topicSetId)
    {
        TopicSetSpecific topicSetSpecific = topicSetDao.queryTopicSetInfoById(teacherId, topicSetId);
        if (topicSetSpecific != null)
        {
            HashMap<String, Date> map = new HashMap<>();
            map.put("start", topicSetSpecific.getTopicSetStartTime());
            map.put("end", topicSetSpecific.getTopicSetEndTime());
            topicSetSpecific.setStatus(cwt.cwt(map));
        }
        return topicSetSpecific;
    }

    @Override
    public int updateTopicSetInfo(TopicSetInfo topicSetInfo)
    {
        return topicSetDao.updateTopicSetInfo(topicSetInfo);
    }

    @Override
    public void moveTopicSet(int[] ints)
    {
        for (int anInt : ints)
        {
            topicSetDao.moveTopicSet(anInt);
        }
    }

    @Override
    public List<AuthorityUserGroup> queryGroupByTopicSetId(Integer topicSetId)
    {
        return topicSetDao.queryGroupByTopicSetId(topicSetId);
    }

    @Override
    public List<UserGroupInfo> queryUnEmpowerGroup(Integer teacherId, Integer topicSetId)
    {
        return topicSetDao.queryUnEmpowerGroup(teacherId, topicSetId);
    }

    @Override
    public void addTopicSetEmpower(AddUserGroupAuthority groupAuthority)
    {
        UserGroupAuthority authorityInfo = groupAuthority.getAuthorityInfo();
        List<Integer> groupId = groupAuthority.getGroupId();
        for (Integer integer : groupId)
        {
            authorityInfo.setUserGroupId(integer);
            addPeople(integer);
            topicSetDao.addTopicSetEmpower(authorityInfo);
        }
    }

    private void addPeople(Integer integer)
    {

    }

    @Override
    public int updateByAuthorityId(UserGroupAuthority userGroupAuthority)
    {
        return topicSetDao.updateByAuthorityId(userGroupAuthority);
    }

    @Override
    public int deleteAuthorityId(Integer authorityId)
    {
        return topicSetDao.deleteAuthorityId(authorityId);
    }

    @Override
    public int addTopicSetSort(TopicSetLabel topicSetLabel)
    {
        String labelName = topicSetLabel.getLabelName();
        Integer teacherId = topicSetLabel.getTeacherId();
        return topicSetDao.addTopicSetSort(labelName, teacherId);
    }

    @Override
    public int updateTopicSetSort(TopicSetLabel topicSetLabel)
    {
        return topicSetDao.updateTopicSetSort(topicSetLabel);
    }

    @Override
    public int deleteTopicSetSortById(TopicSetLabel topicSetLabel)
    {
        return topicSetDao.deleteTopicSetSortById(topicSetLabel);
    }

    @Override
    public CommonResult queryExamineById()
    {
        return null;
    }

    @Override
    public CommonResult moveSortByTopicSetId()
    {
        return null;
    }

    @Override
    public CommonResult likeTopicSetById()
    {
        return null;
    }

    @Override
    public List<Object> queryTopicByTopicSetIdX(QTopicSetTest qTopicSetTest)
    {
        Integer testId = qTopicSetTest.getTestId();
        Integer topicSetId = qTopicSetTest.getTopicSetId();
        List<InfoOfTopic> list = new ArrayList<>();
        if (testId != null)
        {
            list = reBack(testId, false);
        }
        else
        {
            list = reBack(topicSetId, true);
        }
        return sort(list);
    }

    @Override
    public  ArrayList<TopicSetBaseInfo> queryStudentTopicSet(AccountInfo accountInfo)
    {
        Date start = null;
        Date end = null;
        List<TopicSetInfo> topicSetInfos = null;
        Integer accountTypeId = accountInfo.getAccountTypeId();
        Integer accountId = accountInfo.getAccountId();
        if ( accountTypeId == 1)
        {
            topicSetInfos = topicSetDao.queryTopicSetIdN(accountId);
        } else if (accountTypeId == 2){
            topicSetInfos = topicSetDao.queryTopicSetId(accountId);
        }
        ArrayList<TopicSetBaseInfo> result = new ArrayList<>();
        for (TopicSetInfo topicSetInfo : topicSetInfos)
        {
            Integer topicSetId = topicSetInfo.getTopicSetId();
            List<TopicSetSpecific> topicSetSpecifics = topicSetDao.queryStudentTopicSet(topicSetId);
            for (TopicSetSpecific topicSetSpecific : topicSetSpecifics)
            {
                HashMap<String, Date> map = new HashMap<>();
                start = topicSetSpecific.getTopicSetStartTime();
                end = topicSetSpecific.getTopicSetEndTime();
                map.put("start", start);
                map.put("end", end);
                String s = cwt.cwt(map);
                TopicSetBaseInfo topicSetBaseInfo = new TopicSetBaseInfo();
                topicSetBaseInfo.setTopicSetId(topicSetSpecific.getTopicSetId());
                topicSetBaseInfo.setTopicSetName(topicSetSpecific.getTopicSetName());
                topicSetBaseInfo.setTopicSetReleaseTime(topicSetSpecific.getTopicSetReleaseTime());
                topicSetBaseInfo.setUnitSName(topicSetSpecific.getUnitSchool());
                topicSetBaseInfo.setTeacherName(topicSetSpecific.getTeacherName());
                topicSetBaseInfo.setTopicSetDifficulty(topicSetSpecific.getTopicSetDifficulty());
                topicSetBaseInfo.setTopicSetStatus(s);
                topicSetBaseInfo.setTeacherId(topicSetSpecific.getTeacherId());
                result.add(topicSetBaseInfo);
            }
        }
        return result;
    }

    @Override
    public TopicSetSpecific queryStudentTopicSetX(TopicSetInfo topicSetInfo)
    {
        TopicSetSpecific topicSetSpecific = topicSetDao.queryStudentTopicSetX(topicSetInfo);
        if (topicSetSpecific != null)
        {
            System.out.println(topicSetSpecific.toString());
            HashMap<String, Date> map = new HashMap<>();
            map.put("start", topicSetSpecific.getTopicSetStartTime());
            map.put("end", topicSetSpecific.getTopicSetEndTime());
            topicSetSpecific.setStatus(cwt.cwt(map));
        }
        return topicSetSpecific;
    }

    private ArrayList<Object> sort(List<InfoOfTopic> list)
    {
        Integer oldTypeId = 0;
        ArrayList<Object> result = new ArrayList<>();
        ArrayList<InfoOfTopic> ls = null;
        for (InfoOfTopic infoOfTopic : list)
        {
            Integer topicTypeId = infoOfTopic.getTopicTypeId();
            if (oldTypeId.equals(topicTypeId))
            {
                ls.add(infoOfTopic);
                if (!result.contains(ls))
                {
                    result.add(ls);
                }
            }
            else
            {
                ls = new ArrayList<>();
                ls.add(infoOfTopic);
                oldTypeId = topicTypeId;
                if (!result.contains(ls))
                {
                    result.add(ls);
                }
            }
        }
        return result;
    }

    private List<InfoOfTopic> reBack(Integer id, boolean f)
    {
        List<InfoOfTopic> list = new ArrayList<>();
        List<QTestTopic> qTestTopics = null;
        if (f)
        {
            qTestTopics = topicSetDao.queryTopicSetIdX(id);
        }
        else
        {
            qTestTopics = topicSetDao.queryTopicSetIdJ(id);
        }
        for (int i = 0; i < qTestTopics.size(); i++)
        {
            InfoOfTopic infoOfTopic = new InfoOfTopic();
            QTestTopic qTestTopic = qTestTopics.get(i);
            Integer topicId = qTestTopic.getTopicId();///////
            Integer topicTypeId = qTestTopic.getTopicTypeId();///////
            infoOfTopic.setTopicId(topicId);//
            infoOfTopic.setTopicTypeId(topicTypeId);//
            infoOfTopic.setTopicFraction(qTestTopic.getTopicFraction());//
            infoOfTopic.setTopicTitle(qTestTopic.getTopicTitle());//
            Tow tow = topicSetDao.queryTopicByTopicSetIdX(topicId, topicTypeId);
            infoOfTopic.setTopicName(tow.getTopicName());//
            infoOfTopic.setTopicDescription(tow.getTopicDescription());//
            infoOfTopic.setTopicDifficulty(tow.getTopicDifficulty());//
            if (topicTypeId == 2 || topicTypeId == 3)
            {
                List<TopicOptionsContent> topicOptionsContents = topicSetDao.querySelect(topicId, topicTypeId);
                infoOfTopic.setTopicOptionsContent(topicOptionsContents);//
            }
            ArrayList<Object> knowledge = cwt.queryPoint(topicId, topicTypeId);
            infoOfTopic.setKnowledgePoint(knowledge);
            list.add(infoOfTopic);
        }
        return list;
    }
}