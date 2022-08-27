package com.yigit;

import java.util.Scanner;

public class _22x2_StringReverse {
	
	public static void kelimeCevir() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz : ");
		String kelime = scanner.nextLine();
		
		for (int i = kelime.length() - 1; i >= 0; i--) {
			System.out.print(kelime.charAt(i));
		}
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// kullanıcıdan alınan data
	public String scannerValueData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("++++++++\n bir seyler yazin :  ");
		String value = scanner.nextLine();
		return value;
	}
	
	// Verilen kelimeyi tersten yazdir
	public String stringReverse() {
		String temp = "";
		try {
			String data = scannerValueData();
			
			for (int i = data.length() - 1; i >= 0; i--) {
				temp = temp + data.charAt(i);
			}
			System.out.println(temp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		// Kullanıcıdan tarafından girilen bir kelimeyi tersten yazdıran Algoritma
		// yazdığınız kelime kaç harfli
		// yiğit -> tiğiy
		
		// kelimeCevir();
		
		for (;;) {
			_22x2_StringReverse reverse = new _22x2_StringReverse();
			reverse.stringReverse();
		}
		
	}
}
