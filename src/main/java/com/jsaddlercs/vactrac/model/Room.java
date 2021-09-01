package com.jsaddlercs.vactrac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")
public class Room {
	@Id
	@Column(name="ROOM_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="BED_INFO")
	private String bedInfo;
	
	@Column(name="NIGHTS")
	private int nights;
	
	@Column(name="COST")
	private double cost;
	
	@Column(name="DATE_OF_STAY")
	private String dateOfStay;
	
	public Room() {
	}
	
	public Room(String name, String bedInfo, int nights, double cost, String dateOfStay) {
		this.name = name;
		this.bedInfo = bedInfo;
		this.nights = nights;
		this.cost = cost;
		this.dateOfStay = dateOfStay;
	}

	public long getId() { return id; }
	public void setId(long id) { this.id = id; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getBedInfo() { return bedInfo; }
	public void setBedInfo(String bedInfo) { this.bedInfo = bedInfo; }
	
	public int getNights() { return nights; }
	public void setNights(int nights) { this.nights = nights; }
	
	public double getCost() { return cost; }
	public void setCost(double cost) { this.cost = cost; }
	
	public String getDateOfStay() { return dateOfStay; }
	public void setDateOfStay(String dateOfStay) { this.dateOfStay = dateOfStay; }
	
}
