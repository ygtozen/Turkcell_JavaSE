package com.yigit;

// Exception : Java Lang kütüphanesinden gelir.
public class YigitOzenException extends Exception {
	
	/**
	 * Bu yapıyı sadece bu class'a özel verilmiş versionUID kısmıdır.
	 */
	private static final long serialVersionUID = -4669828591174778970L;
	
	// constructor
	public YigitOzenException(String message) {
		super(message);
	}
	
}
