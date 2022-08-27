package com.yigit;

public class _04_WrapperClass {
	
	public static void main(String[] args) {
		// primitive types : stack memory : hafıza uzayı belli olsun, heap'e göre daha
		// hızlıdır
		
		// tam sayılar
		byte b1 = 44;
		short s1 = 129;
		int i1 = 444;
		long l1 = 155515L;
		
		// Virgüllü ondalıklı sayılar
		float f2 = 44.55f;
		double d2 = 44.56;
		
		boolean b3 = 3 > 1;
		char c3 = '\u1252';
		System.out.println(c3);
		
		// bilimsel gösterim
		double bilimsel = 2E+3;
		System.out.println(bilimsel);
		
		int cellPhone1 = 1112233;
		System.out.println(cellPhone1);
		int cellPhone2 = 111_22_33;
		System.out.println(cellPhone2);
		
		//////////////////////////////////////////////////
		// Wrapper
		Byte wrap1 = new Byte((byte) 45);
		System.out.println(wrap1);
		wrap1 = null;
		System.out.println(wrap1);
	}
	
}
