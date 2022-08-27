package com.yigit;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class _25_Date {
	
	// date Turkish time
	public static void dateLocale() {
		
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd HH", locale);
		
		Date date = new Date();
		System.out.println(date);
		String turkishDateTime = dateFormat.format(date);
		System.out.println(turkishDateTime);
	}
	
	// date
	public static void dateTutorial() {
		// Date date = new Date();
		Date date = new Date("1999/5/1");
		
		date.setYear(2000);
		
		System.out.println("Gun : " + date.getDay());
		System.out.println("Ay: " + date.getMonth());
		
		// 1900 ekelemyi unutma
		int nowYear = date.getYear() + 1900;
		System.out.println("Yil  : " + nowYear);
		System.out.println("Saat : " + date.getHours());
		
		System.out.println(new Date(System.currentTimeMillis()));
	}
	
	// calendar
	public static void calendertutorials() {
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd HH", locale);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		System.out.println(calendar.getTime());
		
		String turkishDateTime = dateFormat.format(calendar.getTime());
		System.out.println(turkishDateTime);
		
	}
	
	public static void main(String[] args) {
		// dateTutorial();
		
		// dateLocale();
		
		calendertutorials();
	}
}
