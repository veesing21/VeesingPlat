package com.veesing.mms.domain;

import java.io.Serializable;
import java.util.Date;


public class MmsSentDO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private Long packageId;
	private Long batchId;
	private Long channelId;
	private Long passId;
	private Long customerId;
	private Long createUserId;
	private String phone;
	private Integer sendStatus;
	private Date sendTime;
	private Long productId;
	private String provinceCity;
	private Integer numSection;
	private String taskId;
	private String port;
	private Integer receiptStatus;
	private String receiptCode;
	private String receiptTime;
	private Date pushTime;
	private String pushResult;
	private String title;
	private Date subTime;
	private String companyName;
	private String contactName;
	private String username;
	private String groupName;
	private String groupRemark;
	private Integer pdType;
	private Integer isApi;

	public MmsSentDO() {
	}

	public MmsSentDO(Long packageId, Long batchId, Long channelId, Long customerId, Long createUserId, String phone, Integer sendStatus, Long productId, String provinceCity, Integer numSection, String title, Integer pdType, Integer isApi) {
		this.packageId = packageId;
		this.batchId = batchId;
		this.channelId = channelId;
		this.customerId = customerId;
		this.createUserId = createUserId;
		this.taskId=String.valueOf(batchId);
		this.phone = phone;
		this.sendStatus = sendStatus;
		this.productId = productId;
		this.provinceCity = provinceCity;
		this.numSection = numSection;
		this.title = title;
		this.pdType = pdType;
		this.isApi = isApi;
		this.taskId=String.valueOf(batchId);
		this.sendTime=new Date();
	}

	public Integer getPdType() {
		return pdType;
	}

	public void setPdType(Integer pdType) {
		this.pdType = pdType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPackageId() {
		return packageId;
	}

	public void setPackageId(Long packageId) {
		this.packageId = packageId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public Long getPassId() {
		return passId;
	}

	public void setPassId(Long passId) {
		this.passId = passId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Integer getReceiptStatus() {
		return receiptStatus;
	}

	public void setReceiptStatus(Integer receiptStatus) {
		this.receiptStatus = receiptStatus;
	}

	public String getReceiptCode() {
		return receiptCode;
	}

	public void setReceiptCode(String receiptCode) {
		this.receiptCode = receiptCode;
	}

	public String getReceiptTime() {
		return receiptTime;
	}

	public void setReceiptTime(String receiptTime) {
		this.receiptTime = receiptTime;
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

	public String getProvinceCity() {
		return provinceCity;
	}

	public void setProvinceCity(String provinceCity) {
		this.provinceCity = provinceCity;
	}

	public Integer getNumSection() {
		return numSection;
	}

	public void setNumSection(Integer numSection) {
		this.numSection = numSection;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getSubTime() {
		return subTime;
	}

	public void setSubTime(Date subTime) {
		this.subTime = subTime;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Integer getIsApi() {
		return isApi;
	}

	public void setIsApi(Integer isApi) {
		this.isApi = isApi;
	}

	@Override
	public String toString() {
		return "MmsSentDO [id=" + id + ", packageId=" + packageId + ", batchId=" + batchId + ", channelId=" + channelId
				+ ", passId=" + passId + ", customerId=" + customerId + ", createUserId=" + createUserId + ", phone="
				+ phone + ", sendStatus=" + sendStatus + ", sendTime=" + sendTime + ", productId=" + productId
				+ ", provinceCity=" + provinceCity + ", numSection=" + numSection + ", taskId=" + taskId + ", port="
				+ port + ", receiptStatus=" + receiptStatus + ", receiptCode=" + receiptCode + ", receiptTime="
				+ receiptTime + ", pushTime=" + pushTime + ", pushResult=" + pushResult + ", title=" + title
				+ ", subTime=" + subTime + ", companyName=" + companyName + ", contactName=" + contactName
				+ ", username=" + username + ", groupName=" + groupName + ", groupRemark=" + groupRemark + ", pdType="
				+ pdType + ", isApi=" + isApi + "]";
	}

}
