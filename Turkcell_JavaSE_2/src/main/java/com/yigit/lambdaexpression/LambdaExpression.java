package com.yigit.lambdaexpression;

// Lambda Expression
// Tek baþýna bir anlam ifade etmiyor
// Java 8 ile gelen özelliktir
// Okunabilir (readibility) yazýlabilir (writebility) ve hýzlý kodlar yazmaka
// Okunabilirlik ve hýzlý kodlar yazmak
// sadeckodlarla iþlem yaparýz
// Lambda tek baþýna anlamsýzdýr

// Lamda Arkasýndaki Güç : JVM arkadaki labmdalarý birer interfaceye çevirir

// Lambda Function
// kullaným için interface oluþturmalýyýz
// gücünü interface alýr
// stream api ile çok kullanýlýr

// interface
// interface dikkat sadece public ve default yazabiliriz
// private ve protected yazamam

// Normal method Lambda Expression
// public void deneme(){} (x)->{x*5}

// javada kullanýmý () ->{}
// javascript kullanýmý ()=>{}

// Java 8 ile gele n bir özellik
// @FunctionalInterface ==> interface 1 tane gövdesiz metod yazabilirsin baþka
// yazamazsýn

// Lamda Expression yazarken dikkat edilecek hususlar
// 1-) @fUNCTÝONALýNTERFACE ==> 1 tane gövdesiz metod yaz
// 2-) Parametre sayisi ve türü çaðýranda ayný olmalý
// 3-) return varsa türü yazýlýr

// @FunctionalInterface ==> interface 1 tane gövdesiz metod yazabilirsin baþka
// yazamazsýn
@FunctionalInterface
interface ILambdaExpressionData {
	public void deneme(String adi);
}

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Lambda expressions, iþlevsel programlamayý kolaylaþtýrýr ve geliþtirmeyi
// çok basitleþtirir.
// Koleksiyondan verilerin yinelenmesine, filtrelenmesine ve çýkarýlmasýna
// yardýmcý olur.
public class LambdaExpression {
	
	public static void main(String[] args) {
		// Normal Interface
		ILambdaExpressionData expressionData = new ILambdaExpressionData() {
			
			@Override
			public void deneme(String adi) {
				System.out.println(adi + " normal interface yapisi");
			}
		};
		expressionData.deneme("arguman verdim");
		
		// Lambda Expression Interface
		ILambdaExpressionData expressionData2 = (temp) -> {
			System.out.println(temp + " lamda function interface");
		};
		expressionData2.deneme("arguman verdim");
	}
	
}
