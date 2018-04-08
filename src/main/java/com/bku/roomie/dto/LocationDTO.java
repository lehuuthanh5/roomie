package com.bku.roomie.dto;

public class LocationDTO {
	
	private Long lid;
	private String address;
	private String coordinate;

	public Long getLID() {
		return lid;
	}

	public void setLID(Long lid) {
		this.lid = lid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

}
