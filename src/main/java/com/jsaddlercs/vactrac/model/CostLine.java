package com.jsaddlercs.vactrac.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/** 
 * Source code for Cost. 
 */
public class CostLine {
	private Integer nights;
	private String stayStart;
	private BigDecimal price;
	private Date retrievedDate;
	
	public CostLine() { }
	
	
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
		return "CostLine [stayStart=" + stayStart + ", price=" + price + ", retrievedDate=" + retrievedDate + "]";
	}


}
