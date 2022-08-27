package com.yigit.inheritance;

public class Lenova extends Computer {
	
	// Lonovanýn kendine ait özelliklerin burada yazarýz
	
	private String screenshot;
	
	// parametresiz constructor
	public Lenova() {
		super();
	}
	
	// parametreli constructor
	public Lenova(String cpu, String ram, String smartMainBoard, String port, String screenshot) {
		super(cpu, ram, smartMainBoard, port);
		this.screenshot = screenshot;
	}
	
	@Override
	public void commonmethod() {
		// TODO Auto-generated method stub
		super.commonmethod();
	}
	
	@Override
	public String toString() {
		return "Lenova [screenshot=" + screenshot + "]";
	}
	
	// getter and setter
	public String getScreenshot() {
		return screenshot;
	}
	
	public void setScreenshot(String screenshot) {
		this.screenshot = screenshot;
	}
}
