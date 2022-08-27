package com.yigit.normal;

public class NormalMainTest {
	
	public static void main(String[] args) {
		
		System.out.println("\n*************** Asus Class (Sub Class) *******************");
		// Asus
		Asus asus = new Asus("asus-cpu", "asus-ram", "asus-mainbord", "asus-port", "asus-voice recognation");
		// System.out.println(asus.getCpu() + asus.getSmartMainBoard() + asus.getRam());
		System.out.println(asus);
		asus.commonmethod(); // Polymorphism:
		
		System.out.println("\n*************** Msi Class (Sub Class) *******************");
		// Msi
		Msi msi = new Msi("msi-cpu", "msi-ram", "msi-mainboard", "msi-port");
		// System.out.println(msi.getCpu() + msi.getSmartMainBoard() + msi.getRam());
		msi.commonmethod();
		System.out.println(msi);
		
	}
	
}
