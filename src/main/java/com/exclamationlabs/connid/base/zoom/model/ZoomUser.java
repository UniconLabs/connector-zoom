/*
    Copyright 2020 Exclamation Labs

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.exclamationlabs.connid.base.zoom.model;

import com.exclamationlabs.connid.base.connector.model.IdentityModel;
import com.google.gson.annotations.SerializedName;
import java.util.Set;

public class ZoomUser implements IdentityModel {

  @SerializedName("created_at")
  private String createdAt;

  private String email;
  private ZoomFeature feature;

  @SerializedName("first_name")
  private String firstName;

  @SerializedName("group_ids")
  private Set<String> groupIds;

  private transient Set<String> groupsToAdd;
  private transient Set<String> groupsToRemove;
  private String id;
  private transient ZoomPhoneUserProfile outboundAdd;
  private transient ZoomPhoneUserProfile outboundRemove;
  private String language;

  @SerializedName("last_login_time")
  private String lastLoginTime;

  @SerializedName("last_name")
  private String lastName;

  private String password;

  @SerializedName("pmi")
  private Long personalMeetingId;

  @SerializedName("phone_country")
  private String phoneCountry;

  @SerializedName("phone_number")
  private String phoneNumber;

  private transient ZoomPhoneUserProfile phoneProfile;
  private transient ZoomPhoneSite site;
  private String status;
  private String timezone;
  private Integer type;
  private String verified;

  private String company;

  @SerializedName("dept")
  private String department;

  @SerializedName("job_title")
  private String jobTitle;

  private String location;
  private String manager;
  private String jid;

  @SerializedName("last_client_version")
  private String lastClientVersion;

  @SerializedName("display_name")
  private String displayName;

  @SerializedName("employee_unique_id")
  private String employeeUniqueId;

  @SerializedName("personal_meeting_url")
  private String personalMeetingUrl;

  @SerializedName("pic_url")
  private String picUrl;

  private String pronouns;

  @SerializedName("pronouns_option")
  private Integer pronounsOption;

  @SerializedName("role_id")
  private String roleId;

  @SerializedName("role_name")
  private String roleName;

  @SerializedName("account_id")
  private String accountId;

  @SerializedName("cost_center")
  private String costCenter;

  @SerializedName("use_pmi")
  private Boolean usePmi;

  @SerializedName("vanity_url")
  private String vanityUrl;


  //Getters and Setters
  @Override
  public String getIdentityIdValue() {
    return getId();
  }

  @Override
  public String getIdentityNameValue() {
    return getEmail();
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmployeeUniqueId() {
    return employeeUniqueId;
  }

  public void setEmployeeUniqueId(String employeeUniqueId) {
    this.employeeUniqueId = employeeUniqueId;
  }

  public ZoomFeature getFeature() {
    return feature;
  }

  public void setFeature(ZoomFeature feature) {
    this.feature = feature;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Set<String> getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(Set<String> groupIds) {
    this.groupIds = groupIds;
  }

  public Set<String> getGroupsToAdd() {
    return groupsToAdd;
  }

  public void setGroupsToAdd(Set<String> groupsToAdd) {
    this.groupsToAdd = groupsToAdd;
  }

  public Set<String> getGroupsToRemove() {
    return groupsToRemove;
  }

  public void setGroupsToRemove(Set<String> groupsToRemove) {
    this.groupsToRemove = groupsToRemove;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getJid() {
    return jid;
  }

  public void setJid(String jid) {
    this.jid = jid;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getLastClientVersion() {
    return lastClientVersion;
  }

  public void setLastClientVersion(String lastClientVersion) {
    this.lastClientVersion = lastClientVersion;
  }

  public String getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(String lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public ZoomPhoneUserProfile getOutboundAdd() {
    return outboundAdd;
  }

  public void setOutboundAdd(ZoomPhoneUserProfile outboundAdd) {
    this.outboundAdd = outboundAdd;
  }

  public ZoomPhoneUserProfile getOutboundRemove() {
    return outboundRemove;
  }

  public void setOutboundRemove(ZoomPhoneUserProfile outboundRemove) {
    this.outboundRemove = outboundRemove;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Long getPersonalMeetingId() {
    return personalMeetingId;
  }

  public void setPersonalMeetingId(Long personalMeetingId) {
    this.personalMeetingId = personalMeetingId;
  }

  public String getPersonalMeetingUrl() {
    return personalMeetingUrl;
  }

  public void setPersonalMeetingUrl(String personalMeetingUrl) {
    this.personalMeetingUrl = personalMeetingUrl;
  }

  public String getPhoneCountry() {
    return phoneCountry;
  }

  public void setPhoneCountry(String phoneCountry) {
    this.phoneCountry = phoneCountry;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ZoomPhoneUserProfile getPhoneProfile() {
    return phoneProfile;
  }

  public void setPhoneProfile(ZoomPhoneUserProfile phoneProfile) {
    this.phoneProfile = phoneProfile;
  }

  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }

  public String getPronouns() {
    return pronouns;
  }

  public void setPronouns(String pronouns) {
    this.pronouns = pronouns;
  }

  public Integer getPronounsOption() {
    return pronounsOption;
  }

  public void setPronounsOption(Integer pronounsOption) {
    this.pronounsOption = pronounsOption;
  }

  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public ZoomPhoneSite getSite() {
    return site;
  }

  public void setSite(ZoomPhoneSite site) {
    this.site = site;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Boolean getUsePmi() {
    return usePmi;
  }

  public void setUsePmi(Boolean usePmi) {
    this.usePmi = usePmi;
  }

  public String getVanityUrl() {
    return vanityUrl;
  }

  public void setVanityUrl(String vanityUrl) {
    this.vanityUrl = vanityUrl;
  }

  public String getVerified() {
    return verified;
  }

  public void setVerified(String verified) {
    this.verified = verified;
  }
}
