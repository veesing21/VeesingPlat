package com.veesing.system.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserDO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long userId;
	private String username;
	private String name;
	private String password;
	private Long deptId;
	private String deptName;
	private String email;
	private String mobile;
	private Integer status;
	private Long userIdCreate;
	private Date gmtCreate;
	private Date gmtModified;
	private List<Long> roleIds;
	private String roleName;
	private Long customerId;
	private String customerName;
	private Long roleId;

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return mobile;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}

	public void setUserIdCreate(Long userIdCreate) {
		this.userIdCreate = userIdCreate;
	}

	public Long getUserIdCreate() {
		return userIdCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public List<Long> getroleIds() {
		return roleIds;
	}

	public void setroleIds(List<Long> roleIds) {
		this.roleIds = roleIds;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "UserDO [userId=" + userId + ", username=" + username + ", name=" + name + ", password=" + password
				+ ", deptId=" + deptId + ", deptName=" + deptName + ", email=" + email + ", mobile=" + mobile
				+ ", status=" + status + ", userIdCreate=" + userIdCreate + ", gmtCreate=" + gmtCreate
				+ ", gmtModified=" + gmtModified + ", roleIds=" + roleIds + ", roleName=" + roleName + ", customerId="
				+ customerId + ", customerName=" + customerName + ", roleId=" + roleId + "]";
	}


}
