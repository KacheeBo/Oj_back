package cn.jsu.oj.service;

import cn.jsu.oj.pojo.web.dto.SubmitTopic;
import cn.jsu.oj.pojo.web.vo.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/30 17:31
 * describe:
 */
public interface MakeService
{
    public void makeTopic(TopicMake topicMake, HttpServletResponse response);

    public MakeRequest queryTopicBaseInfoX(MakeRequest makeRequest);

    public Long querySerialNumber(SubmitTopic submitTopic);

    public MakeResult showTopicSubmit(SubmitTopic submitTopic);

    public List<ListOfResult> showTopicSubmitList(SubmitTopic submitTopic);

    public void submitAllResult(List<TopicMake> topicMakes);
}
