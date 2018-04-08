package com.bku.roomie.dto;

import java.util.Date;

public class UserDTO {
	
	private Long uid;
	private String facebook;
	private String google;
	private String name;
	private String phone;
	private Date createDate;
	
	public Long getUId() {
		return uid;
	}

	public void setUId(Long uid) {
		this.uid = uid;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getGoogle() {
		return google;
	}

	public void setGoogle(String google) {
		this.google = google;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
