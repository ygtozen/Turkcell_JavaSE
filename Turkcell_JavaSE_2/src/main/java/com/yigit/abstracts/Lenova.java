package com.yigit.abstracts;

public class Lenova extends Computer {
	
	private String screenshot;
	
	// parametresiz constructor
	public Lenova() {
	}
	
	// parametreli constructor
	public Lenova(String cpu, String ram, String smartMainBoard, String port, String screenshot) {
		super(cpu, ram, smartMainBoard, port);
		this.screenshot = screenshot;
	}
	
	// super classtan gelen �zelli�i override etmek
	@Override
	public void govdeliMethod() {
		super.govdeliMethod();
		System.out.println("Lenova ");
	}
	
	// g�vdesiz metot
	@Override
	public void govdesizMethod(String name) {
		System.out.println("Lenova G�vdesiz metot: " + name);
		
	}
	
	// toString()
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
