package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
<<<<<<< HEAD
 *
 * @Author: wws
 * @Date: 2020/12/28 11:40
 * describe:
 *
 */
public class ShowGroupEmpowerVO implements Serializable {
    private String topicSetName;
    private Integer authorityId;
    private Integer userGroupId;
    private Boolean authoritySubject;
    private Boolean authorityDetails;
    private Boolean authorityList;
    private Boolean authorityAnswer;
    private Boolean authorityCorrect;
    private Boolean authorityRank;
    private Boolean authorityJurisdiction;

    public ShowGroupEmpowerVO() {
    }

    public ShowGroupEmpowerVO(String topicSetName, Integer authorityId, Integer userGroupId, Boolean authoritySubject, Boolean authorityDetails, Boolean authorityList, Boolean authorityAnswer, Boolean authorityCorrect, Boolean authorityRank, Boolean authorityJurisdiction) {
        this.topicSetName = topicSetName;
        this.authorityId = authorityId;
        this.userGroupId = userGroupId;
        this.authoritySubject = authoritySubject;
        this.authorityDetails = authorityDetails;
        this.authorityList = authorityList;
        this.authorityAnswer = authorityAnswer;
        this.authorityCorrect = authorityCorrect;
        this.authorityRank = authorityRank;
        this.authorityJurisdiction = authorityJurisdiction;
    }

    public String getTopicSetName() {
        return topicSetName;
    }

    public void setTopicSetName(String topicSetName) {
        this.topicSetName = topicSetName;
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public Boolean getAuthoritySubject() {
        return authoritySubject;
    }

    public void setAuthoritySubject(Boolean authoritySubject) {
        this.authoritySubject = authoritySubject;
    }

    public Boolean getAuthorityDetails() {
        return authorityDetails;
    }

    public void setAuthorityDetails(Boolean authorityDetails) {
        this.authorityDetails = authorityDetails;
    }

    public Boolean getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(Boolean authorityList) {
        this.authorityList = authorityList;
    }

    public Boolean getAuthorityAnswer() {
        return authorityAnswer;
    }

    public void setAuthorityAnswer(Boolean authorityAnswer) {
        this.authorityAnswer = authorityAnswer;
    }

    public Boolean getAuthorityCorrect() {
        return authorityCorrect;
    }

    public void setAuthorityCorrect(Boolean authorityCorrect) {
        this.authorityCorrect = authorityCorrect;
    }

    public Boolean getAuthorityRank() {
        return authorityRank;
    }

    public void setAuthorityRank(Boolean authorityRank) {
        this.authorityRank = authorityRank;
    }

    public Boolean getAuthorityJurisdiction() {
        return authorityJurisdiction;
    }

    public void setAuthorityJurisdiction(Boolean authorityJurisdiction) {
        this.authorityJurisdiction = authorityJurisdiction;
    }

    @Override
    public String toString() {
        return "ShowGroupEmpowerVO{" +
                "topicSetName='" + topicSetName + '\'' +
                ", authorityId=" + authorityId +
                ", userGroupId=" + userGroupId +
                ", authoritySubject=" + authoritySubject +
                ", authorityDetails=" + authorityDetails +
                ", authorityList=" + authorityList +
                ", authorityAnswer=" + authorityAnswer +
                ", authorityCorrect=" + authorityCorrect +
                ", authorityRank=" + authorityRank +
                ", authorityJurisdiction=" + authorityJurisdiction +
                '}';
    }
}
