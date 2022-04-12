package com.jsaddlercs.vactrac.model;

public class StayPrice {
	private String value;

	public StayPrice(String value) {
		this.value = value;
	}
	public String getValue() { return value; } 
	public void setValue(String value) { this.value = value; }
	
	@Override
	public String toString() {
		return "StayPrice [value=" + value + "]";
	}
}
