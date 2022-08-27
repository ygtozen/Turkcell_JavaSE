package com.yigit;

import java.util.Scanner;

public class _22x3_RegisterPasswordMask {
	
	public static void pass() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Parola giriniz : ");
		String password = scanner.nextLine();
		String yildiz = "";
		String newPassword = "";
		
		if (password.equals("")) {
			System.out.println("Sifre girmediniz");
		} else {
			for (int i = 0; i < password.length() - 2; i++) {
				yildiz = yildiz + "*";
			}
			System.out.println(
					password.charAt(0) + password.replace(password, yildiz) + password.charAt(password.length() - 1));
		}
		
	}
	
	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// kullanıcıdan alınan data
	public String scannerValueData() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("+++++++++++\nbir seyler giriniz");
		String value = klavye.nextLine();
		return value;
	}
	
	// girilen kelimeyi ilk ve son karakter harici maskeleyen algoritma
	public String stringPasswordMask() {
		String value = scannerValueData();
		String temp = "", allValue = ""; // nullPointerException
		for (int i = 0; i < value.length() - 1; i++) {
			if ((value.charAt(i) == value.charAt(0)) || (value.charAt(i) == value.length() - 1))
				continue;
			temp += value.replace(value.charAt(i), '*').charAt(i);
			
		}
		allValue = value.charAt(0) + temp.concat(value.charAt(value.length() - 1) + " ");
		System.out.println(allValue);
		return temp;
	}
	
	public static void main(String[] args) {
		
		// Kullanıcıdan tarafından girilen bir parola için ilk ve son harfi haricinde *
		// eklesin.
		
		// pass();
		
		for (;;) {
			_22x3_RegisterPasswordMask mask = new _22x3_RegisterPasswordMask();
			mask.stringPasswordMask();
		}
	}
}