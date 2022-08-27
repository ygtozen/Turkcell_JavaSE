package com.yigit.normal;

public class Asus {
	
	protected String cpu;
	protected String ram;
	protected String smartMainBoard;
	protected String port;
	private String voiceRecognation;
	
	// parametresiz constructor
	public Asus() {
		
	}
	
	// parametreli constructor
	public Asus(String cpu, String ram, String smartMainBoard, String port, String voiceRecognation) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.smartMainBoard = smartMainBoard;
		this.port = port;
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
	
	// getter and setter
	
	public String getCpu() {
		return cpu;
	}
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public String getSmartMainBoard() {
		return smartMainBoard;
	}
	
	public void setSmartMainBoard(String smartMainBoard) {
		this.smartMainBoard = smartMainBoard;
	}
	
	public String getPort() {
		return port;
	}
	
	public void setPort(String port) {
		this.port = port;
	}
	
	public String getVoiceRecognation() {
		return voiceRecognation;
	}
	
	public void setVoiceRecognation(String voiceRecognation) {
		this.voiceRecognation = voiceRecognation;
	}
	
}
