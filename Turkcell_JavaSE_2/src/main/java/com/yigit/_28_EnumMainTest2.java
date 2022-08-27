package com.yigit;

// enum class interface
// Java 5 gelen özelliktir
// type safe sağlar
// new oluşturulmaz ==> enum,interface, abstract
// enum sıfırsan başlar
// değişkenlerde final kullanılır bize sadece ==> getter metodunu gelir
// constructorda private oluşturmak new yani instance oluşmasına izin vermez
public class _28_EnumMainTest2 {
	
	public static void main(String[] args) {
		_28_EnumConstructor enumConstructor = _28_EnumConstructor.BUYUK;
		System.out.println(enumConstructor);
		System.out.println("SIRA : " + enumConstructor.ordinal());
		System.out.println("KEY : " + enumConstructor.getKey());
		System.out.println("VALUE : " + enumConstructor.getValue());
		
		String str = _28_EnumConstructor.BUYUK.toString();
		System.out.println(str);
		
		String str2 = _28_EnumConstructor.BUYUK.getValue().toString();
		System.out.println(str2);
		
		System.out.println("*************************");
		for (_28_EnumConstructor temp : _28_EnumConstructor.values()) {
			System.out.println(temp + " " + temp.getKey() + " " + temp.getValue());
		}
	}
}
