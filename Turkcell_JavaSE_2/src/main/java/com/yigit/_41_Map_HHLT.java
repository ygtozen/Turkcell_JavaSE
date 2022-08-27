package com.yigit;
// ArrayList ve HashMap<>() çok önemli

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class _41_Map_HHLT {
	
	// map :
	// key value þeklinde çalýþýr
	// bir interfacedir
	// Generics yapýlarla berber kullanýlýr
	// Map<Key ,Value> ==> Map<String, Object>
	// unutma : Key unique olmalýdýr
	// java.util paketinden gelir
	
	// map kullaným alanlarý
	// API Servisleri
	// JSON
	// Database olmadýðý durumlarda
	
	// HHLT
	// HashTable : null veremezsiniz
	// HashMap : Rastgele sýrada bize göster (ekleme sýrasý indis önemli deðilse)
	// LinkedHashMap : Eklediðimiz sýrada göster (Ekleme sýrasý indis öenmli ise)
	// TreeMap : Küçükten büyüðe göster
	
	public static String randomUUID() {
		
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static void mapTutorials() {
		Map<String, Object> mapList = new HashMap<String, Object>();
		// Map<String, Object> mapList = new LinkedHashMap<String, Object>();
		// Map<String, Object> mapList = new TreeMap<String, Object>();
		mapList.put(randomUUID(), "Istanbul");
		mapList.put(randomUUID(), "Izmir");
		mapList.put(randomUUID(), "Bursa");
		mapList.put(randomUUID(), "Ankara");
		
		System.out.println("** 1-)KEY **");
		for (String key : mapList.keySet()) {
			System.out.print(key + " ");
		}
		
		System.out.println("\n** 2-) VALUE **");
		for (Object key : mapList.values()) {
			System.out.print(key + " ");
		}
		
		System.out.println("\n** 3-) KEY - VALUE **");
		for (String key : mapList.keySet()) {
			System.out.println(key + " " + mapList.get(key));
		}
		
		System.out.println("\n** 4-) Iterator **");
		// Key benzersiz olmak zorunda : ve key için Set kullanacaðýz
		Set<String> set = mapList.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(mapList.get(iterator.next()));
		}
		
		System.out.println("\n** 5-) M-E-LES **");
		for (Map.Entry<String, Object> temp : mapList.entrySet()) {
			System.out.println(temp);
		}
		
		System.out.println("\n** 6-) Stream ForEach **");
		mapList.entrySet().forEach(System.out::println);
		
		// eleman sayýsý
		mapList.size();
		
		// String'e çevirmek
		mapList.toString();
		
		// has code
		mapList.hashCode();
		
		// ilgili veriyi getir
		mapList.get(0);
		
	}
	
	public static void main(String[] args) {
		mapTutorials();
	}
}
