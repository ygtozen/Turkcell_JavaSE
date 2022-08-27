package com.yigit;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class _40_Set_HLT1 {
	// set :
	// tekrars�z veriler kullanmak i�indir
	
	// HLT
	// HashSet : Rastgele s�rada bize g�ster ve tekrars�z veri
	// LinkedHashSet : Ekledi�imiz s�rada bize g�ster ve tekars�z veri
	// TreeSet : K���kten b�y��e tekrars�z
	// java.util paketinden gelir
	
	// Dikkat YOK ==> get, �NDEXoF, lastIndexOf
	
	public static void setTutorials() {
		Set<String> iller = new LinkedHashSet<String>(); // ekledi�imiz s�rada
		// Set<String> iller = new HashSet<String>(); // ekledi�imiz s�rada olmayan
		// Set<String> iller = new TreeSet<String>(); // k���kten b�y��e s�ralama
		iller.add("Malatya");
		iller.add("Elazig");
		iller.add("Bingol");
		iller.add("Diyarbakir");
		iller.add("Malatya");
		
		// D�ng�
		for (String temp : iller) {
			System.out.println(temp);
		}
		
		System.out.println("**************");
		
		// Iterator d�ng�
		Iterator iterator = iller.iterator();
		while (iterator.hasNext()) { // i�erda data varsa
			System.out.println(iterator.next()); // s�ra s�ra getir
		}
		
		// set ==> Array'e �evirmek
		iller.toArray();
		
		// eleman say�s�
		iller.size();
		
		// Bo�mu, dolu mu
		iller.isEmpty();
		
		iller.remove("Diyarbak�r");
		
		// listedeki verileri temizleme
		iller.clear();
	}
	
	public static void main(String[] args) {
		setTutorials();
	}
}
