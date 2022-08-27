package com.yigit;

import java.util.Scanner;

public class Polindrom {
	
	public static String useData() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Kelime giriniz : ");
		String kelime = klavye.nextLine();
		return kelime;
	}
	
	public static void polindrom() {
		String kelime = useData();
		String yeniKelime = "";
		
		for (int i = kelime.length() - 1; i >= 0; i--) {
			yeniKelime = yeniKelime + kelime.charAt(i);
		}
		
		if (kelime.equals(yeniKelime)) {
			System.out.println("Girilen kelime polindorm");
		} else {
			System.out.println("Girilen kelime polindorm degil");
		}
	}
	
	public static void main(String[] args) {
		polindrom();
	}
}
