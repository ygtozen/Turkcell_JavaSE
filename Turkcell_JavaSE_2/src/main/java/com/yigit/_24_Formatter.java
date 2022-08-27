package com.yigit;

public class _24_Formatter {
	public static void main(String[] args) {
		String str = "Java verileri";
		int decimal = 44;
		double virgul = 35.44;
		
		System.out.println("alt satıra geçme");
		System.out.println("alt satıra geçebilrisin");
		System.out.println("formatter");
		
		System.out.printf("%s %d %f", str, decimal, virgul);
		System.out.println();
		
		// 25s = sağa ötele
		// 5.2f = .2 vürgülden sonra 2 hane yaz
		System.out.printf("%25s %d %5.2f", str, decimal, virgul);
		System.out.println();
	}
}
