package com.jsaddlercs.vactrac.model;

public class Room {
	
	private Long id;
	private String name;
	private String bedInfo;
	private Integer nights;
	private String stayStart;
	
	public Room() {
		
	}
	
	public Room(String name, String bedInfo, Integer nights, String stayStart) {
		this.name = name;
		this.bedInfo = bedInfo;
		this.nights = nights;
		this.stayStart = stayStart;
	}

	public long getId() { return id; }
	public void setId(long id) { this.id = id; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getBedInfo() { return bedInfo; }
	public void setBedInfo(String bedInfo) { this.bedInfo = bedInfo; }
	
	public int getNights() { return nights; }
	public void setNights(int nights) { this.nights = nights; }
	
	public String getStayStart() { return stayStart; }
	public void setStayStart(String dateOfStay) { this.stayStart = dateOfStay; }
	
}
