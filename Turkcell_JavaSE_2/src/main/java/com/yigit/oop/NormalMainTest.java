package com.yigit.oop;

public class NormalMainTest {
	
	public static void main(String[] args) {
		
		Computer computer = new Asus();
		
		System.out.println("\n*************** Asus Class (Sub Class) *******************");
		// Asus
		Asus asus = new Asus("asus-cpu", "asus-ram", "asus-mainbord", "asus-port", "asus-voice recognation");
		// System.out.println(asus.getCpu() + asus.getSmartMainBoard() + asus.getRam());
		System.out.println(asus);
		asus.commonmethod(); // Polymorphism:
		asus.govdesizMethod();
		
		System.out.println("\n*************** Msi Class (Sub Class) *******************");
		// Msi
		Msi msi = new Msi("msi-cpu", "msi-ram", "msi-mainboard", "msi-port");
		msi.commonmethod();
		System.out.println(msi);
		msi.govdesizMethod();
		
	}
	
}
