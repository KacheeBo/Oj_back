package cn.jsu.oj.pojo.web.vo;

import cn.jsu.oj.pojo.web.dto.UserGroupAuthority;

/**
 * @author: suixuexue
 * @date: 2020/12/26 10:37
 * describe:
 */
public class AuthorityUserGroup extends UserGroupAuthority
{
    private String userGroupName;
    private AddUserGroupAuthority authorityInfo;

    public AuthorityUserGroup()
    {
    }

    public AuthorityUserGroup(String userGroupName, AddUserGroupAuthority authorityInfo)
    {
        this.userGroupName = userGroupName;
        this.authorityInfo = authorityInfo;
    }

    public String getUserGroupName()
    {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName)
    {
        this.userGroupName = userGroupName;
    }

    public AddUserGroupAuthority getAuthorityInfo()
    {
        return authorityInfo;
    }

    public void setAuthorityInfo(AddUserGroupAuthority authorityInfo)
    {
        this.authorityInfo = authorityInfo;
    }

    public AuthorityUserGroup(Integer authorityId, Integer userGroupId, Integer topicSetId, boolean authoritySubject, boolean authorityAnswer, boolean authorityList, boolean authorityDetails, boolean authorityCorrect, boolean authorityRank, boolean authorityJurisdiction, String userGroupName, AddUserGroupAuthority authorityInfo)
    {
        super(authorityId, userGroupId, topicSetId, authoritySubject, authorityAnswer, authorityList, authorityDetails, authorityCorrect, authorityRank, authorityJurisdiction);
        this.userGroupName = userGroupName;
        this.authorityInfo = authorityInfo;
    }

    @Override
    public String toString()
    {
        return "AuthorityUserGroup{" +
                "userGroupName='" + userGroupName + '\'' +
                ", authorityInfo=" + authorityInfo +
                '}';
    }
}