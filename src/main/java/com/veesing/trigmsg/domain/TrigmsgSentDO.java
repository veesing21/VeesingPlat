package com.veesing.trigmsg.domain;

import java.io.Serializable;
import java.util.Date;

public class TrigmsgSentDO implements Serializable {

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
	private String port;
	private Integer numSection;
	private String provinceCity;
	private Long channelId;
	private Long passId;
	private String receiptTime;
	private String receiptCode;
	private Integer receiptStatus;
	private String talkTime;
	private Date pushTime;
	private String pushResult;
	private String companyName;
	private String contactName;
	private String username;
	private String groupName;
	private String passName;
	private String ip;
	private String remark;
	private Integer contentLength;
	private Integer contentSize;
	private Long tplId;
    private String variable;

    public Long getTplId() {
        return tplId;
    }

    public void setTplId(Long tplId) {
        this.tplId = tplId;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getProId() {
		return proId;
	}

	public void setProId(Long proId) {
		this.proId = proId;
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

	public Integer getNumSection() {
		return numSection;
	}

	public void setNumSection(Integer numSection) {
		this.numSection = numSection;
	}

	public String getProvinceCity() {
		return provinceCity;
	}

	public void setProvinceCity(String provinceCity) {
		this.provinceCity = provinceCity;
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

	public String getTalkTime() {
		return talkTime;
	}

	public void setTalkTime(String talkTime) {
		this.talkTime = talkTime;
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

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public String getChannelName() {
		return groupName;
	}

	public void setChannelName(String groupName) {
		this.groupName = groupName;
	}

	public String getPassName() {
		return passName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setPassName(String passName) {
		this.passName = passName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	@Override
	public String toString() {
		return "TrigmsgSentDO [id=" + id + ", type=" + type + ", amount=" + amount + ", content=" + content + ", phone="
				+ phone + ", sendStatus=" + sendStatus + ", sendTime=" + sendTime + ", customerId=" + customerId
				+ ", createUserId=" + createUserId + ", proId=" + proId + ", taskId=" + taskId + ", port=" + port
				+ ", numSection=" + numSection + ", provinceCity=" + provinceCity + ", channelId=" + channelId
				+ ", passId=" + passId + ", receiptTime=" + receiptTime + ", receiptCode=" + receiptCode
				+ ", receiptStatus=" + receiptStatus + ", talkTime=" + talkTime + ", pushTime=" + pushTime
				+ ", pushResult=" + pushResult + ", companyName=" + companyName + ", contactName=" + contactName
				+ ", username=" + username + ", groupName=" + groupName + ", passName=" + passName + ", ip=" + ip
				+ ", remark=" + remark + ", contentLength=" + contentLength + ", contentSize=" + contentSize + "]";
	}

}
