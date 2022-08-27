package com.yigit.atm;

public interface _02_IBankMethod {
	
	// para görüntüle
	public void showMoney();
	
	// para eklesin
	public void addMoney();
	
	// para çekme
	public void reduceMoney();
	
	// havale: ayný banka
	public void  sendHavaleMoney();
	
	// EFT: farklý bankalara para göndermek
	public void senEftMoney();
	
	// mail gönder
	public void senEmail();
	
}
