package com.yigit;

// Eleman sayısı belli olanlar
// Verilerimizi düzgün bir şekilde tutabilek gerektiğinde o verilereerişim
// sağlamak için önemlidir.
// Sıfır(0) indiste başlar
// Tek boyutlu, çift boyutlu olarak devam eder
public class _31_Diziler7_ArrayInformation {
	
	// array method 1
	public static void arrayMethod(int[] dizi) {
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
	}
	
	// array method2
	public static void arrayMethod2(int... dizi) {
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] dizi = { 1, 2, 3, 4 };
		arrayMethod(dizi);
		System.out.println("\n***************");
		arrayMethod2(dizi);
	}
}
