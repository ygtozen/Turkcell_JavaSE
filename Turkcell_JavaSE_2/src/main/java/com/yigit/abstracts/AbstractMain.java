package com.yigit.abstracts;

public class AbstractMain {
	
	public static void main(String[] args) {
		
		// super class new ile oluþturamazsýnýz
		System.out.println("\n******** Ana Class (Super Class) ***********************");
		// Polymorphism:
		Computer computer2 = new Msi("computer-cpu", "computer-ram", "computer-anakart", "computer-port");
		System.out.println(computer2);
		
		// Asus
		System.out.println("\n******** Asus Class (Sub Class) ***********************");
		Asus asus = new Asus("asus-cpu", "asus-ram", "asus-smartMainBoard", "asus-port", "asus-voiceRecognation");
		asus.govdeliMethod();// Polymorphism:
		asus.govdesizMethod("Yigit");// Polymorphism:
		System.out.println(asus);
		
		// Msi
		System.out.println("\n******** Msi Class (Sub Class) ***********************");
		Msi msi = new Msi("msi-cpu", "msi-ram", "msi-anakart", "msi-port");
		msi.govdeliMethod();// Polymorphism:
		msi.govdesizMethod("Yigit");// Polymorphism:
		System.out.println(msi);
		
		// lenova
		System.out.println("\n******** Lenova Class (Sub Class) ***********************");
		Lenova lenova = new Lenova("lenova-cpu", "lenova-ram", "lenova", "lenova-port", "lenova-screenshot");
		lenova.govdeliMethod();// Polymorphism:
		lenova.govdesizMethod("Yigit");// Polymorphism:
		System.out.println(lenova);
		
	}
	
}
