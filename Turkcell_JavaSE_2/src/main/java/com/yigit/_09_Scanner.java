package com.yigit;

import java.util.Scanner;

public class _09_Scanner {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lüffen bir kelime giriniz : ");
		// String kelime = klavye.next();
		String kelime = klavye.nextLine();
		System.out.println(kelime);
		
		// Scanner normalde char yoktur ancak biz kendimiz nasıl oluşturabiliriz. ipucu
		// chartAt()
		System.out.println(kelime.charAt(0));
	}
}
