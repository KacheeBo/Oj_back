package cn.jsu.oj.dao;

import cn.jsu.oj.pojo.web.dto.QTestTopic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: suixuexue
 * @date: 2020/12/28 10:09
 * describe:
 */
@Mapper
@Repository
public interface QuestionDao
{

    public QTestTopic showTopicBaseInfo(QTestTopic qTestTopic);
}
