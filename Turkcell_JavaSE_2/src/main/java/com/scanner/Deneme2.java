package com.scanner;

import java.util.Scanner;

public class Deneme2 {
	public static void main(String[] args) {
		System.out.println("Throws Exception If Number is of Type Long.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your rollno: ");
		int rollno = scanner.nextInt();
		System.out.println("RollNumber: " + rollno);
		// Close the scanner
		scanner.close();
		System.out.println("Scanner Closed.");
	}
}
