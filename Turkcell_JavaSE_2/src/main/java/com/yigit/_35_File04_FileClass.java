package com.yigit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _35_File04_FileClass {
	
	// Nesne deðiþkenleri (Object Variable)
	private String path;
	private String date = createDate();
	
	// parametresiz constructor
	public _35_File04_FileClass() {
		this.path = "D:\\Bootcamp\\data.txt";
	}
	
	// parametreli constructor
	public _35_File04_FileClass(String path) {
		this.path = path;
	}
	
	private String createDate() {
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
		// new Date(System.currentTimeMillis());s
		return dateFormat.format(new Date());
	}
	
	// getter setter
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getDate() {
		return date;
	}
	
}
