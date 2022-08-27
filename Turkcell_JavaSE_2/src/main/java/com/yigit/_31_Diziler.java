package com.yigit;

import java.util.Arrays;

// Eleman sayısı belli olanlar
// Verilerimizi düzgün bir şekilde tutabilek gerektiğinde o verilereerişim
// sağlamak için önemlidir.
// Sıfır(0) indiste başlar
// Tek boyutlu, çift boyutlu olarak devam eder

// binarySearch yapmadan önce sort işlemi yapmamız gerekir
// Arrays.binarySearch() : ikili arama algoritması
// dikkat binarySearch sıralaması gerekir önce Arrays.sort(dizi) yapmamız
// gerekir
// Eğer dizide eleman varsa indis döner yoksa negatif sayı döner
public class _31_Diziler {
	
	public static void main(String[] args) {
		
		int[] dizi = { 1, 9, 6, 2 };
		int[] dizi2 = { 1, 9, 6, 2 };
		
		if (dizi.equals(dizi2)) {
			System.out.println("Dizilerdeki elemanlar birebir ayni");
		} else {
			System.out.println("Dizilerdeki elemanlar birebir ayni değildir");
		}
		
		boolean retval = Arrays.equals(dizi, dizi2);
		System.out.println(retval);
		
		// sort ==> diziyi sıralamak için kullanılır
		Arrays.sort(dizi);
		
		int number = 9;
		int result = Arrays.binarySearch(dizi, number);
		if (result > 0) {
			System.out.println("Aradiginiz sayi " + number + " vardir. " + result + " .indistedir");
		} else {
			System.out.println("Aradiginiz sayi yoktur");
		}
		
		// forEach dongusu: Sadece ekranda gostermek istiyorsak
		// forEach dongusu : indisi numarası bize gerekmiyorsa
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
	}
}
