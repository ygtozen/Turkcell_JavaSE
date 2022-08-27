package com.yigit;

import java.util.Random;

public class _12_Random {
	public static void main(String[] args) {
		
		// Random
		double mathRandom = Math.round(Math.random() * 4 + 1);
		System.out.println(mathRandom);
		
		// Class Düzeyinde (object)
		Random random = new Random();
		double classRandom = random.nextDouble(4) + 1;
		System.out.println(classRandom);
	}
}
