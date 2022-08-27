package com.yigit.inheritance;

public class Asus extends Computer {
	
	// Asus'un kendine ait �zelliklerin burada yazar�z
	
	private String voiceRecognation;
	
	// parametresiz constructor
	public Asus() {
		super();
	}
	
	// parametreli constructor
	public Asus(String cpu, String ram, String smartMainBoard, String port, String voiceRecognation) {
		super(cpu, ram, smartMainBoard, port);
		this.voiceRecognation = voiceRecognation;
	}
	
	@Override
	public void commonmethod() {
		// TODO Auto-generated method stub
		super.commonmethod();
	}
	
	@Override
	public String toString() {
		return "Asus [voiceRecognation=" + voiceRecognation + "]";
	}
	
	// getter and setter
	public String getVoiceRecognation() {
		return voiceRecognation;
	}
	
	public void setVoiceRecognation(String voiceRecognation) {
		this.voiceRecognation = voiceRecognation;
	}
	
}
