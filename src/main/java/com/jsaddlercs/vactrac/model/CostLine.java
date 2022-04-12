package com.jsaddlercs.vactrac.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Date;

/** 
 * Source code for Cost. 
 */
public class CostLine {
	private Integer nights;
	private String stayStart;
	private BigDecimal price;
	private Date retrievedDate;
	
	private final DecimalFormat priceFormat;
	public CostLine() { 
		priceFormat = (DecimalFormat)DecimalFormat.getInstance();
		priceFormat.setMinimumFractionDigits(2);
		priceFormat.setMaximumFractionDigits(2);
		priceFormat.setRoundingMode(RoundingMode.HALF_EVEN);
	}
	
	
	public Integer getNights() { return nights; }
	public void setNights(Integer nights) { this.nights = nights; }
	
	public String getStayStart() { return stayStart; }
	public void setStayStart(String stayStart) { this.stayStart = stayStart; }

	public String getPrice() { return priceFormat.format(price); }
//	public String getPrice() { return price.toString(); }
	public BigDecimal getPriceDecimal() { return price; } 
	public void setPrice(BigDecimal price) { this.price = price; }
	
	public Date getRetrievedDate() { return retrievedDate; }
	public void setRetrievedDate(Date retrievedDate) { this.retrievedDate = retrievedDate; }

	@Override
	public String toString() {
		return "CostLine [stayStart=" + stayStart + ", price=" + price + ", retrievedDate=" + retrievedDate + "]";
	}


}
