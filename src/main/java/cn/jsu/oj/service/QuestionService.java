package cn.jsu.oj.service;

import cn.jsu.oj.pojo.web.dto.QTestTopic;
import cn.jsu.oj.pojo.web.vo.CommonResult;

import java.util.HashMap;

/**
 * @author: suixuexue
 * @date: 2020/12/28 10:10
 * describe:
 */
public interface QuestionService
{

    public HashMap showTopicBaseInfo(QTestTopic qTestTopic);

    public CommonResult makeTopic();

    public CommonResult showLastTopicSubmit();

    public CommonResult showTopicSetTopicList();

    public CommonResult showTopicSubmitList();

    public CommonResult queryTopicSetOneSubmitList();

}
