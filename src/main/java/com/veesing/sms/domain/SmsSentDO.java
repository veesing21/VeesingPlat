package com.veesing.sms.domain;

import java.io.Serializable;
import java.util.Date;

public class SmsSentDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer type;
	private Long amount;
	private String content;
	private String phone;
	private Integer sendStatus;
	private Date sendTime;
	private Long customerId;
	private Long createUserId;
	private Long proId;
	private String taskId;
	private Long preId;
	private Integer numSection;
	private String provinceCity;
	private Long packageId;
	private Long channleId;
	private Long passId;
	private String port;
	private String receiptTime;
	private String receiptCode;
	private Integer receiptStatus;
	private Date pushTime;
	private String pushResult;
	private String companyName;
	private String contactName;
	private String username;
	private Date subTime;
	private String remark;
	private String groupName;
	private String groupRemark;
	private String passName;
	private Integer contentLength;
	private Integer contentSize;
	private Integer isApi;

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final Integer getType() {
		return type;
	}

	public final void setType(Integer type) {
		this.type = type;
	}

	public final Long getAmount() {
		return amount;
	}

	public final void setAmount(Long amount) {
		this.amount = amount;
	}

	public final String getContent() {
		return content;
	}

	public final void setContent(String content) {
		this.content = content;
	}

	public final String getPhone() {
		return phone;
	}

	public final void setPhone(String phone) {
		this.phone = phone;
	}

	public final Long getCustomerId() {
		return customerId;
	}

	public final void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public final Long getProId() {
		return proId;
	}

	public final void setProId(Long proId) {
		this.proId = proId;
	}

	public final String getTaskId() {
		return taskId;
	}

	public final void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public final Long getPreId() {
		return preId;
	}

	public final void setPreId(Long preId) {
		this.preId = preId;
	}

	public final Long getPackageId() {
		return packageId;
	}

	public final void setPackageId(Long packageId) {
		this.packageId = packageId;
	}

	public final Long getChannleId() {
		return channleId;
	}

	public final void setChannleId(Long channleId) {
		this.channleId = channleId;
	}

	public final Long getPassId() {
		return passId;
	}

	public final void setPassId(Long passId) {
		this.passId = passId;
	}

	public final Integer getNumSection() {
		return numSection;
	}

	public final void setNumSection(Integer numSection) {
		this.numSection = numSection;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Integer getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(Integer sendStatus) {
		this.sendStatus = sendStatus;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getProvinceCity() {
		return provinceCity;
	}

	public void setProvinceCity(String provinceCity) {
		this.provinceCity = provinceCity;
	}

	public String getReceiptTime() {
		return receiptTime;
	}

	public void setReceiptTime(String receiptTime) {
		this.receiptTime = receiptTime;
	}

	public String getReceiptCode() {
		return receiptCode;
	}

	public void setReceiptCode(String receiptCode) {
		this.receiptCode = receiptCode;
	}

	public Integer getReceiptStatus() {
		return receiptStatus;
	}

	public void setReceiptStatus(Integer receiptStatus) {
		this.receiptStatus = receiptStatus;
	}

	public Date getPushTime() {
		return pushTime;
	}

	public void setPushTime(Date pushTime) {
		this.pushTime = pushTime;
	}

	public String getPushResult() {
		return pushResult;
	}

	public void setPushResult(String pushResult) {
		this.pushResult = pushResult;
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

	public Date getSubTime() {
		return subTime;
	}

	public void setSubTime(Date subTime) {
		this.subTime = subTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupRemark() {
		return groupRemark;
	}

	public void setGroupRemark(String groupRemark) {
		this.groupRemark = groupRemark;
	}

	public String getPassName() {
		return passName;
	}

	public void setPassName(String passName) {
		this.passName = passName;
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
		return "SmsSentDO [id=" + id + ", type=" + type + ", amount=" + amount + ", content=" + content + ", phone="
				+ phone + ", sendStatus=" + sendStatus + ", sendTime=" + sendTime + ", customerId=" + customerId
				+ ", createUserId=" + createUserId + ", proId=" + proId + ", taskId=" + taskId + ", preId=" + preId
				+ ", numSection=" + numSection + ", provinceCity=" + provinceCity + ", packageId=" + packageId
				+ ", channleId=" + channleId + ", passId=" + passId + ", port=" + port + ", receiptTime=" + receiptTime
				+ ", receiptCode=" + receiptCode + ", receiptStatus=" + receiptStatus + ", pushTime=" + pushTime
				+ ", pushResult=" + pushResult + ", companyName=" + companyName + ", contactName=" + contactName
				+ ", username=" + username + ", subTime=" + subTime + ", remark=" + remark + ", groupName=" + groupName
				+ ", groupRemark=" + groupRemark + ", passName=" + passName + ", contentLength=" + contentLength
				+ ", contentSize=" + contentSize + ", isApi=" + isApi + "]";
	}

}
