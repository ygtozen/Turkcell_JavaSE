package com.yigit;

import java.util.Scanner;

public class _17x3_isLetterisDigit {
	public static void main(String[] args) {
		
		// kullanıcıdan alınan iki sayının dört işlem (hesap makinesi)
		// toplama
		// çıkarma
		// çarpma
		// bölme
		// bölümünden kalan
		// bu iki sayının büyük olanın karekökü (Math.sqrt)
		// bu iki sayının küçük olanın mutlak değeri (Mth.sqrt)
		// bu iki sayısan küçük olanın alt değer büyük olanın st değer (Math.pow)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci sayıyı giriniz : ");
		int number1 = scanner.nextInt();
		
		System.out.println("Ikinci sayıyı giriniz : ");
		int number2 = scanner.nextInt();
		
		int toplama = number1 + number2;
		int cikarma = number1 - number2;
		int carpma = number1 * number2;
		int bolme = number1 / 2;
		System.out.println("Toplama : " + toplama);
		System.out.println("Cikarma : " + cikarma);
		System.out.println("Carpma : " + carpma);
		System.out.println("Bolme : " + bolme);
		
		System.out.println("Buyuk sayı Karekok : " + Math.sqrt(Math.max(number1, number2)));
		
		System.out.println("Mutlak deger : " + Math.abs(Math.min(number1, number2)));
		
		// int buyuk = Math.max(number1, number2);
		// int kucuk = Math.min(number1, number2);
		// System.out.println("Pow : " + Math.pow(kucuk, buyuk));
		System.out.println("Pow2 : " + Math.pow(Math.min(number1, number2), Math.max(number1, number2)));
		
		// Örnek-3
		// girilen karakter harf mi, sayı mı, özel simge mi
		
		char karakter = '#';
		if (Character.isDigit(karakter))
			System.out.print("Rakamdır");
		else if (Character.isLetter(karakter))
			System.out.print("Harftir");
		else
			System.out.print("Harf veya rakam değil");
	}
}
