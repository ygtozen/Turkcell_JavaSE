package com.yigit;

public class _36_Socket_Programing {
	// Da��t�k Programlama : Birbirinden uzak bilgisayarlar�n birbiri ile
	// haberle�mesini sa�lar. (Distributed System) Ayn� newtworkteki
	// bilgisayarlar�n birbiri ile haberle�mesi denir.
	// Senkron : Ayn� anda tek bir i�lem yapabilme yetene�idir.
	// Asenkron : Ayn� anda birden fazla i�lem yapabilme yetene�idir.
	// TCP/IP UDP (Client: istemci(Hizmet alan), Server: Hizmet veren)
	// UDP ==> A�daki bilgisayarlar�n birbiriyle haberle�mesini sa�layan protokol
	// ad�d�r
	
	// TCP-IP ile UDP Aras�ndaki Farklar
	// TCP/IP ==> G�venli, kar�� tarafa data gidip gitmedi�ini kontrol eder,
	// Yava�t�r.
	// UDP: g�vensizdir, kar�� tarafa data gidip gitmedi�ini kontrol etmezz,
	// h�zl�d�r. Canl� Live Stream
	
	// RPC > RMI(Java): Remote Method Invocati�n: Farkl� sunucularki metodlar�
	// �a��r�p i�lem
	// yap�lmas� durumudur.
	
	// 2^16=65536 bilgisayardaki port say�s� (Kap�)
	// 0<=X<=1023 (Wll-Know-Port) bilinen a� noktalar�
	// SSH:22
	// FTP:20
	// HTTP:80,443
	
	// 1024<=Y<=49151 (Registered Port): sabitlenmi�
	// Mongo: 27017
	// PostgreSQL: 5432
	// MySQl:3306
	
	// 49152<=X<=65535 Dynamic Port
}
