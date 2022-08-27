package com.yigit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class _0_AllCodeJar {
	static Scanner klavye = new Scanner(System.in);
	
	public static String scannerData() {
		
		System.out.println("Kelime giriniz : ");
		String kelime = klavye.nextLine();
		return kelime;
	}
	
	public static String userString() {
		
		System.out.println("Kelime giriniz : ");
		return klavye.nextLine();
	}
	
	// String ters yazd�rmak StringReverse
	public static void StringReverse() {
		String kelime = scannerData();
		String yeniKelime = "";
		
		for (int i = kelime.length() - 1; i >= 0; i--) {
			yeniKelime = yeniKelime + kelime.charAt(i);
		}
		
		System.out.println(yeniKelime);
	}
	
	// Palindrom
	public static boolean isPalindrom() {
		try {
			String orijinalData = scannerData();
			String changeData = "";
			for (int i = orijinalData.length() - 1; i >= 0; i--) {
				changeData = changeData + orijinalData.charAt(i);
			}
			
			if (orijinalData.equals(changeData)) {
				System.out.println("Palindrom dur");
				return true;
			} else {
				System.out.println("Palindrom degildir");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}
	
	// verilen bir simgenin harf mi, say� m�, �zel simge mi
	
	// Faktoriyel
	public static boolean isFactoriyel() {
		
		try {
			int number = Integer.valueOf(scannerData());
			int factoriyelNumber = 1; // �arpma etkisiz eleman birdir
			
			if (number < 0) {
				System.out.println("Sifirdan kucuk sayi giremezsiniz");
			} else if (number == 0 || number == 1) {
				System.out.println("0! veya 1! cevab� : 1");
			} else {
				for (int i = number; i > 1; i--) {
					factoriyelNumber *= i;
				}
				System.out.println("Sonuc : " + factoriyelNumber);
				return true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}
	
	// vki (kilo / boy) * boy
	public static String vki(double kilo, double boy) {
		
		double result = kilo / (boy * boy);
		System.out.println(result);
		return null;
	}
	
	// degreetoFahrenhayt degree*9/5+32
	public static double degreeToFahranhayt(double degree) {
		
		return (degree * 9) / 5 + 32;
	}
	
	// isOldEvenNumber
	public static boolean isOddEvenNumber(int number) {
		
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// devam etmek i�in bir tu�a bas�n
	public static void continuesScanner() {
		System.out.println("Devam etmek i�in bir tu�a bas�n�z : ");
		klavye.nextLine();
	}
	
	// nowDateString
	public static String nowDateString() {
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
		Date date = new Date();
		return simpleDateFormat.format(date);
	}
	
	// isNegativePositive
	public static boolean isNgeativePositive(int number) {
		if (number < 0)
			return false;
		
		return true;
	}
	
	// asal sayi
	public static boolean isPrime(int number) {
		boolean result = false;
		
		if (number < 0)
			System.out.println("Sifirdan kucuk sayi veremzsin");
		else if (number == 2)
			System.out.println("En kucuk ve ve tek cift sayi 2 asal sayidir");
		else {
			for (int i = 2; i < number; i++) {
				// sayi 2'ye b�l�n�yorsa asal sayi de�ildir
				if (number % i == 0)
					// d�ng�deki erhangi bir say�ya b�l�n�yorsa alas say� de�ildir
					result = true;
			}
			if (result) {
				System.out.println("Asal sayi degildir");
			} else {
				System.out.println(number + " sayisi asal sayidir");
			}
		}
		
		return true;
	}
	
	// userString
	public static String userString(String value) {
		System.out.println("+++++++++++\n" + value + " giriniz");
		return klavye.nextLine();
	}
	
	// userNumber
	public static int userNumber(String value) {
		System.out.println("+++++++++++\n" + value + " giriniz");
		return klavye.nextInt();
	}
	
	// starDownUpDiagonal (Dizi)
	public static void starDownUpDiagonal() {
		int matrixNumber = userNumber("matrix i�in bir say� giriniz");
		String[][] matrix = new String[matrixNumber][matrixNumber];
		
		String diagonalSymbol = "0", upSymbol = "1", downSymbol = "2";
		
		diagonalSymbol = userString("diagonal i�in simge giriniz ");
		klavye.hasNext();
		
		upSymbol = userString("diagonal diagonal �st� i�in simge giriniz");
		klavye.hasNext();
		
		downSymbol = userString("diagonal diagonal alt� i�in simge giriniz");
		klavye.hasNext();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i < j)
					System.out.print(upSymbol + " ");
				else if (i > j)
					System.out.print(downSymbol + " ");
				else if (i == j)
					System.out.print(diagonalSymbol + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		// faktoriyel
		// isFactoriyel();
		
		// vki (kilo / boy) * boy
		
		// degreetoFahrenhayt degree*9/5+32
		
		// isOldEvenNumber
		
		// devam etmek i�in bir tu�a bas�n
		
		// nowDateString
		
		// isNegativePositive
		
		// asal sayi
		// isPrime(7);
		
		// startDownUpDioganal
		starDownUpDiagonal();
		
		// fibonacci sayısı
		
		// Mükemmel sayı
		
		// de�i�ken kullanmadan 2 say�y�y� g�stermeke
		
		// isLetter isDigit
		
		// Random UUID
		
		// Password Mask
		
		// Ebob
		
		// Ekok
		
		// String ters yazmak
		// StringReverse();
		
		// Polindrom : Girilen bir kelimenin tersten okunu�u ayn� ise
		// isPalindrom();
	}
	
}
