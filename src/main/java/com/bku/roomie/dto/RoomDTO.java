package com.bku.roomie.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomDTO {

	private Long rid;
	private Double area;
	private Double price;
	private List<ImageDTO> images = new ArrayList<>();
	private Boolean availability;
	private Date time;
	private Boolean parking;
	private Boolean mezzanine;
	private Boolean aircondition;
	private Boolean internet;
	private Boolean tv;
	private Boolean cooking;
	private Boolean security;
	private Boolean privateToilet;
	private UserDTO user;
	private LocationDTO location;

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<ImageDTO> getImages() {
		return images;
	}

	public void setImages(List<ImageDTO> images) {
		this.images = images;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Boolean getParking() {
		return parking;
	}

	public void setParking(Boolean parking) {
		this.parking = parking;
	}

	public Boolean getMezzanine() {
		return mezzanine;
	}

	public void setMezzanine(Boolean mezzanine) {
		this.mezzanine = mezzanine;
	}

	public Boolean getAircondition() {
		return aircondition;
	}

	public void setAircondition(Boolean aircondition) {
		this.aircondition = aircondition;
	}

	public Boolean getInternet() {
		return internet;
	}

	public void setInternet(Boolean internet) {
		this.internet = internet;
	}

	public Boolean getTv() {
		return tv;
	}

	public void setTv(Boolean tv) {
		this.tv = tv;
	}

	public Boolean getCooking() {
		return cooking;
	}

	public void setCooking(Boolean cooking) {
		this.cooking = cooking;
	}

	public Boolean getSecurity() {
		return security;
	}

	public void setSecurity(Boolean security) {
		this.security = security;
	}

	public Boolean getPrivateToilet() {
		return privateToilet;
	}

	public void setPrivateToilet(Boolean privateToilet) {
		this.privateToilet = privateToilet;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public LocationDTO getLocation() {
		return location;
	}

	public void setLocation(LocationDTO location) {
		this.location = location;
	}

}
