package cn.jsu.oj.dao;

import cn.jsu.oj.pojo.web.dto.TestPointInfo;
import cn.jsu.oj.pojo.web.dto.TopicProgram;
import cn.jsu.oj.pojo.web.dto.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/29 9:58
 * describe:
 */
@Mapper
@Repository
public interface FileDao
{
    public TestPointInfo query(TestPointInfo testPointInfo);

    public void story(TestPointInfo testPointInfo);

    public int update(TestPointInfo testPointInfo);

    public void deletePre(TestPointInfo testPointInfo);

    // 上传用户头像
    public int insertImg(UserInfo UserInfo);

    public List<UserInfo> test();

    public void addOneKnowLedgeJ(@Param("knowledgeType") String knowledgeType, @Param("knowledgeFatherId") Integer knowledgeFatherId);

    public TopicProgram queryTP(Integer topicId);

    public void addWeigth(TopicProgram topicProgram);
}
