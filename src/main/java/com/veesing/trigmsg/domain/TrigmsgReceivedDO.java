package com.veesing.trigmsg.domain;

import java.io.Serializable;
import java.util.Date;


public class TrigmsgReceivedDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String recPhone;

	private String recContent;

	private Date recTime;

	private Long sentId;

	private Long customerId;

	private String taskId;

	private Date sentTime;

	private String content;

	private String status;

	private String companyName;

	private String contactName;

	private String username;

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

	public Date getRecTime() {
		return recTime;
	}

	public void setRecTime(Date recTime) {
		this.recTime = recTime;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "TrigmsgReceivedDO [id=" + id + ", recPhone=" + recPhone + ", recContent=" + recContent + ", recTime="
				+ recTime + ", sentId=" + sentId + ", customerId=" + customerId + ", taskId=" + taskId + ", sentTime="
				+ sentTime + ", content=" + content + ", status=" + status + ", companyName=" + companyName
				+ ", contactName=" + contactName + ", username=" + username + "]";
	}




}
