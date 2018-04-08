package com.bku.roomie.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Image {
	
	@Id
	@GeneratedValue
	private Long iid;
	// private Long RID;
	@ManyToMany(mappedBy = "images")
	private List<Room> rooms = new ArrayList<>();
	private String path;

	public Long getIID() {
		return iid;
	}

	public void setIID(Long iid) {
		this.iid = iid;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
