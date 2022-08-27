package com.yigit;

// Thread : java.lang kütüphensinden gelir
// senkron : aynı anda sadece bir iş yapabilme yeteneği
// asenkron : aynı anda birden fazla işlem yapabiliriz
// Java Aynı anda birden fazla processle çalışmamıza imkan sağlar
// Thread kullanıyorsak excepiton hadling kullanmalıyız

// Multi Thread :
// Hızlılığı sağlar
// Güvenilirliği sağlar : elimizde bir data var serverden bir data gelcek önce
// bir api
// gelecek ondan sonra kullancağım.

// run() ==> thread çalıştırır
// start() ==> thread başlatır
// join() ==> üstteki thread bitmeden devam etmez
// wait() ==> Thread 2. emre kadar durmasını isteriz
// notify() ==> ilgili threadi uyanmasını sağlar
// notifyAll() ==> Bütün thread'leri ayağa kaldırır

// priority() ==> Threadlere öncelik vermek
// destroy() == Thread olmesini sağlar
// getName() ==> Thread adını verir
// setName() ==> Thread adını biz değiştirmek
// isAlive() ==> İlgili Thred yaşıyor mu, yaşamıyor mu?
// sleep() ==> bilirli milisaniyede uyusun tekar geri kalksın (sleep-wakeup)

public class _34_Thread4 {
	
}
