package com.yigit;

// Eleman sayısı belli olanlar
// Verilerimizi düzgün bir şekilde tutabilek gerektiğinde o verilereerişim
// sağlamak için önemlidir.
// Sıfır(0) indiste başlar
// Tek boyutlu, çift boyutlu olarak devam eder
public class _31_Diziler6_MultipleArray {
	
	public static void main(String[] args) {
		
		// multiple Array
		int[][] matrix = new int[3][3];
		matrix[0][0] = 0;
		matrix[0][1] = 1;
		matrix[0][2] = 2;
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		matrix[1][2] = 5;
		matrix[2][0] = 6;
		matrix[2][1] = 7;
		matrix[2][2] = 8;
		
		// iterative lenght olmadan
		for (int i = 0; i < 3; i++) { // satır
			for (int j = 0; j < 3; j++) { // sutun
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("**************");
		
		for (int i = 0; i < matrix.length; i++) { // satır
			for (int j = 0; j < matrix[i].length; j++) { // sutun
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("**************");
	}
}
