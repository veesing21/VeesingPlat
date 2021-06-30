package com.veesing.sms.domain;

import java.io.Serializable;
import java.util.Date;


public class SmsTemplateDO implements Serializable {

	private static final long serialVersionUID=1L;

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

    private String ip;

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


}
