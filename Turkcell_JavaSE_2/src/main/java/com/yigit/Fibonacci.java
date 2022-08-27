package com.yigit;

import java.util.Scanner;

public class Fibonacci {
	
	// use data
	public static int useData() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int number = klavye.nextInt();
		return number;
	}
	
	// iterative
	public static Integer iterativeFibonacci(int number) {
		if (number <= 1) {
			return number;
		}
		int fib = 1;
		int prevFib = 1;
		
		for (int i = 2; i < number; i++) {
			int temp = fib;
			fib += prevFib;
			prevFib = temp;
		}
		return fib;
	}
	
	// recursive
	public static int recursiveFibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return recursiveFibonacci(n - 2) + recursiveFibonacci(n - 1);
	}
	
	public static void chooiseMethod() throws YigitOzenException {
		System.out.println("seçim yapınız\n1-)iterative fibonacci\2-)recursive fibonacci\3-)Çıkış");
		
		Scanner klavye = new Scanner(System.in);
		int chooise = klavye.nextInt();
		switch (chooise) {
			case 1:
				for (;;) {
					int result = useData();
					for (int i = 0; i < result; i++) {
						System.out.print(iterativeFibonacci(i) + " ");
					}
				}
			case 2:
				while (true) {
					int result = useData();
					System.out.print("Fibonacci Series of " + result + " numbers: ");
					for (int i = 0; i < result; i++) {
						System.out.print(recursiveFibonacci(i) + " ");
					}
				}
			case 3:
				System.out.println("Çıkış yapılıyor");
				break;
			
			default:
				System.out.println("Farklı bir seçim");
		}
	}
	
	public static void main(String[] args) throws YigitOzenException {
		chooiseMethod();
	}
	
}
