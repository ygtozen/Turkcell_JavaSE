package com.yigit;

// One Way (Client - Server String Example)
// Client kullanýcýdan aldýðý veriyi Servere göndersin
// Server gelen bu veriyi
// lenght hesaplayan algoritma?

// Unutma:
// 1-) öncelikle Server'i çaðýrmalýsýn
// 2-) PSVM ==> Serverda olur
// 3-) java.net kütüphanesini import ediyoruz

// Önce Server'ý hazýrlamalýyýz
// Sonra Client'ý çalýþtýrýyoruz.

// Random 49152<=X<=65535
public class _36_Socket_Programming2_oneway_x3_String_Main {
	
	public static void main(String[] args) {
		_36_Socket_Programming2_oneway_x1_String_Server server = new _36_Socket_Programming2_oneway_x1_String_Server();
		
		// server.serverMethod();
		
		_36_Socket_Programming2_oneway_x2_String_Client client = new _36_Socket_Programming2_oneway_x2_String_Client();
		
		// client.clientMehod();
	}
}
