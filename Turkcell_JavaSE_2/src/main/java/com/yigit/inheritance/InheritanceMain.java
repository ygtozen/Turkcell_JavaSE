package com.yigit.inheritance;

public class InheritanceMain {
	
	public static void main(String[] args) {
		
		System.out.println("\n************ Ana Class (Super Class) *****************");
		Computer computer = new Computer("computer-cpu", "computer", "computer-anakart", "computer-port");
		System.out.println(computer);
		
		// Polymorphism
		System.out.println("\n************ Ana Class (Super Class) *****************");
		Computer computer2 = new Msi("computer-cpu", "computer", "computer-anakart", "computer-port");
		System.out.println(computer2);
		
		System.out.println("\n*************** Asus Class (Sub Class) *******************");
		// Asus
		Asus asus = new Asus("asus-cpu", "asus-ram", "asus-smartMainBoard", "asus-port", "asus-voiceRecognation");
		// System.out.println(asus.getCpu() + asus.getSmartMainBoard() + asus.getRam());
		System.out.println(asus);
		asus.commonmethod(); // Polymorphism:
		
		System.out.println("\n*************** Msi Class (Sub Class) *******************");
		// Msi
		Msi msi = new Msi("msi-cpu", "msi-ram", "msi-anakart", "msi-port");
		// System.out.println(msi.getCpu() + msi.getSmartMainBoard() + msi.getRam());
		msi.commonmethod();
		System.out.println(msi);
		
		System.out.println("\n*************** Lenova Class (Sub Class) *******************");
		// Asus
		Lenova lenova = new Lenova("lenova-cpu", "lenova-ram", "lenova-smartMainBoard", "lenova-port",
				"lenova-screenshot");
		// System.out.println(asus.getCpu() + asus.getSmartMainBoard() + asus.getRam());
		System.out.println(lenova);
		lenova.commonmethod(); // Polymorphism:
		
		// String result = (asus instanceof Asus) ? "Evet asus Asus'tan türemiþ" :
		// "Hayýr asus Asus'tan türemiþ";
		// System.out.println(result);
	}
	
}
