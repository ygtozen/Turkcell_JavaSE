package com.yigit;

import java.util.Random;

// Rastgele 1 <= X <= 10 oluşturulan 5 tane random orijinalArray adında int
// dizisi oluşturalım
// Oluşturulan bu diziyi(orijinalArray) cloneArray dizisine clone(iterative ve
// dizi metoduyla yapalım)

public class _32_Diziler_x1_CloneArray {
	private static int[] orijinalArray = new int[5];
	private static int[] cloneArray = new int[5];
	
	public static void randomNumber() {
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			int numberRandom = random.nextInt(1, 11);
			orijinalArray[i] = numberRandom;
		}
		
		for (int r : orijinalArray) {
			System.out.print(r + " ");
		}
		
	}
	
	// iterative clone
	public static void iterativeClone() {
		for (int i = 0; i < orijinalArray.length; i++) {
			cloneArray[i] = orijinalArray[i];
		}
		
		for (int temp : cloneArray) {
			System.out.print(temp + " ");
		}
	}
	
	// clone method
	public static void cloneMethod() {
		cloneArray = orijinalArray.clone();
		for (int temp : cloneArray) {
			System.out.print(temp + " ");
		}
	}
	
	public static void main(String[] args) {
		randomNumber();
		System.out.println("\n************");
		cloneMethod();
		System.out.println("\n************");
		iterativeClone();
	}
}
