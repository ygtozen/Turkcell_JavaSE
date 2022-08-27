package com.yigit;

import java.util.Vector;

// List : LAV
// List bir interfacedir
// java.util paketinden gelir

// LinkedList : Araya yerleþtirme, silme iþlemlerinde biçilmiþ kaftan
// ArrayList : Ekleme ve arama iþlemlerinde biçilmiþ kaftan
// Verktor : veri defaulta 10 bunun dolacaðýný anladýðýnda dinamik olarak hafýza
// uzayý arttýrýr.

public class _39_List_LAV4<T> {
	
	// Vector : 1.2 sürümünden bu zamana kadar gelen dinamik dizi için
	// kullanabiliriz
	// java.util paketinden gelir
	// defaultta 10 eleman olarak yazýlýr
	public static void vectorLoop() {
		
		// Generic olmadan yazýlan vektor
		Vector vector = new Vector();
		vector.add("Bandirma"); // add : eklemek
		vector.add("Balikesir");
		vector.add("Istanbul");
		vector.add("Bandirma");
		
		System.out.println("\n***** Generic olmadan yazilan vektor ******");
		for (Object temp : vector) {
			System.out.print(temp + " ");
		}
		
		// Generic olan yazýlan vektor
		Vector<String> vector2 = new Vector<String>();
		vector2.add("Bandirma"); // add : eklemek
		vector2.add("Balikesir");
		vector2.add("Istanbul");
		vector2.add("Bandirma");
		
		System.out.println("\n***** Generic olan yazilan vektor ******");
		for (Object temp : vector) {
			System.out.print(temp + " ");
		}
		
		Vector<String> vector3 = new Vector<String>(4);
		vector3.add("Bandirma"); // add : eklemek
		vector3.add("Balikesir");
		vector3.add("Istanbul");
		vector3.add("Bandirma");
		
		System.out.println("\n***** Generic olan yazilan vektor ******");
		for (Object temp : vector) {
			System.out.print(temp + " ");
		}
		
	}
	
	public static void main(String[] args) {
		vectorLoop();
	}
}
