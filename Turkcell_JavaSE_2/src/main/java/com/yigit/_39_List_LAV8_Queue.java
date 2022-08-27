package com.yigit;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class _39_List_LAV8_Queue {
	// Queue :
	// queue içim : iki tarafý açýk bir daire düþünebilriz
	// FIFI (First In Firs Out) : ilk giren ilk çýkar
	// java util paketinden gelir
	
	// Verileri alamak için (ekranda göstermek) Iterator kullanmak gerekir
	
	// Bankacýlýk uygulamlarýnda ve oyun programlarýnda sýklýkla kullanýlýr
	
	// push ==> eklemek
	// pop ==> çýkarmak
	// peek == > en üstteki eleman anlamýna gelir
	
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
