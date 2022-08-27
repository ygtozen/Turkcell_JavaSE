package com.yigit;

public class _07_String {
	public static void main(String[] args) {
		// Kelimeler ile çalışma imkanı sağlar
		// database, port, api String -> Çok kullanırız
		// String bir Objedir(null) : null verebilirsek objedr
		// boşluk bir karakterdir
		
		String kelime = "Java ogreniyorum Java";
		System.out.println(kelime);
		System.out.println("Length : " + kelime.length());
		System.out.println("Trim : " + kelime.trim().length());
		
		System.out.println("hepsi küçük harf : " + kelime.toLowerCase());
		System.out.println("HEPSİ BÜYÜK HARF : " + kelime.toUpperCase());
		
		System.out.println("StartsWith : " + kelime.startsWith("J")); // Başlıyor mu
		System.out.println("EndsWith : " + kelime.endsWith(" ")); // Bitiyor mu
		
		System.out.println("concat : " + kelime.concat("sona ekleme"));
		System.out.println("replace : " + kelime.replace(kelime, "yenisi"));
		
		System.out.println("contains : " + kelime.contains("Java")); // içinde Java geçiyormu
		System.out.println("charAt : " + kelime.charAt(0)); // 0.indisi verir
		
		System.out.println("indexOf : " + kelime.indexOf("Java"));
		System.out.println("lastIndexOf : " + kelime.lastIndexOf("Java"));
		
		System.out.println("substring : " + kelime.substring(2));
		System.out.println("substring (0,2) : " + kelime.substring(0, 2));
		
		// kelimenin son iki karakteri
		// System.out.println("lenght : " + kelime.length());
		// System.out.println("son iki harf : " + kelime.substring(19, 21));
		
		String result = kelime.substring(kelime.length() - 2);
		System.out.println(result);
		
		System.out.println("Bos mu : " + kelime.isEmpty()); // Boş mu
		System.out.println("Equals : " + kelime.equals("Java ogreniyorum Java"));
		System.out.println("EqualsIgnoreCase : " + kelime.equalsIgnoreCase("JAVA ogreniyorum Java"));
		// EqualsIgnoreCase -> Büyük küçük harf gözetmez
	}
}
