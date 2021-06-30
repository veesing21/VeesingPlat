package com.veesing.sms.domain;

import java.io.Serializable;
import java.util.Date;

public class SmsReplyDO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String recPhone;
	private String recContent;
	private Date recTime;
	private Long sentId;
	private Long customerId;
	private Long createUserId;
	private String taskId;
	private Long preId;
	private Date sentTime;
	private String content;
	private String companyName;
	private String contactName;
	private String username;
	private String telephone;
	private String recTimeStr;
	private String sentTimeStr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRecPhone() {
		return recPhone;
	}

	public void setRecPhone(String recPhone) {
		this.recPhone = recPhone;
	}

	public String getRecContent() {
		return recContent;
	}

	public void setRecContent(String recContent) {
		this.recContent = recContent;
	}

	public Long getSentId() {
		return sentId;
	}

	public void setSentId(Long sentId) {
		this.sentId = sentId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Long getPreId() {
		return preId;
	}

	public void setPreId(Long preId) {
		this.preId = preId;
	}

	public Date getRecTime() {
		return recTime;
	}

	public void setRecTime(Date recTime) {
		this.recTime = recTime;
	}

	public Date getSentTime() {
		return sentTime;
	}

	public void setSentTime(Date sentTime) {
		this.sentTime = sentTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRecTimeStr() {
		return recTimeStr;
	}

	public void setRecTimeStr(String recTimeStr) {
		this.recTimeStr = recTimeStr;
	}

	public String getSentTimeStr() {
		return sentTimeStr;
	}

	public void setSentTimeStr(String sentTimeStr) {
		this.sentTimeStr = sentTimeStr;
	}


	@Override
	public String toString() {
		return "SmsReceivedDO{" +
				"id=" + id +
				", recPhone='" + recPhone + '\'' +
				", recContent='" + recContent + '\'' +
				", recTime=" + recTime +
				", sentId=" + sentId +
				", customerId=" + customerId +
				", createUserId=" + createUserId +
				", taskId='" + taskId + '\'' +
				", preId=" + preId +
				", sentTime=" + sentTime +
				", content='" + content + '\'' +
				", companyName='" + companyName + '\'' +
				", contactName='" + contactName + '\'' +
				", username='" + username + '\'' +
				", telephone='" + telephone + '\'' +
				", recTimeStr='" + recTimeStr + '\'' +
				", sentTimeStr='" + sentTimeStr + '\'' +
				'}';
	}
}
