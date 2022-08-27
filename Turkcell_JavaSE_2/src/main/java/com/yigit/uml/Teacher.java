package com.yigit.uml;

public class Teacher extends Person implements ISchool {
	
	private String maas;
	
	public int maasHesapla(int sayi) {
		
		return sayi;
	}
	
	// interface ile gelen zorunlu metodlar
	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
