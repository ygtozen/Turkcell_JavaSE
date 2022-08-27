package com.yigit;

public class _05_VariableDefinitionRules {
	public static void main(String[] args) {
		
		// int degiskenAdi; //camelCase
		int value10; // değişken sayı ile bitebilir
		int _value10; // değişken underscore(alt çizgi) ile başlayabilir
		int $value10; // değişken $ ile başlayabilir
		
		// Yanlış yazılım
		// int üğşçö; //Türkçe karakterler üpşçö kullanmayalım
		// int -value10; //Özel simge ile başlanmaz (_ ve $ hariç)
		
		// Java 10 gelen özellikler
		// var sayi = true;
		// System.out.println(sayi);
	}
}
