package cn.jsu.oj.service;

import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/17 17:16
 * describe:
 * 题目集接口
 */
public interface TopicSetService
{

    public int createTopicSet(TopicSetInfo topicSetInfo);

    public List<TopicSetBaseInfo> showTopicSet(Integer teacherId, boolean topicSetRecycled);

    public HashMap queryLanguage();

    public List<TopicSetType> queryTopicSetType();

    public List<TopicSetLabel> queryTopicSetSort(Integer teacherId);

    public TopicSetSpecific queryTopicSetInfoById(Integer teacherId, Integer topicSetId);

    public int updateTopicSetInfo(TopicSetInfo topicSetInfo);

    public void moveTopicSet(int[] ints);

    public List<AuthorityUserGroup> queryGroupByTopicSetId(Integer topicSetId);

    public List<UserGroupInfo> queryUnEmpowerGroup(Integer teacherId, Integer topicSetId);

    public void addTopicSetEmpower(AddUserGroupAuthority groupAuthority);

    public int updateByAuthorityId(UserGroupAuthority userGroupAuthority);

    public int deleteAuthorityId(Integer authorityId);

    public int addTopicSetSort(TopicSetLabel topicSetLabel);

    public int updateTopicSetSort(TopicSetLabel topicSetLabel);

    public int deleteTopicSetSortById(TopicSetLabel topicSetLabel);

    public CommonResult queryExamineById();

    public CommonResult moveSortByTopicSetId();

    public CommonResult likeTopicSetById();

    public List<Object> queryTopicByTopicSetIdX(QTopicSetTest qTopicSetTest);

    public ArrayList<TopicSetBaseInfo> queryStudentTopicSet(AccountInfo accountInfo);

    public TopicSetSpecific queryStudentTopicSetX(TopicSetInfo topicSetInfo);
}