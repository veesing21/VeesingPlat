package com.veesing.common.domain;

import java.io.Serializable;
import java.util.Date;


public class FileDO implements Serializable {
	private static final long serialVersionUID = 1L;


	private Long id;

	private Integer type;

	private String url;

	private Date createDate;

	public FileDO() {
		super();
	}

	public FileDO(Integer type, String url, Date createDate) {
		super();
		this.type = type;
		this.url = url;
		this.createDate = createDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return type;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	@Override
	public String toString() {
		return "FileDO [id=" + id + ", type=" + type + ", url=" + url + ", createDate=" + createDate + "]";
	}

}
