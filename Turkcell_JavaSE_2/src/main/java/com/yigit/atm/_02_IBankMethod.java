package com.yigit.atm;

public interface _02_IBankMethod {
	
	// para g�r�nt�le
	public void showMoney();
	
	// para eklesin
	public void addMoney();
	
	// para �ekme
	public void reduceMoney();
	
	// havale: ayn� banka
	public void  sendHavaleMoney();
	
	// EFT: farkl� bankalara para g�ndermek
	public void senEftMoney();
	
	// mail g�nder
	public void senEmail();
	
}
