package com.yigit.oop;

import com.yigit.interfaces.IInterfaceTutorials;

public class Asus extends Computer implements IInterfaceTutorials {
	
	private String voiceRecognation;
	
	// parametresiz constructor
	public Asus() {
		
	}
	
	// parametreli constructor
	public Asus(String cpu, String ram, String smartMainBoard, String port, String voiceRecognation) {
		super(cpu, ram, smartMainBoard, port);
		this.voiceRecognation = voiceRecognation;
	}
	
	// toString
	@Override
	public String toString() {
		return "Asus [cpu=" + cpu + ", ram=" + ram + ", smartMainBoard=" + smartMainBoard + ", port=" + port
				+ ", voiceRecognation=" + voiceRecognation + "]";
	}
	
	// common Method
	public void commonmethod() {
		System.out.print("Computer Method : ");
	}
	
	// interfaces metodlarý
	@Override
	public void govdesizMethod() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void siteGit() {
		System.out.println("XYZ sitesi");
		
	}
	
	@Override
	public void sepeteEkle() {
		System.out.println("Sepete ekledim");
		
	}
	
	@Override
	public void ode() {
		System.out.println("Odedim");
		
	}
	
	@Override
	public String al(String sayi) {
		System.out.println("Al : " + sayi);
		return "tamamdir";
	}
	
}
