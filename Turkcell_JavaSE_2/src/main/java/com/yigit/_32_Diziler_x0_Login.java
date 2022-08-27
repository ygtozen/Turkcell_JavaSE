package com.yigit;

import java.util.Scanner;

// Kullanıcıdan alınan bilgilere göre doğru kullanıcı adı ve şifresini girerse
// sisteme giriş sağlanacak
// yoksa deneme hakkı 4'ten başlayarak aşağıya doğru azalacak
// deneme hakkı eğer 0 olursa sistemden atacak ve hesabı bloke olacak. Bu
// algoritmayı dizi ile yapalım

// Not: kullanıcıdan alınan username ve password String[] dizi metodu olacak
// default kullanıcı adı : admin
// default şifre : root
public class _32_Diziler_x0_Login {
	
	// Class değişkenlerimiz
	private static int COUNTER = 4; // hak
	private static final String DEFAULT_USERNAME = "admin";
	private static final String DEFAULT_PASSWORD = "root";
	
	// username, password dizi
	private static String[] userLogin() {
		Scanner klavye = new Scanner(System.in);
		String userName, userPassword;
		
		System.out.println("Lutfen username giriniz : ");
		userName = klavye.nextLine();
		System.out.println("Lutfen password giriniz : ");
		userPassword = klavye.nextLine();
		
		String[] arr = { userName, userPassword };
		
		for (String temp : arr) {
			System.out.print(temp + " ");
		}
		return arr;
	}
	
	// admin page
	private static void adminMethod() {
		System.out.println("ADMIN PAGE HOSGELDINIZ");
		System.exit(0);
	}
	
	// validation (doğrulama)
	public static void userValidation(String[] arr) {
		String[] userInfo = arr;
		
		if (COUNTER >= 0) {
			if (userInfo[0].equals(DEFAULT_USERNAME) && userInfo[1].equals(DEFAULT_PASSWORD)) {
				System.out.println("Admin sayfasina gidiyorsunuz");
				adminMethod();
			} else {
				COUNTER--;
				System.out.println("Kalan hakkiniz : " + COUNTER);
				if (COUNTER == 0) {
					System.out.println("Hakkiniz kalmadi hesabiniz bloke oldu admine basvurunuz. 05..");
					System.exit(0);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		while (true) {
			String[] dizi = userLogin();
			userValidation(dizi);
		}
	}
	
}
