package com.yigit;

import java.util.Scanner;

public class _20x7_VizeFinal {
	
	// Kullanıcıdan aldığım vize final notuna göre geçme (otalama)
	// not oralaması490 kaldı
	// not oralaması 50 geçti
	// not oralaması 55 < 70 bb
	// not oralaması 70 < 84 ba
	// not oralaması 85 < 100 aa
	// Eğer kullanıcı 0 değer girerse sistemden atsın bunun haricinde sürekli
	// vize final sorsun
	
	// while loop ==> while(true) -> sonsuz döngü
	// for loop ==> for(;;){} -> sonsuz döngü
	public static void vizeFinal() {
		Scanner scanner = new Scanner(System.in);
		int vizeNot, finalNot;
		double ortalama = 0;
		
		System.out.println("Vize notunuzu giriniz : ");
		vizeNot = scanner.nextInt();
		System.out.println("Final notu giriniz : ");
		finalNot = scanner.nextInt();
		ortalama = Math.round(vizeNot * 0.4 + finalNot * 0.6);
		if (ortalama >= 0 && ortalama <= 54) {
			System.out.println("Kaldınız - FF");
		} else if (ortalama >= 55 && ortalama <= 69) {
			System.out.println("Geçtiniz - BB - " + ortalama);
		} else if (ortalama >= 70 && ortalama <= 84) {
			System.out.println("Geçtiniz - BA - " + ortalama);
		} else if (ortalama >= 85 && ortalama <= 100) {
			System.out.println("Geçtiniz - AA - " + ortalama);
		} else {
			System.out.println("Dışına çıkıldı " + ortalama);
		}
		
	}
	
	public static void sonsuzDongu() {
		Scanner scanner = new Scanner(System.in);
		int vizeNot, finalNot;
		
		while (true) {
			System.out.println("Vize notunuzu giriniz : ");
			vizeNot = scanner.nextInt();
			
			System.out.println("Final notu giriniz : ");
			finalNot = scanner.nextInt();
			
			if (vizeNot == 0 && finalNot == 0) {
				System.out.println("Sistemden atildiniz");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		// vizeFinal();
		sonsuzDongu();
		
		// Kullanıcıdan aldığım vize final notuna göre geçme (otalama)
		// not oralaması490 kaldı
		// not oralaması 50 geçti
		// not oralaması 55 < 70 bb
		// not oralaması 70 < 84 ba
		// not oralaması 85 < 100 aa
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Vize notunuzu giriniz : ");
		 * int vize = scanner.nextInt();
		 * System.out.println("Final notu giriniz : ");
		 * int _final = scanner.nextInt();
		 * int ortalama = (vize + _final) / 2;
		 * if (ortalama < 50) {
		 * System.out.println("Kaldi");
		 * } else if (ortalama == 50) {
		 * System.out.println("Gecti");
		 * } else if (ortalama >= 55 && ortalama <= 70) {
		 * System.out.println("BB");
		 * } else if (ortalama >= 71 && ortalama <= 84) {
		 * System.out.println("BA");
		 * } else if (ortalama >= 85 && ortalama <= 100) {
		 * System.out.println("AA");
		 * } else {
		 * System.out.println("Geçerli not giriniz");
		 * }
		 */
		
		// +++++++++++++++++++++++++++++++++++++++
		
	}
	
}
