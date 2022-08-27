package com.yigit.lambdaexpression;

// Lambda Expression
// Tek ba��na bir anlam ifade etmiyor
// Java 8 ile gelen �zelliktir
// Okunabilir (readibility) yaz�labilir (writebility) ve h�zl� kodlar yazmaka
// Okunabilirlik ve h�zl� kodlar yazmak
// sadeckodlarla i�lem yapar�z
// Lambda tek ba��na anlams�zd�r

// Lamda Arkas�ndaki G�� : JVM arkadaki labmdalar� birer interfaceye �evirir

// Lambda Function
// kullan�m i�in interface olu�turmal�y�z
// g�c�n� interface al�r
// stream api ile �ok kullan�l�r

// interface
// interface dikkat sadece public ve default yazabiliriz
// private ve protected yazamam

// Normal method Lambda Expression
// public void deneme(){} (x)->{x*5}

// javada kullan�m� () ->{}
// javascript kullan�m� ()=>{}

// Java 8 ile gele n bir �zellik
// @FunctionalInterface ==> interface 1 tane g�vdesiz metod yazabilirsin ba�ka
// yazamazs�n

// Lamda Expression yazarken dikkat edilecek hususlar
// 1-) @fUNCT�ONAL�NTERFACE ==> 1 tane g�vdesiz metod yaz
// 2-) Parametre sayisi ve t�r� �a��randa ayn� olmal�
// 3-) return varsa t�r� yaz�l�r

// @FunctionalInterface ==> interface 1 tane g�vdesiz metod yazabilirsin ba�ka
// yazamazs�n
@FunctionalInterface
interface ILambdaExpressionData {
	public void deneme(String adi);
}

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Lambda expressions, i�levsel programlamay� kolayla�t�r�r ve geli�tirmeyi
// �ok basitle�tirir.
// Koleksiyondan verilerin yinelenmesine, filtrelenmesine ve ��kar�lmas�na
// yard�mc� olur.
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
