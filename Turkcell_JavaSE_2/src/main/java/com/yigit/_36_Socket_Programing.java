package com.yigit;

public class _36_Socket_Programing {
	// Daðýtýk Programlama : Birbirinden uzak bilgisayarlarýn birbiri ile
	// haberleþmesini saðlar. (Distributed System) Ayný newtworkteki
	// bilgisayarlarýn birbiri ile haberleþmesi denir.
	// Senkron : Ayný anda tek bir iþlem yapabilme yeteneðidir.
	// Asenkron : Ayný anda birden fazla iþlem yapabilme yeteneðidir.
	// TCP/IP UDP (Client: istemci(Hizmet alan), Server: Hizmet veren)
	// UDP ==> Aðdaki bilgisayarlarýn birbiriyle haberleþmesini saðlayan protokol
	// adýdýr
	
	// TCP-IP ile UDP Arasýndaki Farklar
	// TCP/IP ==> Güvenli, karþý tarafa data gidip gitmediðini kontrol eder,
	// Yavaþtýr.
	// UDP: güvensizdir, karþý tarafa data gidip gitmediðini kontrol etmezz,
	// hýzlýdýr. Canlý Live Stream
	
	// RPC > RMI(Java): Remote Method Invocatiýn: Farklý sunucularki metodlarý
	// çaðýrýp iþlem
	// yapýlmasý durumudur.
	
	// 2^16=65536 bilgisayardaki port sayýsý (Kapý)
	// 0<=X<=1023 (Wll-Know-Port) bilinen að noktalarý
	// SSH:22
	// FTP:20
	// HTTP:80,443
	
	// 1024<=Y<=49151 (Registered Port): sabitlenmiþ
	// Mongo: 27017
	// PostgreSQL: 5432
	// MySQl:3306
	
	// 49152<=X<=65535 Dynamic Port
}
