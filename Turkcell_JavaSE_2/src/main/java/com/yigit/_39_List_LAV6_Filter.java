package com.yigit;

import java.util.Arrays;
import java.util.List;

// List : LAV
// List bir interfacedir
// java.util paketinden gelir

// LinkedList : Araya yerle�tirme, silme i�lemlerinde bi�ilmi� kaftan
// ArrayList : Ekleme ve arama i�lemlerinde bi�ilmi� kaftan
// Verktor : veri defaulta 10 bunun dolaca��n� anlad���nda dinamik olarak haf�za
// uzay� artt�r�r.

public class _39_List_LAV6_Filter {
	
	// filter : objelistedeki verilerimizden filtreleme yapmak i�n kullan�l�r
	public static void filterLoop() {
		
		// asList: filter
		_39_List_LAV6_FilterClass obje1 = new _39_List_LAV6_FilterClass(1, "Yigit Ozen", 15000);
		_39_List_LAV6_FilterClass obje2 = new _39_List_LAV6_FilterClass(2, "isim2 soyisim2", 2);
		_39_List_LAV6_FilterClass obje3 = new _39_List_LAV6_FilterClass(3, "isim3 soyisim3", 3);
		
		List<_39_List_LAV6_FilterClass> filterClass = Arrays.asList(obje1, obje2, obje3);
		for (_39_List_LAV6_FilterClass temp : filterClass) {
			if (temp.getPrice() >= 2) {
				System.out.println(temp);
			}
		}
		
	}
	
	public static void main(String[] args) {
		filterLoop();
	}
}
