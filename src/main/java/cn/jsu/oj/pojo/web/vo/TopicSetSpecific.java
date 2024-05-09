package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/25 10:17
 * describe:
 */
public class TopicSetSpecific implements Serializable {
    private Integer topicSetId;
    private String topicSetName;
    private Integer teacherId;
    private Integer topicSetTypeId;
    private Integer topicSetLabelId;
    private String topicSetNotice;
    private Date topicSetReleaseTime;
    private Date topicSetStartTime;
    private Date topicSetEndTime;
    private boolean topicSetLAnswerTime;
    private Integer topicSetAnswerTime;
    private Integer ruleId;
    private boolean topicSetRecycled;
    private boolean topicSetHiddenName;
    private boolean topicSetAdvance;
    private Integer topicSetDifficulty;
    private String typeInfo;
    private String unitSchool;
    private String teacherName;
    private String status;

    public TopicSetSpecific() {
    }

    public TopicSetSpecific(Integer topicSetId, String topicSetName, Integer teacherId, Integer topicSetTypeId, Integer topicSetLabelId, String topicSetNotice, Date topicSetReleaseTime, Date topicSetStartTime, Date topicSetEndTime, boolean topicSetLAnswerTime, Integer topicSetAnswerTime, Integer ruleId, boolean topicSetRecycled, boolean topicSetHiddenName, boolean topicSetAdvance, Integer topicSetDifficulty, String typeInfo, String unitSchool, String teacherName, String status) {
        this.topicSetId = topicSetId;
        this.topicSetName = topicSetName;
        this.teacherId = teacherId;
        this.topicSetTypeId = topicSetTypeId;
        this.topicSetLabelId = topicSetLabelId;
        this.topicSetNotice = topicSetNotice;
        this.topicSetReleaseTime = topicSetReleaseTime;
        this.topicSetStartTime = topicSetStartTime;
        this.topicSetEndTime = topicSetEndTime;
        this.topicSetLAnswerTime = topicSetLAnswerTime;
        this.topicSetAnswerTime = topicSetAnswerTime;
        this.ruleId = ruleId;
        this.topicSetRecycled = topicSetRecycled;
        this.topicSetHiddenName = topicSetHiddenName;
        this.topicSetAdvance = topicSetAdvance;
        this.topicSetDifficulty = topicSetDifficulty;
        this.typeInfo = typeInfo;
        this.unitSchool = unitSchool;
        this.teacherName = teacherName;
        this.status = status;
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

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getTopicSetTypeId() {
        return topicSetTypeId;
    }

    public void setTopicSetTypeId(Integer topicSetTypeId) {
        this.topicSetTypeId = topicSetTypeId;
    }

    public Integer getTopicSetLabelId() {
        return topicSetLabelId;
    }

    public void setTopicSetLabelId(Integer topicSetLabelId) {
        this.topicSetLabelId = topicSetLabelId;
    }

    public String getTopicSetNotice() {
        return topicSetNotice;
    }

    public void setTopicSetNotice(String topicSetNotice) {
        this.topicSetNotice = topicSetNotice;
    }

    public Date getTopicSetReleaseTime() {
        return topicSetReleaseTime;
    }

    public void setTopicSetReleaseTime(Date topicSetReleaseTime) {
        this.topicSetReleaseTime = topicSetReleaseTime;
    }

    public Date getTopicSetStartTime() {
        return topicSetStartTime;
    }

    public void setTopicSetStartTime(Date topicSetStartTime) {
        this.topicSetStartTime = topicSetStartTime;
    }

    public Date getTopicSetEndTime() {
        return topicSetEndTime;
    }

    public void setTopicSetEndTime(Date topicSetEndTime) {
        this.topicSetEndTime = topicSetEndTime;
    }

    public boolean isTopicSetLAnswerTime() {
        return topicSetLAnswerTime;
    }

    public void setTopicSetLAnswerTime(boolean topicSetLAnswerTime) {
        this.topicSetLAnswerTime = topicSetLAnswerTime;
    }

    public Integer getTopicSetAnswerTime() {
        return topicSetAnswerTime;
    }

    public void setTopicSetAnswerTime(Integer topicSetAnswerTime) {
        this.topicSetAnswerTime = topicSetAnswerTime;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public boolean isTopicSetRecycled() {
        return topicSetRecycled;
    }

    public void setTopicSetRecycled(boolean topicSetRecycled) {
        this.topicSetRecycled = topicSetRecycled;
    }

    public boolean isTopicSetHiddenName() {
        return topicSetHiddenName;
    }

    public void setTopicSetHiddenName(boolean topicSetHiddenName) {
        this.topicSetHiddenName = topicSetHiddenName;
    }

    public boolean isTopicSetAdvance() {
        return topicSetAdvance;
    }

    public void setTopicSetAdvance(boolean topicSetAdvance) {
        this.topicSetAdvance = topicSetAdvance;
    }

    public Integer getTopicSetDifficulty() {
        return topicSetDifficulty;
    }

    public void setTopicSetDifficulty(Integer topicSetDifficulty) {
        this.topicSetDifficulty = topicSetDifficulty;
    }

    public String getTypeInfo() {
        return typeInfo;
    }

    public void setTypeInfo(String typeInfo) {
        this.typeInfo = typeInfo;
    }

    public String getUnitSchool() {
        return unitSchool;
    }

    public void setUnitSchool(String unitSchool) {
        this.unitSchool = unitSchool;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TopicSetSpecific{" +
                "topicSetId=" + topicSetId +
                ", topicSetName='" + topicSetName + '\'' +
                ", teacherId=" + teacherId +
                ", topicSetTypeId=" + topicSetTypeId +
                ", topicSetLabelId=" + topicSetLabelId +
                ", topicSetNotice='" + topicSetNotice + '\'' +
                ", topicSetReleaseTime=" + topicSetReleaseTime +
                ", topicSetStartTime=" + topicSetStartTime +
                ", topicSetEndTime=" + topicSetEndTime +
                ", topicSetLAnswerTime=" + topicSetLAnswerTime +
                ", topicSetAnswerTime=" + topicSetAnswerTime +
                ", ruleId=" + ruleId +
                ", topicSetRecycled=" + topicSetRecycled +
                ", topicSetHiddenName=" + topicSetHiddenName +
                ", topicSetAdvance=" + topicSetAdvance +
                ", topicSetDifficulty=" + topicSetDifficulty +
                ", typeInfo='" + typeInfo + '\'' +
                ", unitSchool='" + unitSchool + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}