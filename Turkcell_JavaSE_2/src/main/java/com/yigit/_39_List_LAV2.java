package com.yigit;

import java.util.ArrayList;
import java.util.List;

// List : LAV
// List bir interfacedir
// java.util paketinden gelir

// LinkedList : Araya yerle�tirme, silme i�lemlerinde bi�ilmi� kaftan
// ArrayList : Ekleme ve arama i�lemlerinde bi�ilmi� kaftan
// Verktor : veri defaulta 10 bunun dolaca��n� anlad���nda dinamik olarak haf�za
// uzay� artt�r�r.

public class _39_List_LAV2 {
	
	// Java 1.7 gelen
	// unutma : Generic Reference Types kullan
	
	// Liste D�ng�s�
	public static void listLoop() {
		List<String> listem = new ArrayList<String>();
		listem.add("Bandirma"); // add : eklemek
		listem.add("Balikesir");
		listem.add("Istanbul");
		listem.add("Bandirma");
		
		// list : indisler 0 (s�f�rdan) ba�lar
		// get : listedeki veriye eri�mek i�in kullan�l�r
		System.out.println(listem.get(0));
		
		// size : eleman say�s�
		System.out.println("Eleman sayisi : " + listem.size());
		
		// indexOf : S�f�rdan ba�lar
		System.out.println("indexOf : " + listem.indexOf("Bandirma"));
		
		// lastIndexOf : Sa� taraftan aramaya ba�lar
		System.out.println("lastIndexOf : " + listem.lastIndexOf("Bandirma"));
		
		// isEmpty : Bo� mu , Dolu mu
		System.out.println("Bos mu : " + listem.isEmpty());
		
		// remove : Listedeki veriyi siler
		listem.remove(0);
		// listem.remove("Balikesir");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// toArray ==> Listeyi array'e �evirmek i�in kullan�l�r
		// dikkat : Object t�r�ndedir e�er int �evirmek itersem �nce String'e sonra int
		// �evirmek gerekir
		// List ==> Array
		System.out.println("***** Liste to Array d�ng�s� ******");
		Object[] dizi = listem.toArray();
		for (Object temp : dizi) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// subList : Listeden istedi�imiz aral�kta veri g�ndersin
		// subList : S�f�rdan ba�lar
		for (String temp : listem.subList(0, 3)) { // 0 <= X <= 3-1
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// addAll : Bir listeyi ba�ka bir liteye tamamen ekler
		// addAll : yaln�z iki liste ayn� referance type olacak
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
