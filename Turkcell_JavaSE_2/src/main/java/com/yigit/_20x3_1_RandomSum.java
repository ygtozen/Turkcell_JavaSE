package com.yigit;

import java.util.Random;

public class _20x3_1_RandomSum {
	public static void main(String[] args) {
		// Örnek: 1-10 arasında 5 tane random sayı üretelim ? (Random, for) ve bunları
		// toplayalım
		
		Random rastgele = new Random();
		int sum = 0;
		int temp = 0;
		for (int i = 1; i <= 5; i++) {
			temp = (rastgele.nextInt(10) + 1);
			sum = sum + temp;
		}
		System.out.println("Toplam : " + sum);
	}
}
