package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;
import java.util.Date;

/**
*
* @Author: wws
* @Date: 2020/12/26 22:45
* describe:用户组邀请码信息
*/
public class UserGroupInviteCode implements Serializable {
   private Integer inviteCodeId;
   private Date inviteCodeTime;
   private String inviteCodeContent;
   private Integer userGroupId;

   public UserGroupInviteCode() {
   }

   public UserGroupInviteCode(Integer inviteCodeId, Date inviteCodeTime, String inviteCodeContent, Integer userGroupId) {
      this.inviteCodeId = inviteCodeId;
      this.inviteCodeTime = inviteCodeTime;
      this.inviteCodeContent = inviteCodeContent;
      this.userGroupId = userGroupId;
   }

   public Integer getInviteCodeId() {
      return inviteCodeId;
   }

   public void setInviteCodeId(Integer inviteCodeId) {
      this.inviteCodeId = inviteCodeId;
   }

   public Date getInviteCodeTime() {
      return inviteCodeTime;
   }

   public void setInviteCodeTime(Date inviteCodeTime) {
      this.inviteCodeTime = inviteCodeTime;
   }

   public String getInviteCodeContent() {
      return inviteCodeContent;
   }

   public void setInviteCodeContent(String inviteCodeContent) {
      this.inviteCodeContent = inviteCodeContent;
   }

   public Integer getUserGroupId() {
      return userGroupId;
   }

   public void setUserGroupId(Integer userGroupId) {
      this.userGroupId = userGroupId;
   }

   @Override
   public String toString() {
      return "UserGroupInviteCode{" +
              "inviteCodeId=" + inviteCodeId +
              ", inviteCodeTime=" + inviteCodeTime +
              ", inviteCodeContent='" + inviteCodeContent + '\'' +
              ", userGroupId=" + userGroupId +
              '}';
   }
}
