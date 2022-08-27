package com.scanner;

import java.util.Scanner;

public class Deneme {
	
	public static void main(String[] args) {
		System.out.print("Enter Your Name: ");
		// Create a scanner with the specified Object
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Name: " + name);
		// Close the scanner
		scanner.close();
		System.out.println("Scanner Closed.");
		
		try {
			String surname = scanner.next();
			System.out.println("Surname" + name);
		} catch (Exception e) {
			System.out.println("Scanner sınıfı kapalı");
		}
		
	}
	
}
