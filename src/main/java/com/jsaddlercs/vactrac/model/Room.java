package com.jsaddlercs.vactrac.model;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name="ROOM")
public class Room {
	private long id;
	private String name;
	private String bedInfo;
	private int nights;
	private double cost;
	
	public Room() {
	}
	
	public Room(long id, String name, String bedInfo, int nights, double cost) {
		this.id = id;
		this.name = name;
		this.bedInfo = bedInfo;
		this.nights = nights;
		this.cost = cost;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBedInfo() {
		return bedInfo;
	}
	public void setBedInfo(String bedInfo) {
		this.bedInfo = bedInfo;
	}
	public int getNights() {
		return nights;
	}
	public void setNights(int nights) {
		this.nights = nights;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
}
