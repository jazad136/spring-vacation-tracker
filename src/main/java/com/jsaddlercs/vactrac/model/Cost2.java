package com.jsaddlercs.vactrac.model;

import java.math.BigDecimal;
import java.util.Date;

/** 
 * Source code for Cost. 
 */
public class Cost2 {
	private Long roomId;
	private String name;
	private String bedInfo;
	private Integer nights;
	private String stayStart;
	private BigDecimal price;
	private Date retrievedDate;
	
	public Cost2() { }
	
	
	public Long getRoomId() { return roomId; } 
	public void setRoomId(Long value) { this.roomId = value; } 
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getBedInfo() { return bedInfo; }
	public void setBedInfo(String bedInfo) { this.bedInfo = bedInfo; }

	public Integer getNights() { return nights; }
	public void setNights(Integer nights) { this.nights = nights; }
	
	public String getStayStart() { return stayStart; }
	public void setStayStart(String stayStart) { this.stayStart = stayStart; }

	public BigDecimal getPrice() { return price; }
	public void setPrice(BigDecimal price) { this.price = price; }

	public Date getRetrievedDate() { return retrievedDate; }
	public void setRetrievedDate(Date retrievedDate) { this.retrievedDate = retrievedDate; }

	@Override
	public String toString() {
		return "Cost [name=" + name + ", bedInfo=" + bedInfo + ", nights=" + nights + ", stayStart=" + stayStart
				+ ", price=" + price + ", retrievedDate=" + retrievedDate + "]";
	}
}
