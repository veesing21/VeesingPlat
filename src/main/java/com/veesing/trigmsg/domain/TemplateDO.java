package com.veesing.trigmsg.domain;

import java.io.Serializable;
import java.util.Date;


public class TemplateDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long customerId;

	private Integer tplType;

	private String tplName;

	private String tplContent;

	private Integer tplStatus;

	private Date createTime;

	private Date modifyTime;

	private Long createUserId;

	private String remark;

	private String opinion;

	private String tplTypeName;

	private String status;

	private String time;

	private String companyName;

	private String contactName;

	private String telephone;

	private String username;

	private Date identifyTime;

	private Long identifyUserId;

	private String ip;

	private Integer pdType;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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

	public Integer getTplType() {
		return tplType;
	}

	public void setTplType(Integer tplType) {
		this.tplType = tplType;
	}

	public String getTplName() {
		return tplName;
	}

	public void setTplName(String tplName) {
		this.tplName = tplName;
	}

	public String getTplContent() {
		return tplContent;
	}

	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

	public Integer getTplStatus() {
		return tplStatus;
	}

	public void setTplStatus(Integer tplStatus) {
		this.tplStatus = tplStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getTplTypeName() {
		return tplTypeName;
	}

	public void setTplTypeName(String tplTypeName) {
		this.tplTypeName = tplTypeName;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Integer getPdType() {
		return pdType;
	}

	public void setPdType(Integer pdType) {
		this.pdType = pdType;
	}

	@Override
	public String toString() {
		return "TemplateDO [id=" + id + ", customerId=" + customerId + ", tplType=" + tplType + ", tplName=" + tplName
				+ ", tplContent=" + tplContent + ", tplStatus=" + tplStatus + ", createTime=" + createTime
				+ ", modifyTime=" + modifyTime + ", createUserId=" + createUserId + ", remark=" + remark + ", opinion="
				+ opinion + ", tplTypeName=" + tplTypeName + ", status=" + status + ", time=" + time + ", companyName="
				+ companyName + ", contactName=" + contactName + ", telephone=" + telephone + ", username=" + username
				+ ", identifyTime=" + identifyTime + ", identifyUserId=" + identifyUserId + ", ip=" + ip + ", pdType="
				+ pdType + "]";
	}

}
