package com.yigit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// List : LAV
// List bir interfacedir
// java.util paketinden gelir

// LinkedList : Araya yerleþtirme, silme iþlemlerinde biçilmiþ kaftan
// ArrayList : Ekleme ve arama iþlemlerinde biçilmiþ kaftan
// Verktor : veri defaulta 10 bunun dolacaðýný anladýðýnda dinamik olarak hafýza
// uzayý arttýrýr.

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
		
		// sort : Listeyi küçükten büyüðe doðru sýralar
		Collections.sort(listem);
		
		// reverse : Listeyi ters çevirir
		// ancak önce sort yapýp sonra reverse yaparsak: büyükten küçüðe sýralar
		// Collections.sort(listem);
		// listem.forEach(System.out::println);
		// Collections.reverse(listem);
		
		// shuffle : liste rastgele gelir
		// Collections.shuffle(listem);
		// listem.forEach(System.out::println);
		
		// binarySearch : ikili arama
		// Dikkat : önce küçükten büyüðe sýralamalýyýz
		// saymaya sýfýrdan baþlar
		/*
		 * Collections.sort(listem);
		 * System.out.println(Collections.binarySearch(listem, "Bandirma"));
		 * System.out.println("***** Iterator döngüsü *****");
		 * // Iterator iterator = listem.iterator();
		 * Iterator<String> iterator = listem.iterator();
		 * while (iterator.hasNext()) { // içerde veri varsa ise
		 * System.out.print(iterator.next() + " "); // içerdeki datalarý sýra sýra
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
