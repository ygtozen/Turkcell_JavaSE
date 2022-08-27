package com.yigit.oop;

public class Msi extends Computer {
	
	// parametresiz constructor
	public Msi() {
		
	}
	
	// paramtreli constructor
	public Msi(String cpu, String ram, String smartMainBoard, String port) {
		super(cpu, ram, smartMainBoard, port);
		// TODO Auto-generated constructor stub
	}
	
	// toString
	@Override
	public String toString() {
		return "Msi [cpu=" + cpu + ", ram=" + ram + ", smartMainBoard=" + smartMainBoard + ", port=" + port
				+ ", toString()=" + super.toString() + ", getCpu()=" + getCpu() + ", getRam()=" + getRam()
				+ ", getSmartMainBoard()=" + getSmartMainBoard() + ", getPort()=" + getPort() + "]";
	}
	
	// common Method
	public void commonmethod() {
		System.out.print("Computer Method : ");
	}
	
	@Override
	public void govdesizMethod() {
		// TODO Auto-generated method stub
		
	}
	
}
