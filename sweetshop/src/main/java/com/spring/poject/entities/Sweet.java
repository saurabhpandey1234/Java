package com.spring.poject.entities;

public class Sweet {

	
	private int sweetId;
	private String sweetName;
	private int  sweetRate;
	private int  sweetDiscountOffer;
	
	public Sweet(int sweetId, String sweetName, int sweetRate, int sweetDiscountOffer) {
		super();
		this.sweetId = sweetId;
		this.sweetName = sweetName;
		this.sweetRate = sweetRate;
		this.sweetDiscountOffer = sweetDiscountOffer;
	}
	public Sweet() {
		super();
		
	}
	
	public int getSweetId() {
		return sweetId;
	}
	public void setSweetId(int sweetId) {
		this.sweetId = sweetId;
	}
	public String getSweetName() {
		return sweetName;
	}
	public void setSweetName(String sweetName) {
		this.sweetName = sweetName;
	}
	public int getSweetRate() {
		return sweetRate;
	}
	public void setSweetRate(int sweetRate) {
		this.sweetRate = sweetRate;
	}
	public int getSweetDiscountOffer() {
		return sweetDiscountOffer;
	}
	public void setSweetDiscountOffer(int sweetDiscountOffer) {
		this.sweetDiscountOffer = sweetDiscountOffer;
	}
	
	
	@Override
	public String toString() {
		return "Sweet [sweetId=" + sweetId + ", sweetName=" + sweetName + ", sweetRate=" + sweetRate
				+ ", sweetDiscountOffer=" + sweetDiscountOffer + "]";
	}
	
	
}
