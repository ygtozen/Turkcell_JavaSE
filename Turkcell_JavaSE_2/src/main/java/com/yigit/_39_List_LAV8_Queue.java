package com.yigit;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class _39_List_LAV8_Queue {
	// Queue :
	// queue i�im : iki taraf� a��k bir daire d���nebilriz
	// FIFI (First In Firs Out) : ilk giren ilk ��kar
	// java util paketinden gelir
	
	// Verileri alamak i�in (ekranda g�stermek) Iterator kullanmak gerekir
	
	// Bankac�l�k uygulamlar�nda ve oyun programlar�nda s�kl�kla kullan�l�r
	
	// push ==> eklemek
	// pop ==> ��karmak
	// peek == > en �stteki eleman anlam�na gelir
	
	public static void queuqMethod() {
		Queue<String> queue = new LinkedList<String>();
		queue.add("1.eleman");
		queue.add("2.eleman");
		queue.add("3.eleman");
		queue.add("100.eleman");
		
		System.out.println("En ustteki eleman : " + queue.peek());
		
		System.out.println("******************");
		
		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		queue.clear();
	}
	
	public static void main(String[] args) {
		queuqMethod();
	}
}
