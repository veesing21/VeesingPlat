package com.veesing.mms.domain;

import java.io.Serializable;
import java.util.Date;

public class MmsTemplateDO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String title;
	private Long customerId;
	private Integer state;
	private Date createTime;
	private Date modifyTime;
	private String screenshot;
	private Integer mmsType;
	private Integer isApi;
	private String frameJson;
	private Integer size;
	private String ip;
	private Integer pdType;
	private Long channelId;
	private Integer noAudit;
	private String opinion;
	private String callUrl;
	private String templateUq;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
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

	public String getScreenshot() {
		return screenshot;
	}

	public void setScreenshot(String screenshot) {
		this.screenshot = screenshot;
	}

	public Integer getMmsType() {
		return mmsType;
	}

	public void setMmsType(Integer mmsType) {
		this.mmsType = mmsType;
	}

	public Integer getIsApi() {
		return isApi;
	}

	public void setIsApi(Integer isApi) {
		this.isApi = isApi;
	}

	public String getFrameJson() {
		return frameJson;
	}

	public void setFrameJson(String frameJson) {
		this.frameJson = frameJson;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getPdType() {
		return pdType;
	}

	public void setPdType(Integer pdType) {
		this.pdType = pdType;
	}

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public Integer getNoAudit() {
		return noAudit;
	}

	public void setNoAudit(Integer noAudit) {
		this.noAudit = noAudit;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getCallUrl() {
		return callUrl;
	}

	public void setCallUrl(String callUrl) {
		this.callUrl = callUrl;
	}

	public String getTemplateUq() {
		return templateUq;
	}

	public void setTemplateUq(String templateUq) {
		this.templateUq = templateUq;
	}

	@Override
	public String toString() {
		return "MmsTemplateDO{" +
				"id=" + id +
				", title='" + title + '\'' +
				", customerId=" + customerId +
				", state=" + state +
				", createTime=" + createTime +
				", modifyTime=" + modifyTime +
				", screenshot='" + screenshot + '\'' +
				", mmsType=" + mmsType +
				", isApi=" + isApi +
				", frameJson='" + frameJson + '\'' +
				", size=" + size +
				", ip='" + ip + '\'' +
				", pdType=" + pdType +
				", channelId=" + channelId +
				", noAudit=" + noAudit +
				", opinion='" + opinion + '\'' +
				", callUrl='" + callUrl + '\'' +
				", templateUq='" + templateUq + '\'' +
				'}';
	}
}
