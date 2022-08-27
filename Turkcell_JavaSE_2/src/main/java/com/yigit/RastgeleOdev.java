package com.yigit;

import java.util.Random;
import java.util.Scanner;

public class RastgeleOdev {
	
	public static String userOdev() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Odev giriniz : ");
		String odev = scanner.nextLine();
		return odev;
	}
	
	public static String[] liste() {
		String[] liste = { "Ali Furkan Ergüven", "Alim Yogurtcu", "Arda Kozan", "Beytullah Zor", "Burak Can Gületin",
				"Dogus Saglam", "Emre Yildiz", "Furkan Gurcay", "Hüseyin Baris Aktas", "Ýbrahim Bayramli",
				"Kadir Irpik", "Kubilay Alp Agacan", "Mehmet Mustafa Ozcelik", "Mustafa Kemal", "Omer Faruk Caliskan",
				"Seyda Ozdemir", "Tolga Gureli", "Tuba Argin", "Yigit Ozen" };
		
		return liste;
	}
	
	public static void rastgeleOdev(String liste[]) {
		Random random = new Random();
		int sayi = random.nextInt(1, 20);
		int sayi1 = sayi - 1;
		
		for (int i = 0; i < liste.length; i++) {
			if (sayi1 == i) {
				System.out.println("Odev verilen kisi : " + liste[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String odev = userOdev();
		String[] liste = liste();
		rastgeleOdev(liste);
	}
	
}
