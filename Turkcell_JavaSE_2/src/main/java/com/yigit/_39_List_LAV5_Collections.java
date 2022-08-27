package com.yigit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// List : LAV
// List bir interfacedir
// java.util paketinden gelir

// LinkedList : Araya yerle�tirme, silme i�lemlerinde bi�ilmi� kaftan
// ArrayList : Ekleme ve arama i�lemlerinde bi�ilmi� kaftan
// Verktor : veri defaulta 10 bunun dolaca��n� anlad���nda dinamik olarak haf�za
// uzay� artt�r�r.

public class _39_List_LAV5_Collections<T> {
	
	// Collections :
	// java.util paketinden gelir
	// Collections.sort(listem);
	public static void vectorLoop() {
		
		List<String> listem = new ArrayList<String>();
		listem.add("Bandirma"); // add : eklemek
		listem.add("Balikesir");
		listem.add("Istanbul");
		listem.add("Zonguldak");
		
		// sort : Listeyi k���kten b�y��e do�ru s�ralar
		Collections.sort(listem);
		
		// reverse : Listeyi ters �evirir
		// ancak �nce sort yap�p sonra reverse yaparsak: b�y�kten k����e s�ralar
		// Collections.sort(listem);
		// listem.forEach(System.out::println);
		// Collections.reverse(listem);
		
		// shuffle : liste rastgele gelir
		// Collections.shuffle(listem);
		// listem.forEach(System.out::println);
		
		// binarySearch : ikili arama
		// Dikkat : �nce k���kten b�y��e s�ralamal�y�z
		// saymaya s�f�rdan ba�lar
		/*
		 * Collections.sort(listem);
		 * System.out.println(Collections.binarySearch(listem, "Bandirma"));
		 * System.out.println("***** Iterator d�ng�s� *****");
		 * // Iterator iterator = listem.iterator();
		 * Iterator<String> iterator = listem.iterator();
		 * while (iterator.hasNext()) { // i�erde veri varsa ise
		 * System.out.print(iterator.next() + " "); // i�erdeki datalar� s�ra s�ra
		 * getirir
		 * }
		 */
		
		// unmodifiable : bundan sonra listeye veri eklemene istemiyorum.
		listem = Collections.unmodifiableList(listem);
		listem.add("yeni data");
		
	}
	
	public static void main(String[] args) {
		vectorLoop();
	}
}
