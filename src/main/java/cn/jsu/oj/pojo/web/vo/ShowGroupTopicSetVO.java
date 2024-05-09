package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;
import java.util.Date;

/**
<<<<<<< HEAD
 *
 * @Author: wws
 * @Date: 2020/12/27 21:06
 * describe:
 *
 */
public class ShowGroupTopicSetVO implements Serializable {
    private Integer topicSetId;
    private String topicSetName;
    private Date topicSetReleaseTime;

    public ShowGroupTopicSetVO() {
    }

    public ShowGroupTopicSetVO(Integer topicSetId, String topicSetName, Date topicSetReleaseTime) {
        this.topicSetId = topicSetId;
        this.topicSetName = topicSetName;
        this.topicSetReleaseTime = topicSetReleaseTime;
    }

    public Integer getTopicSetId() {
        return topicSetId;
    }

    public void setTopicSetId(Integer topicSetId) {
        this.topicSetId = topicSetId;
    }

    public String getTopicSetName() {
        return topicSetName;
    }

    public void setTopicSetName(String topicSetName) {
        this.topicSetName = topicSetName;
    }

    public Date getTopicSetReleaseTime() {
        return topicSetReleaseTime;
    }

    public void setTopicSetReleaseTime(Date topicSetReleaseTime) {
        this.topicSetReleaseTime = topicSetReleaseTime;
    }

    @Override
    public String toString() {
        return "ShowGroupTopicSetVO{" +
                "topicSetId=" + topicSetId +
                ", topicSetName='" + topicSetName + '\'' +
                ", topicSetReleaseTime=" + topicSetReleaseTime +
                '}';
    }
}
