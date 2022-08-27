package com.yigit;

// enum class interface
// Java 5 gelen özelliktir
// type safe sağlar
// new oluşturulmaz ==> enum,interface, abstract
// enum sıfırsan başlar
// değişkenlerde final kullanılır bize sadece ==> getter metodunu gelir
// constructorda private oluşturmak new yani instance oluşmasına izin vermez
public enum _28_EnumConstructor {
	KUCUK(1, "kucuk"), ORTA(2, "orta"), BUYUK(3, "buyuk");
	
	private final int key;
	private final String value;
	
	// parametreli constructor
	private _28_EnumConstructor(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	// getter
	public int getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
}
