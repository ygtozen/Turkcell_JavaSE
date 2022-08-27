package com.yigit;

import java.util.Scanner;

public class _20x10_Radar {
	
	// GLOBAL VARIABLE
	// Toplam odeme miktarı
	private static int AMOUNT = 0;
	
	// kaç kere geçildi
	private static int HOW_MANY_TIMES = 0;
	
	public static int scannerSpeed() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hizinizi giriniz : ");
		int speed = Math.abs(scanner.nextInt());
		return speed;
	}
	
	// scanner speead method
	public static void radar() {
		int speed = scannerSpeed();
		
		if (80 <= speed && speed <= 94) {
			AMOUNT += 800;
			HOW_MANY_TIMES += 1;
			System.out.println("Hiz : " + speed + " hizli yavaslayin para cezasi : 800\n" + " toplam odenecek para : "
					+ AMOUNT + " " + HOW_MANY_TIMES + " kez hizli gittiniz");
		} else if (95 <= speed && speed <= 119) {
			AMOUNT += 1200;
			HOW_MANY_TIMES += 1;
			System.out.println("Hiz : " + speed + " hizli yavaslayin para cezasi : 800\n" + " toplam odenecek para : "
					+ AMOUNT + " " + HOW_MANY_TIMES + " kez hizli gittiniz");
		} else if (speed >= 120) {
			AMOUNT += 2000;
			HOW_MANY_TIMES += 1;
			System.out.println("Hiz : " + speed + " hizli yavaslayin para cezasi : 800\n" + " toplam odenecek para : "
					+ AMOUNT + " " + HOW_MANY_TIMES + " kez hizli gittiniz");
		} else {
			System.out.println("Normal hız");
		}
		
	}
	
	// radar method
	public static void main(String[] args) {
		
		// Kullanıcı tarafından girilen sayının :
		// hız: 80 yavaşla para cezası: 800
		// hız: 95 orta hızlı yavaşlayın para cezası:1200TL
		// hız: 120 çok hızlı yavaşlayın para cezası:2000
		
		for (;;) {
			radar();
		}
		
	}
}
