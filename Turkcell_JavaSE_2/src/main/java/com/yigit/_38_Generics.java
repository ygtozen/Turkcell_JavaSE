package com.yigit;

// Generics :
// <>
// Tür problemlerini çözer
// casting ile uðraþmaszýnýz
// dynamics
// var ==> java 10 gelen object
// Tüm referans tiplerini barýndýrýr

// Generic Class
public class _38_Generics<T> {
	
	// Generics Object Variable
	private T data;
	
	// Generic Parametresiz Constructor
	public _38_Generics() {
		
	}
	
	// Generic Parametreli Constructor
	public _38_Generics(T data) {
		this.data = data;
	}
	
	// getter and setter
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	// Normal Method
	public void normalMethod(String data) {
		System.out.println(data);
	}
	
	// Generics Method
	// dikkat : class ile ayný generics sembolu kullanma yani "T" kulanma
	public <K> void genericsMethod1(K data) {
		System.out.println(data);
	}
	
	// Generics Method
	// dikkat : class ile ayný generics sembolu kullanma yani "T" kulanma
	public <K> void genericsMethod2(K data1, K data2) {
		System.out.println(data1 + " " + data2);
	}
	
	public static void main(String[] args) {
		
		System.out.println("** dinamik bir veri **");
		_38_Generics sinif = new _38_Generics();
		// Dinamik bir veri gönderim þekli
		sinif.setData("100 TL");
		System.out.println(sinif.getData());
		sinif.setData(true);
		System.out.println(sinif.getData());
		
		System.out.println("***** Generics Method *****");
		sinif.normalMethod("kelime");
		sinif.genericsMethod1(10);
		sinif.genericsMethod2(true, "merhaba");
		
		// dinamik bir parametreli constructor gönderim þekli
		System.out.println("** dinamik bir veri parametreli constructor **");
		_38_Generics sinif2 = new _38_Generics("const");
		System.out.println(sinif2.getData());
		
		System.out.println("** generic type **");
		_38_Generics<Boolean> sinif3 = new _38_Generics();
		// Generics type
		sinif3.setData(true);
		System.out.println(sinif3.getData());
	}
	
}
