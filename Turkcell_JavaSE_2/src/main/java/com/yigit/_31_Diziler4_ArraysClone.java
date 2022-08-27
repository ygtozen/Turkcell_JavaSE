package com.yigit;

// Eleman sayısı belli olanlar
// Verilerimizi düzgün bir şekilde tutabilek gerektiğinde o verilereerişim
// sağlamak için önemlidir.
// Sıfır(0) indiste başlar
// Tek boyutlu, çift boyutlu olarak devam eder
public class _31_Diziler4_ArraysClone {
	
	public static void main(String[] args) {
		int[] dizi1 = { 1, 9, 6, 2 };
		int[] dizi2 = dizi1.clone();
		
		for (int temp : dizi2) {
			System.out.print(temp + " ");
		}
	}
}
