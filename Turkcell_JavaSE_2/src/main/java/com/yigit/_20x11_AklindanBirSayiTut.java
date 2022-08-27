package com.yigit;

import java.util.Scanner;

public class _20x11_AklindanBirSayiTut {
	
	public static int scannerSpeed() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayi tutunuz (1 - 100) :  ");
		int number = Math.abs(scanner.nextInt());
		return number;
	}
	
	// scanner speead method
	public static void sayiTut() {
		Scanner scanner = new Scanner(System.in);
		int number = scannerSpeed();
		
		System.out.println("Simdi su adimlari yapalim");
		System.out.println("Tuttugunuz sayiyi 2 ile carpin ve 22 ekleyin  : ");
		System.out.println("Bu sayiyi 2 ye bol");
		System.out.println("Bu sayıdan il sayıyı cikartin : ");
		
		System.out.println("Klavyeden herhangi bir tusa bas : ");
		scanner.hasNext();
		
		int sonuc = (((number * 2) + 22) / 2) - number;
		System.out.println("Sonuc : " + sonuc);
	}
	
	// radar method
	public static void main(String[] args) {
		
		// Bir sayi soyluyoruz ve çıkan sonucu tahmin ediyoruz
		// sonuc her zaman 11 çıkıyor
		// kullanıcıdan alınan sayının sonucunu tahmin etmek
		
		// adim1: tuttugunuz sayiyi 2 ile carpin
		// adim2: sonuca 22 ekleyin
		// adim: cikan sonucu 2 ye bol
		// adim4 : bu sayiyi ilk sayidan cikar
		// formul = int sonuc = (((sayi * 2) + 22) / 2) - sayi)
		
		for (;;) {
			sayiTut();
		}
		
	}
}
