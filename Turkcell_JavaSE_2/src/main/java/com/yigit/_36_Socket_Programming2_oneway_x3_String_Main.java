package com.yigit;

// One Way (Client - Server String Example)
// Client kullan�c�dan ald��� veriyi Servere g�ndersin
// Server gelen bu veriyi
// lenght hesaplayan algoritma?

// Unutma:
// 1-) �ncelikle Server'i �a��rmal�s�n
// 2-) PSVM ==> Serverda olur
// 3-) java.net k�t�phanesini import ediyoruz

// �nce Server'� haz�rlamal�y�z
// Sonra Client'� �al��t�r�yoruz.

// Random 49152<=X<=65535
public class _36_Socket_Programming2_oneway_x3_String_Main {
	
	public static void main(String[] args) {
		_36_Socket_Programming2_oneway_x1_String_Server server = new _36_Socket_Programming2_oneway_x1_String_Server();
		
		// server.serverMethod();
		
		_36_Socket_Programming2_oneway_x2_String_Client client = new _36_Socket_Programming2_oneway_x2_String_Client();
		
		// client.clientMehod();
	}
}
