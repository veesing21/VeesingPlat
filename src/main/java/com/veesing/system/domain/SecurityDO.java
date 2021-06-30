package com.veesing.system.domain;

import java.io.Serializable;
import java.util.Date;

public class SecurityDO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer type;

	private Integer pdType;

	private String key;

	private String value;

	private Long customerId;

	private Date createTime;

	private Integer isUsed;

	private Date trigTime;

	private String trigCount;

	public SecurityDO() {
	}

	public SecurityDO(Integer type, Integer pdType, String key, String value, Long customerId, Date createTime, Integer isUsed, Date trigTime, String trigCount) {
		this.type = type;
		this.pdType = pdType;
		this.key = key;
		this.value = value;
		this.customerId = customerId;
		this.createTime = createTime;
		this.isUsed = isUsed;
		this.trigTime = trigTime;
		this.trigCount = trigCount;
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

	public Integer getPdType() {
		return pdType;
	}

	public void setPdType(Integer pdType) {
		this.pdType = pdType;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
	}

	public Date getTrigTime() {
		return trigTime;
	}

	public void setTrigTime(Date trigTime) {
		this.trigTime = trigTime;
	}

	public String getTrigCount() {
		return trigCount;
	}

	public void setTrigCount(String trigCount) {
		this.trigCount = trigCount;
	}

	@Override
	public String toString() {
		return "SecurityDO [id=" + id + ", type=" + type + ", pdType=" + pdType + ", key=" + key + ", value=" + value
				+ ", customerId=" + customerId + ", createTime=" + createTime + ", isUsed=" + isUsed + ", trigTime="
				+ trigTime + ", trigCount=" + trigCount + "]";
	}



}
