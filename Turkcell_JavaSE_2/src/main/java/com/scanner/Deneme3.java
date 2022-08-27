package com.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Deneme3 {
	public static void main(String[] args) throws FileNotFoundException {
		String path = "d:\\example.txt";
		File dosya = new File(path);
		Scanner giris = new Scanner(dosya);
		while (giris.hasNext()) {
			String isim = giris.next();
			String soyad = giris.next();
			int notu = giris.nextInt();
			System.out.println(isim + " " + " " + soyad + " " + notu);
		}
		giris.close();
	}
	
}
