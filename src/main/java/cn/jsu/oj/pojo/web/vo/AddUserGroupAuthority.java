package cn.jsu.oj.pojo.web.vo;

import cn.jsu.oj.pojo.web.dto.UserGroupAuthority;

import java.io.Serializable;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/26 11:01
 * describe:
 */
public class AddUserGroupAuthority implements Serializable
{
    private List<Integer> groupId;
    private UserGroupAuthority authorityInfo;

    public AddUserGroupAuthority()
    {
    }

    public AddUserGroupAuthority(List<Integer> groupId, UserGroupAuthority authorityInfo)
    {
        this.groupId = groupId;
        this.authorityInfo = authorityInfo;
    }

    public List<Integer> getGroupId()
    {
        return groupId;
    }

    public void setGroupId(List<Integer> groupId)
    {
        this.groupId = groupId;
    }

    public UserGroupAuthority getAuthorityInfo()
    {
        return authorityInfo;
    }

    public void setAuthorityInfo(UserGroupAuthority authorityInfo)
    {
        this.authorityInfo = authorityInfo;
    }

    @Override
    public String toString()
    {
        return "AddUserGroupAuthority{" +
                "groupId=" + groupId +
                ", authorityInfo=" + authorityInfo +
                '}';
    }
}