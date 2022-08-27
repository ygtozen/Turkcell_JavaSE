package com.yigit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List : LAV
// List bir interfacedir
// java.util paketinden gelir

// LinkedList : Araya yerle�tirme, silme i�lemlerinde bi�ilmi� kaftan
// ArrayList : Ekleme ve arama i�lemlerinde bi�ilmi� kaftan
// Verktor : veri defaulta 10 bunun dolaca��n� anlad���nda dinamik olarak haf�za
// uzay� artt�r�r.

public class _39_List_LAV {
	
	// Liste D�ng�s�
	public static void listLoop() {
		List<String> listem = new ArrayList<String>();
		listem.add("Bandirma"); // add : eklemek
		listem.add("Balikesir");
		listem.add("Istanbul");
		
		System.out.println(listem.get(0));
		
		// size : eleman say�s�
		System.out.println("Eleman sayisi : " + listem.size());
		
		// iterative for d�ng�s�
		System.out.println("***** iterative for d�ng�s� *****");
		for (int i = 0; i < listem.size(); i++) {
			System.out.print(listem.get(i) + " ");
		}
		
		// 2-) foreach d�ng�s�
		System.out.println("***** foreach d�ng�s� *****");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
		// 3-) Iterator d�ng�s� - java.util paketinden t�rer
		System.out.println("***** Iterator d�ng�s� *****");
		// Iterator iterator = listem.iterator();
		Iterator<String> iterator = listem.iterator();
		while (iterator.hasNext()) { // i�erde veri varsa ise
			System.out.print(iterator.next() + " "); // i�erdeki datalar� s�ra s�ra getirir
		}
		
		// 4-) Java 8 gelen Stream API forEach
		System.out.println("***** Stream API forEach *****");
		listem.stream().forEach(System.out::print);
		
		System.out.println("***** Stream API forEach k�sa� *****");
		listem.forEach(System.out::print);
		
	}
	
	public static void main(String[] args) {
		listLoop();
	}
}
