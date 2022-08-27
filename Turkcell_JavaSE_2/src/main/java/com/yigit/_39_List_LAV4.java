package com.yigit;

import java.util.Vector;

// List : LAV
// List bir interfacedir
// java.util paketinden gelir

// LinkedList : Araya yerle�tirme, silme i�lemlerinde bi�ilmi� kaftan
// ArrayList : Ekleme ve arama i�lemlerinde bi�ilmi� kaftan
// Verktor : veri defaulta 10 bunun dolaca��n� anlad���nda dinamik olarak haf�za
// uzay� artt�r�r.

public class _39_List_LAV4<T> {
	
	// Vector : 1.2 s�r�m�nden bu zamana kadar gelen dinamik dizi i�in
	// kullanabiliriz
	// java.util paketinden gelir
	// defaultta 10 eleman olarak yaz�l�r
	public static void vectorLoop() {
		
		// Generic olmadan yaz�lan vektor
		Vector vector = new Vector();
		vector.add("Bandirma"); // add : eklemek
		vector.add("Balikesir");
		vector.add("Istanbul");
		vector.add("Bandirma");
		
		System.out.println("\n***** Generic olmadan yazilan vektor ******");
		for (Object temp : vector) {
			System.out.print(temp + " ");
		}
		
		// Generic olan yaz�lan vektor
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
