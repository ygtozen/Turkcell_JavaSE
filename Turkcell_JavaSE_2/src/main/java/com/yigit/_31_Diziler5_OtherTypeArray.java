package com.yigit;

// Eleman sayısı belli olanlar
// Verilerimizi düzgün bir şekilde tutabilek gerektiğinde o verilereerişim
// sağlamak için önemlidir.
// Sıfır(0) indiste başlar
// Tek boyutlu, çift boyutlu olarak devam eder
public class _31_Diziler5_OtherTypeArray {
	
	public static void main(String[] args) {
		Object[] dizi1 = { "merhaba", 9, 6.44, true };
		
		for (Object temp : dizi1) {
			System.out.print(temp + " ");
		}
	}
}
