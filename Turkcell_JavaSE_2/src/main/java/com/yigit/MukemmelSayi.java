package com.yigit;

import java.util.Scanner;

public class MukemmelSayi {
	
	public static int useData() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		int number = klavye.nextInt();
		return number;
	}
	
	public static void mukemmelSayi() {
		int data = useData();
		int sum = 0;
		for (int i = 1; i < data; i++) {
			if (data % i == 0) {
				sum = sum + i;
			}
		}
		if (data == sum) {
			System.out.println(data + " mukemmel sayidir");
		} else {
			System.out.println(data + " mukemmel sayi degildir");
		}
		
	}
	
	public static void main(String[] args) {
		mukemmelSayi();
	}
}
