package com.yigit;

public class _13_Cast {
	public static void main(String[] args) {
		
		// CAST ==>
		// 1.cast f-l
		float f1 = 44.55f;
		float f2 = (float) 44.55;
		long l1 = 45455454l;
		
		// 2.cast
		byte b1 = 12;
		long l2 = b1; // Veri kaybı yok
		
		long l3 = 1515555L;
		byte b3 = (byte) l3; // Veri kaybı vardır
		System.out.println(b3);
		
		// 3-) boxing - unbosxing
		int primitiv = 44;
		Integer wrapper = primitiv; // boxing: primitive type ==> wrapper çevirmek
		
		Double wrapper2 = 444.15; // unboxing: Wrapper ==> Primitive çevirmek
		double primitive2 = wrapper2;
		
		// 4-) String ==> int
		String str = "10";
		int cast1 = Integer.valueOf(str); // object
		int cast2 = Integer.parseInt(str); // primitive
		System.out.println(cast1 + 14);
		System.out.println(cast1 + cast2 + 14);
		
		// 5-) int ==> String'e çevirdik
		int number = 66;
		String cast3 = String.valueOf(number);
		String cast4 = Integer.toString(number);
		System.out.println(cast3 + 14);
		System.out.println(cast3 + cast4 + 14);
		
		// 6-) String cast
		String str6 = "Kelime" + ""; // buradaki tırnak String'e çevrilir
	}
}
