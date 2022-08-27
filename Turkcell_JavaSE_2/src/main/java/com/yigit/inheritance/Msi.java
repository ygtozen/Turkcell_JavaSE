package com.yigit.inheritance;

public class Msi extends Computer {
	
	public Msi() {
		super();
	}
	
	public Msi(String cpu, String ram, String smartMainBoard, String port) {
		super(cpu, ram, smartMainBoard, port);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void commonmethod() {
		// TODO Auto-generated method stub
		super.commonmethod();
	}
	
	@Override
	public String toString() {
		return "Msi [getCpu()=" + getCpu() + ", getRam()=" + getRam() + ", getSmartMainBoard()=" + getSmartMainBoard()
				+ "]";
	}
}
