package com.yigit;

import java.util.Scanner;

public class _20x4_WeekingDay {
	public static void main(String[] args) {
		
		// Kullanıcıdan gun switch case hangi gun
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gun giriniz : ");
		String gun = scanner.nextLine();
		
		switch (gun) {
			case "pazartesi":
				System.out.println("Pazartesi");
				break;
			case "sali":
				System.out.println("Sali");
				break;
			case "carsamba":
				System.out.println("Carsamba");
				break;
			case "persembe":
				System.out.println("Persembe");
				break;
			case "cuma":
				System.out.println("Cuma");
				break;
			case "cumartesi":
				System.out.println("Cumartesi");
				break;
			case "pazar":
				System.out.println("Pazar");
				break;
			default:
				System.out.println("Haftanin gunleri disinda");
		}
	}
}
