package cn.jsu.oj.dao;

import cn.jsu.oj.pojo.web.dto.SubmitTopic;
import cn.jsu.oj.pojo.web.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/30 17:30
 * describe:
 */
@Mapper
@Repository
public interface MakeDao
{
    public void addMakeTopic(SubmitTopic submitTopic);

    public MakeRequest queryTopicBaseInfoX(MakeRequest makeRequest);

    public WAMax queryWeight(TopicMake topicMake);

    public Long querySerialNumber(SubmitTopic submitTopic);

    public MakeResult showTopicSubmit(SubmitTopic submitTopic);

    public List<PointResult> showPoint(SubmitTopic submitTopic);

    public List<ListOfResult> showTopicSubmitList(SubmitTopic submitTopic);

    public List<ListOfResult> showTopicSubmitListWithNoType(SubmitTopic submitTopic);

    public List<SubmitTopic> queryIdAndTId(SubmitTopic submitTopic);

    public List<SubmitTopic> queryIdAndTIdNoAccount(SubmitTopic submitTopic);
}
