package com.jsaddlercs.vactrac.model;

import java.util.List;

/** 
 * Source code for RoomCost object. 
 */
public class RoomCost {
	private Long roomId;
	private String name;
	private String bedInfo;
	private Integer nights;
	private List<CostLine> costLines;
	
	public RoomCost() { }
	
	
	public Long getRoomId() { return roomId; } 
	public void setRoomId(Long value) { this.roomId = value; } 
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getBedInfo() { return bedInfo; }
	public void setBedInfo(String bedInfo) { this.bedInfo = bedInfo; }

	public Integer getNights() { return nights; }
	public void setNights(Integer nights) { this.nights = nights; }

	public List<CostLine> getCostLines() { return costLines; }
	public void setCostLines(List<CostLine> costLines) { this.costLines = costLines; }
	
}
