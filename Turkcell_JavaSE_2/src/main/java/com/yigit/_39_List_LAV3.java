package com.yigit;

import java.util.LinkedList;
import java.util.List;

// List : LAV
// List bir interfacedir
// java.util paketinden gelir

// LinkedList : Araya yerle�tirme, silme i�lemlerinde bi�ilmi� kaftan
// ArrayList : Ekleme ve arama i�lemlerinde bi�ilmi� kaftan
// Verktor : veri defaulta 10 bunun dolaca��n� anlad���nda dinamik olarak haf�za
// uzay� artt�r�r.

public class _39_List_LAV3 {
	
	// Liste D�ng�s�
	public static void listLoop() {
		
		List<String> listem = new LinkedList<String>();
		listem.add("Bandirma");
		listem.add("Balikesir");
		listem.add("Istanbul");
		listem.add("Bandirma");
		
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
	}
	
	public static void main(String[] args) {
		listLoop();
	}
}
