package com.yigit.atm;

public enum _03_MoneyCurrency { // Para Birimleri
	
	TR(1, "tr"), EN(2, "en"), GE(3, "ge");
	
	private final int key;
	private final String value;
	
	// private constructor : new instance oluşturmalıyız
	private _03_MoneyCurrency(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	// getter and setter
	public int getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
}
