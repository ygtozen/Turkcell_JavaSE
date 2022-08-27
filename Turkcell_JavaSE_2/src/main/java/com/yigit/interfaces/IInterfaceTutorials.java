package com.yigit.interfaces;

// interfaces : bir aray�zd�r
// �nce s�z veriyorum : kilo verece�im imza (G�vdesiz method)
// spor salona gitmek (G�vdeli method)
// g�vdeli method - g�vdesiz method yazabiliriz
// �stedi�imiz kadar implemetn yaz�p ekleyebiliriz
// polymorphism yapabiliriz

// abstaction = interface + abstract

// Acces Modifier
// inheritance : public, private, protected, default new ile olu�turabilirsin, 1
// tane extend
// abstract : public, protected, default new ile olu�turamazs�n , 1 tane extends
// interfaces : public, protected, default new ile olu�turamazs�n , N tane
// implements

// inheritance-abstaract-interface
// temiz kod yazmay� sa�lar
// polymorphism sa�lar
// maliyeti d���r�r
// kod karma��kl���ndan kurtar�r
// az kod �ok i� mant���

// abstrac - interface ortak �zellikler
// polymorphism yazabiliriz
// soyutlama yapabiliriz
// g�vdeli method yazabilriz
// g�vdesiz method yazabiliriz

// abstrac - interface farkl� �zellikler
// abstract ==> ortak �zelliklerde kullnamka
// extend(1),
// IS-A

// interface ==> farkl� ortak �zellikler
// implements(N)
// CAN-DO
// 100% soyutlamad�r
// public static int sayi=10; // sabit de�i�ken olu�turabilirsiniz

public interface IInterfaceTutorials {
	
	public void siteGit();
	
	public void sepeteEkle();
	
	public void ode();
	
	public String al(String sayi);
	
}
