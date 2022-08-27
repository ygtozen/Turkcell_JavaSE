package com.yigit.interfaces;

// interfaces : bir arayüzdür
// önce söz veriyorum : kilo vereceðim imza (Gövdesiz method)
// spor salona gitmek (Gövdeli method)
// gövdeli method - gövdesiz method yazabiliriz
// Ýstediðimiz kadar implemetn yazýp ekleyebiliriz
// polymorphism yapabiliriz

// abstaction = interface + abstract

// Acces Modifier
// inheritance : public, private, protected, default new ile oluþturabilirsin, 1
// tane extend
// abstract : public, protected, default new ile oluþturamazsýn , 1 tane extends
// interfaces : public, protected, default new ile oluþturamazsýn , N tane
// implements

// inheritance-abstaract-interface
// temiz kod yazmayý saðlar
// polymorphism saðlar
// maliyeti düþürür
// kod karmaþýklýðýndan kurtarýr
// az kod çok iþ mantýðý

// abstrac - interface ortak özellikler
// polymorphism yazabiliriz
// soyutlama yapabiliriz
// gövdeli method yazabilriz
// gövdesiz method yazabiliriz

// abstrac - interface farklý özellikler
// abstract ==> ortak özelliklerde kullnamka
// extend(1),
// IS-A

// interface ==> farklý ortak özellikler
// implements(N)
// CAN-DO
// 100% soyutlamadýr
// public static int sayi=10; // sabit deðiþken oluþturabilirsiniz

public interface IInterfaceTutorials {
	
	public void siteGit();
	
	public void sepeteEkle();
	
	public void ode();
	
	public String al(String sayi);
	
}
