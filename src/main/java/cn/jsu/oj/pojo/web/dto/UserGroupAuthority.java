package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/26 10:25
 * describe:
 */
public class UserGroupAuthority implements Serializable {
    private Integer authorityId;
    private Integer userGroupId;
    private Integer topicSetId;
    private boolean authoritySubject;
    private boolean authorityAnswer;
    private boolean authorityList;
    private boolean authorityDetails;
    private boolean authorityCorrect;
    private boolean authorityRank;
    private boolean authorityJurisdiction;

    public UserGroupAuthority() {
    }

    public UserGroupAuthority(Integer authorityId, Integer userGroupId, Integer topicSetId, boolean authoritySubject, boolean authorityAnswer, boolean authorityList, boolean authorityDetails, boolean authorityCorrect, boolean authorityRank, boolean authorityJurisdiction) {
        this.authorityId = authorityId;
        this.userGroupId = userGroupId;
        this.topicSetId = topicSetId;
        this.authoritySubject = authoritySubject;
        this.authorityAnswer = authorityAnswer;
        this.authorityList = authorityList;
        this.authorityDetails = authorityDetails;
        this.authorityCorrect = authorityCorrect;
        this.authorityRank = authorityRank;
        this.authorityJurisdiction = authorityJurisdiction;
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

    public Integer getTopicSetId() {
        return topicSetId;
    }

    public void setTopicSetId(Integer topicSetId) {
        this.topicSetId = topicSetId;
    }

    public boolean isAuthoritySubject() {
        return authoritySubject;
    }

    public void setAuthoritySubject(boolean authoritySubject) {
        this.authoritySubject = authoritySubject;
    }

    public boolean isAuthorityAnswer() {
        return authorityAnswer;
    }

    public void setAuthorityAnswer(boolean authorityAnswer) {
        this.authorityAnswer = authorityAnswer;
    }

    public boolean isAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(boolean authorityList) {
        this.authorityList = authorityList;
    }

    public boolean isAuthorityDetails() {
        return authorityDetails;
    }

    public void setAuthorityDetails(boolean authorityDetails) {
        this.authorityDetails = authorityDetails;
    }

    public boolean isAuthorityCorrect() {
        return authorityCorrect;
    }

    public void setAuthorityCorrect(boolean authorityCorrect) {
        this.authorityCorrect = authorityCorrect;
    }

    public boolean isAuthorityRank() {
        return authorityRank;
    }

    public void setAuthorityRank(boolean authorityRank) {
        this.authorityRank = authorityRank;
    }

    public boolean isAuthorityJurisdiction() {
        return authorityJurisdiction;
    }

    public void setAuthorityJurisdiction(boolean authorityJurisdiction) {
        this.authorityJurisdiction = authorityJurisdiction;
    }

    @Override
    public String toString() {
        return "UserGroupAuthority{" +
                "authorityId=" + authorityId +
                ", userGroupId=" + userGroupId +
                ", topicSetId=" + topicSetId +
                ", authoritySubject=" + authoritySubject +
                ", authorityAnswer=" + authorityAnswer +
                ", authorityList=" + authorityList +
                ", authorityDetails=" + authorityDetails +
                ", authorityCorrect=" + authorityCorrect +
                ", authorityRank=" + authorityRank +
                ", authorityJurisdiction=" + authorityJurisdiction +
                '}';
    }
}
