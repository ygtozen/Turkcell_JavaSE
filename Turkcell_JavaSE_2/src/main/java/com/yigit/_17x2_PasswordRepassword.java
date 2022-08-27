package com.yigit;

import java.util.Scanner;

public class _17x2_PasswordRepassword {
	public static void main(String[] args) {
		
		// Örnek-2 (Password Repassword)
		// kullanıcıdan alınan iki değer karşılaştırma (equals)
		// password - repassword
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Passwrod giriniz : ");
		String password = scanner.nextLine();
		
		System.out.println("Repassord giriniz: ");
		String repassword = scanner.nextLine();
		
		System.out.println("equalas : " + password.equals(repassword));
		System.out.println("equalsIgnoreCase : " + password.equalsIgnoreCase(repassword));
		
		if (password.equals(repassword)) {
			System.out.println("Sifre Aynı");
		} else {
			System.out.println("Sifre Farklı");
		}
	}
}
