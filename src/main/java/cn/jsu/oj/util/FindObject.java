package cn.jsu.oj.util;

import cn.jsu.oj.pojo.web.dto.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author: suixuexue
 * @date: 2020/12/27 18:10
 * describe:
 */
@Component
public class FindObject
{
    public HashMap findObject(Integer topicTypeId, Object o)
    {
        HashMap<Integer, Object> map = new HashMap<>();
        TopicJudge topicJudge = null;
        TopicSingleOptions topicSingleOptions = null;
        TopicDoubleOptions topicDoubleOptions = null;
        TopicFill topicFill = null;
        TopicFillProgram topicFillProgram = null;
        TopicProgram topicProgram = null;
        TopicFunction topicFunction = null;
        switch (topicTypeId)
        {
            case 1:
                topicJudge = (TopicJudge) o;
                break;
            case 2:
                topicSingleOptions = (TopicSingleOptions) o;
                break;
            case 3:
                topicDoubleOptions = (TopicDoubleOptions) o;
                break;
            case 4:
                topicFill = (TopicFill) o;
                break;
            case 5:
                topicFillProgram = (TopicFillProgram) o;
                break;
            case 6:
                topicProgram = (TopicProgram) o;
                break;
            case 7:
                topicFunction = (TopicFunction) o;
                break;
        }
        return map;
    }
}
