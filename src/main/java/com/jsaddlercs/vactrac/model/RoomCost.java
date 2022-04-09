package com.jsaddlercs.vactrac.model;

import java.util.List;
import java.util.stream.Collectors;

/** 
 * Source code for RoomCost object. 
 */
public class RoomCost {
	private Long roomId;
	private String name;
	private String bedInfo; 
	private List<CostLine> costLines;
	
	public RoomCost() { }
	
	public Long getRoomId() { return roomId; } 
	public void setRoomId(Long value) { this.roomId = value; } 
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getBedInfo() { return bedInfo; }
	public void setBedInfo(String bedInfo) { this.bedInfo = bedInfo; }
	
	public List<CostLine> getCostLines() { return costLines; }
	public void setCostLines(List<CostLine> costLines) { this.costLines = costLines; }

	@Override
	public String toString() {
		if(costLines == null) 
			return "RoomCost [roomId=" + roomId + ", name=" + name + ", bedInfo=" + bedInfo + ", costLine=(none)]";
		
		return costLines.stream()
			.map(cl -> "RoomCost [roomId=" + roomId + ", name=" + name + "bedInfo=" + bedInfo + ", costLine=" + cl + "]")
			.collect(Collectors.joining("\n"));			
	}
	
}
