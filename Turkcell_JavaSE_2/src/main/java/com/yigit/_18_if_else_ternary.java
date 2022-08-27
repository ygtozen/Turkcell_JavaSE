package com.yigit;

public class _18_if_else_ternary {
	public static void main(String[] args) {
		int number = 15;
		if (number > 10) {
			System.out.println("Karar");
			System.out.println("Buyuktur");
		} else {
			System.out.println("Kucuktur");
		}
		
		// Ternary
		String result = (number > 10) ? "Buyuktur" : "Kucuktur";
		System.out.println(result);
	}
}
