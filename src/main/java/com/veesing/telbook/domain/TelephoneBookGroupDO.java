package com.veesing.telbook.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TelephoneBookGroupDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String groupName;

	private Long customerId;

	private Date createTime;

	private String remark;

	private List<String> phones;

	private Integer phoneNums;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Integer getPhoneNums() {
		return phoneNums;
	}

	public void setPhoneNums(Integer phoneNums) {
		this.phoneNums = phoneNums;
	}



}
