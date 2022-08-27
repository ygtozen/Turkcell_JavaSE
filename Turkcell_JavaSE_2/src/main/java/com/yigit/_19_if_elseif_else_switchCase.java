package com.yigit;

public class _19_if_elseif_else_switchCase {
	public static void main(String[] args) {
		int number = 15;
		
		if (number == 10) {
			System.out.println("Karar");
			System.out.println("Buyuktur");
		} else if (number == 11) {
			System.out.println("11");
		} else if (number == 12) {
			System.out.println("12");
		} else if (number == 13) {
			System.out.println("13");
		} else if (number == 14) {
			System.out.println("14");
		} else if (number == 15) {
			System.out.println("15");
		} else {
			System.out.println("Sayi disindadir");
		}
		
		System.out.println("***************************");
		
		switch (number) {
			case 10:
				System.out.println("10");
				break;
			case 11:
				System.out.println("11");
				break;
			case 12:
				System.out.println("12");
				break;
			case 13:
				System.out.println("13");
				break;
			case 14:
				System.out.println("14");
				break;
			case 15:
				System.out.println("15");
				break;
			default:
				System.out.println("Sayi disindadir");
				break;
		}
	}
}
