package com.yigit;

import java.util.ArrayList;
import java.util.List;

// List : LAV
// List bir interfacedir
// java.util paketinden gelir

// LinkedList : Araya yerleþtirme, silme iþlemlerinde biçilmiþ kaftan
// ArrayList : Ekleme ve arama iþlemlerinde biçilmiþ kaftan
// Verktor : veri defaulta 10 bunun dolacaðýný anladýðýnda dinamik olarak hafýza
// uzayý arttýrýr.

public class _39_List_LAV2 {
	
	// Java 1.7 gelen
	// unutma : Generic Reference Types kullan
	
	// Liste Döngüsü
	public static void listLoop() {
		List<String> listem = new ArrayList<String>();
		listem.add("Bandirma"); // add : eklemek
		listem.add("Balikesir");
		listem.add("Istanbul");
		listem.add("Bandirma");
		
		// list : indisler 0 (sýfýrdan) baþlar
		// get : listedeki veriye eriþmek için kullanýlýr
		System.out.println(listem.get(0));
		
		// size : eleman sayýsý
		System.out.println("Eleman sayisi : " + listem.size());
		
		// indexOf : Sýfýrdan baþlar
		System.out.println("indexOf : " + listem.indexOf("Bandirma"));
		
		// lastIndexOf : Sað taraftan aramaya baþlar
		System.out.println("lastIndexOf : " + listem.lastIndexOf("Bandirma"));
		
		// isEmpty : Boþ mu , Dolu mu
		System.out.println("Bos mu : " + listem.isEmpty());
		
		// remove : Listedeki veriyi siler
		listem.remove(0);
		// listem.remove("Balikesir");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// toArray ==> Listeyi array'e çevirmek için kullanýlýr
		// dikkat : Object türündedir eðer int çevirmek itersem önce String'e sonra int
		// çevirmek gerekir
		// List ==> Array
		System.out.println("***** Liste to Array döngüsü ******");
		Object[] dizi = listem.toArray();
		for (Object temp : dizi) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// subList : Listeden istediðimiz aralýkta veri göndersin
		// subList : Sýfýrdan baþlar
		for (String temp : listem.subList(0, 3)) { // 0 <= X <= 3-1
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// addAll : Bir listeyi baþka bir liteye tamamen ekler
		// addAll : yalnýz iki liste ayný referance type olacak
		List<String> yeniListem = new ArrayList();
		yeniListem.add("44");
		yeniListem.add("34");
		yeniListem.addAll(listem);
		yeniListem.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		listLoop();
	}
}
