package com.veesing.trigmsg.domain;

import java.io.Serializable;
import java.util.Date;


public class SysTemplateDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long typeId;

	private String tplName;

	private String tplContent;

	private Date createTime;

	private Date modifyTime;

	private Long createUserId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
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

	@Override
	public String toString() {
		return "SysTemplateDO [id=" + id + ", typeId=" + typeId + ", tplName=" + tplName + ", tplContent=" + tplContent
				+ ", createTime=" + createTime + ", modifyTime=" + modifyTime + ", createUserId=" + createUserId + "]";
	}


}
