package com.yigit;
// ArrayList ve HashMap<>() �ok �nemli

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class _41_Map_HHLT {
	
	// map :
	// key value �eklinde �al���r
	// bir interfacedir
	// Generics yap�larla berber kullan�l�r
	// Map<Key ,Value> ==> Map<String, Object>
	// unutma : Key unique olmal�d�r
	// java.util paketinden gelir
	
	// map kullan�m alanlar�
	// API Servisleri
	// JSON
	// Database olmad��� durumlarda
	
	// HHLT
	// HashTable : null veremezsiniz
	// HashMap : Rastgele s�rada bize g�ster (ekleme s�ras� indis �nemli de�ilse)
	// LinkedHashMap : Ekledi�imiz s�rada g�ster (Ekleme s�ras� indis �enmli ise)
	// TreeMap : K���kten b�y��e g�ster
	
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
		// Key benzersiz olmak zorunda : ve key i�in Set kullanaca��z
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
		
		// eleman say�s�
		mapList.size();
		
		// String'e �evirmek
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
