package com.yigit;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class _40_Set_HLT1 {
	// set :
	// tekrarsýz veriler kullanmak içindir
	
	// HLT
	// HashSet : Rastgele sýrada bize göster ve tekrarsýz veri
	// LinkedHashSet : Eklediðimiz sýrada bize göster ve tekarsýz veri
	// TreeSet : Küçükten büyüðe tekrarsýz
	// java.util paketinden gelir
	
	// Dikkat YOK ==> get, ÝNDEXoF, lastIndexOf
	
	public static void setTutorials() {
		Set<String> iller = new LinkedHashSet<String>(); // eklediðimiz sýrada
		// Set<String> iller = new HashSet<String>(); // eklediðimiz sýrada olmayan
		// Set<String> iller = new TreeSet<String>(); // küçükten büyüðe sýralama
		iller.add("Malatya");
		iller.add("Elazig");
		iller.add("Bingol");
		iller.add("Diyarbakir");
		iller.add("Malatya");
		
		// Döngü
		for (String temp : iller) {
			System.out.println(temp);
		}
		
		System.out.println("**************");
		
		// Iterator döngü
		Iterator iterator = iller.iterator();
		while (iterator.hasNext()) { // içerda data varsa
			System.out.println(iterator.next()); // sýra sýra getir
		}
		
		// set ==> Array'e çevirmek
		iller.toArray();
		
		// eleman sayýsý
		iller.size();
		
		// Boþmu, dolu mu
		iller.isEmpty();
		
		iller.remove("Diyarbakýr");
		
		// listedeki verileri temizleme
		iller.clear();
	}
	
	public static void main(String[] args) {
		setTutorials();
	}
}
