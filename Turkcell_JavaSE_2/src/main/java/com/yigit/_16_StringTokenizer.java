package com.yigit;

import java.util.StringTokenizer;

public class _16_StringTokenizer {
	public static void main(String[] args) {
		
		// not : boşluk bir karakterdir &nbsp
		// parçalamak
		String kelime = "Java+ jsp$jsf servlet~Spring framework springmvc springdata springrest springsecurity";
		
		// 1-) parçalamak
		String[] parcala = kelime.split(" ");
		for (String temp : parcala) {
			System.out.println(temp);
		}
		
		System.out.println("****************************");
		// 2-) parçalama
		// StringTokenizer stringTokinizer = new StringTokenizer(kelime, " ");
		StringTokenizer stringTokinizer = new StringTokenizer(kelime, "+~&$");
		while (stringTokinizer.hasMoreTokens()) {
			System.out.println(stringTokinizer.nextToken());
		}
	}
}
