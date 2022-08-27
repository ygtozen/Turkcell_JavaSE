package com.yigit;

import java.util.LinkedList;
import java.util.List;

// List : LAV
// List bir interfacedir
// java.util paketinden gelir

// LinkedList : Araya yerleþtirme, silme iþlemlerinde biçilmiþ kaftan
// ArrayList : Ekleme ve arama iþlemlerinde biçilmiþ kaftan
// Verktor : veri defaulta 10 bunun dolacaðýný anladýðýnda dinamik olarak hafýza
// uzayý arttýrýr.

public class _39_List_LAV3 {
	
	// Liste Döngüsü
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
