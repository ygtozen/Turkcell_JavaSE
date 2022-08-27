package com.yigit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List : LAV
// List bir interfacedir
// java.util paketinden gelir

// LinkedList : Araya yerleþtirme, silme iþlemlerinde biçilmiþ kaftan
// ArrayList : Ekleme ve arama iþlemlerinde biçilmiþ kaftan
// Verktor : veri defaulta 10 bunun dolacaðýný anladýðýnda dinamik olarak hafýza
// uzayý arttýrýr.

public class _39_List_LAV {
	
	// Liste Döngüsü
	public static void listLoop() {
		List<String> listem = new ArrayList<String>();
		listem.add("Bandirma"); // add : eklemek
		listem.add("Balikesir");
		listem.add("Istanbul");
		
		System.out.println(listem.get(0));
		
		// size : eleman sayýsý
		System.out.println("Eleman sayisi : " + listem.size());
		
		// iterative for döngüsü
		System.out.println("***** iterative for döngüsü *****");
		for (int i = 0; i < listem.size(); i++) {
			System.out.print(listem.get(i) + " ");
		}
		
		// 2-) foreach döngüsü
		System.out.println("***** foreach döngüsü *****");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
		// 3-) Iterator döngüsü - java.util paketinden türer
		System.out.println("***** Iterator döngüsü *****");
		// Iterator iterator = listem.iterator();
		Iterator<String> iterator = listem.iterator();
		while (iterator.hasNext()) { // içerde veri varsa ise
			System.out.print(iterator.next() + " "); // içerdeki datalarý sýra sýra getirir
		}
		
		// 4-) Java 8 gelen Stream API forEach
		System.out.println("***** Stream API forEach *****");
		listem.stream().forEach(System.out::print);
		
		System.out.println("***** Stream API forEach kýsaý *****");
		listem.forEach(System.out::print);
		
	}
	
	public static void main(String[] args) {
		listLoop();
	}
}
