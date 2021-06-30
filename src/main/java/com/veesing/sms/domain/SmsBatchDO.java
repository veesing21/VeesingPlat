package com.veesing.sms.domain;

import java.io.Serializable;
import java.util.Date;

public class SmsBatchDO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private Long customerId;

	private Integer cerStatus;

	private String opinion;

	private String remark;

	private String phones;

	private String content;

	private Date jobTime;

	private Integer isLoop;

	private Date subTime;

	private Date sendTime;

	private Integer phoneNum;

	private Integer costNum;

	private Date createTime;

	private Long createUserId;

	private String taskId;

	private Integer type;

	private Long proId;

	private Integer sendStatus;

	private Long channelId;

	private String tplContent;

	private String companyName;

	private String contactName;

	private Long threadId;

	private Date identifyTime;

	private Long identifyUserId;

	private String shieldJson;

	private String ip;

	private Integer contentLength;

	private Integer contentSize;

	private Integer isApi;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Integer getCerStatus() {
		return cerStatus;
	}

	public void setCerStatus(Integer cerStatus) {
		this.cerStatus = cerStatus;
	}

	public String getPhones() {
		return phones;
	}

	public void setPhones(String phones) {
		this.phones = phones;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getJobTime() {
		return jobTime;
	}

	public void setJobTime(Date jobTime) {
		this.jobTime = jobTime;
	}

	public Integer getIsLoop() {
		return isLoop;
	}

	public void setIsLoop(Integer isLoop) {
		this.isLoop = isLoop;
	}

	public Date getSubTime() {
		return subTime;
	}

	public void setSubTime(Date subTime) {
		this.subTime = subTime;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Integer getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(Integer phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Integer getCostNum() {
		return costNum;
	}

	public void setCostNum(Integer costNum) {
		this.costNum = costNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getProId() {
		return proId;
	}

	public void setProId(Long proId) {
		this.proId = proId;
	}

	public Integer getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(Integer sendStatus) {
		this.sendStatus = sendStatus;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public String getTplContent() {
		return tplContent;
	}

	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getThreadId() {
		return threadId;
	}

	public void setThreadId(Long threadId) {
		this.threadId = threadId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Date getIdentifyTime() {
		return identifyTime;
	}

	public void setIdentifyTime(Date identifyTime) {
		this.identifyTime = identifyTime;
	}

	public Long getIdentifyUserId() {
		return identifyUserId;
	}

	public void setIdentifyUserId(Long identifyUserId) {
		this.identifyUserId = identifyUserId;
	}

	public String getShieldJson() {
		return shieldJson;
	}

	public void setShieldJson(String shieldJson) {
		this.shieldJson = shieldJson;
	}

	public Integer getContentLength() {
		return contentLength;
	}

	public void setContentLength(Integer contentLength) {
		this.contentLength = contentLength;
	}

	public Integer getContentSize() {
		return contentSize;
	}

	public void setContentSize(Integer contentSize) {
		this.contentSize = contentSize;
	}

	public Integer getIsApi() {
		return isApi;
	}

	public void setIsApi(Integer isApi) {
		this.isApi = isApi;
	}

	@Override
	public String toString() {
		return "SmsSentPreDO [id=" + id + ", customerId=" + customerId + ", cerStatus=" + cerStatus + ", opinion="
				+ opinion + ", remark=" + remark + ", phones=" + phones + ", content=" + content + ", jobTime="
				+ jobTime + ", isLoop=" + isLoop + ", subTime=" + subTime + ", sendTime=" + sendTime + ", phoneNum="
				+ phoneNum + ", costNum=" + costNum + ", createTime=" + createTime + ", createUserId=" + createUserId
				+ ", taskId=" + taskId + ", type=" + type + ", proId=" + proId + ", sendStatus=" + sendStatus
				+ ", channelId=" + channelId + ", tplContent=" + tplContent + ", companyName=" + companyName
				+ ", contactName=" + contactName + ", threadId=" + threadId + ", identifyTime=" + identifyTime
				+ ", identifyUserId=" + identifyUserId + ", shieldJson=" + shieldJson + ", ip=" + ip
				+ ", contentLength=" + contentLength + ", contentSize=" + contentSize + ", isApi=" + isApi + "]";
	}

}
