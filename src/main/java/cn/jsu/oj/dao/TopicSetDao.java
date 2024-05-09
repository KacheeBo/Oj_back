package cn.jsu.oj.dao;

import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/17 17:22
 * describe:
 */
@Mapper
@Repository
public interface TopicSetDao
{

    public int createTopicSet(TopicSetInfo topicSetInfo);

    public List<TopicSetBaseInfo> showTopicSet(@Param("teacherId") Integer teacherId, @Param("topicSetRecycled") boolean topicSetRecycled);

    public List<CompilerLanguage> queryLanguage();

    public List<MultipleChoiceRule> queryMultipleChoiceRule();

    public List<TopicSetType> queryTopicSetType();

    public List<TopicSetLabel> queryTopicSetSort(Integer teacherId);

    public TopicSetSpecific queryTopicSetInfoById(@Param("teacherId") Integer teacherId, @Param("topicSetId") Integer topicSetId);

    public int updateTopicSetInfo(TopicSetInfo topicSetInfo);

    public void moveTopicSet(int topicSetId);

    public List<AuthorityUserGroup> queryGroupByTopicSetId(Integer topicSetId);

    public List<UserGroupInfo> queryUnEmpowerGroup(@Param("teacherId") Integer teacherId, @Param("topicSetId") Integer topicSetId);

    public void addTopicSetEmpower(UserGroupAuthority userGroupAuthority);

    public int updateByAuthorityId(UserGroupAuthority userGroupAuthority);

    public int deleteAuthorityId(Integer authorityId);

    public int addTopicSetSort(@Param("labelName") String labelName, @Param("teacherId") Integer teacherId);

    public int updateTopicSetSort(TopicSetLabel topicSetLabel);

    public int deleteTopicSetSortById(TopicSetLabel topicSetLabel);

    public CommonResult queryExamineById();

    public CommonResult moveSortByTopicSetId();

    public CommonResult likeTopicSetById();

    public Tow queryTopicByTopicSetIdX(@Param("topicId") Integer topicId, @Param("topicTypeId") Integer topicTypeId);

    public List<QTestTopic> queryTopicSetIdX(@Param("topicSetId") Integer topicSetId);

    public List<TopicOptionsContent> querySelect(@Param("topicId") Integer topicId, @Param("topicTypeId") Integer topicTypeId);

    public List<QTestTopic> queryTopicSetIdJ(@Param("testId") Integer testId);

    public List<TopicSetInfo> queryTopicSetId(@Param("accountId") Integer accountId);
    public List<TopicSetInfo> queryTopicSetIdN(@Param("accountId") Integer accountId);
    public List<TopicSetSpecific> queryStudentTopicSet(Integer topicSetId);

    public TopicSetSpecific queryStudentTopicSetX(TopicSetInfo topicSetInfo);
}
