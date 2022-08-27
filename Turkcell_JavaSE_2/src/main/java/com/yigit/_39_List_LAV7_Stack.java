package com.yigit;

import java.util.Stack;

public class _39_List_LAV7_Stack {
	
	// stack:
	// LIFO (Last In First Out) ==> Son giren ilk ��kar
	// java.util paketinden gelir
	// Oyun programlamada s�kl�kla kullan�l�r
	
	// push ==> eklemek
	// pop ==> ��karmak
	// peek == > en �stteki eleman anlam�na gelir
	
	public static void stackMethod() {
		Stack<String> stack = new Stack<String>();
		stack.push("1.eleman");
		stack.push("2.eleman");
		stack.push("3.eleman");
		stack.push("en ust kat");
		stack.push("100.eleman");
		
		System.out.println("En ustteki eleman : " + stack.peek());
		
		System.out.println("******************");
		
		// en �st elemandan veri ��kart�r
		stack.pop();
		
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
		System.out.println("******************");
		
		stack.push("101.eleman");
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
		
		stack.remove(0);
		stack.clear();
	}
	
	public static void main(String[] args) {
		stackMethod();
	}
	
}
