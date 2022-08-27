package com.yigit;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class _36_Socket_Programming2_oneway_x1_String_Server {
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
	
	static int PORT;
	static String ipAddress = "localhost"; // 127.0
	
	private static final int randomInt() {
		Random random = new Random();
		int number = random.nextInt(49152, 65535);
		return number;
	}
	
	private static void serverMethod() {
		String clientValue, bigLetter;
		System.out.println("Server hazir...");
		PORT = randomInt();
		System.out.println("Port : " + 6363);
		
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(6363).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			bigLetter = clientValue.toUpperCase();
			System.out.println(bigLetter);
			System.out.println("Harf Sayiyisi : " + bigLetter.length());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void serverMethod2() {
		try {
			
			PORT = randomInt();
			System.out.println("Port : " + PORT);
			System.out.println("Server hazir...");
			
			// Jjava.net.SocketExcepiton: Soket is not bound yet : Poert eklenmemis
			// java.net.BindException: Addres already in use : Ayný portu tekar kullandýnýz
			// server: Clienttan gelen veriyi okumasý gerekiyor
			
			ServerSocket socket = new ServerSocket(PORT);
			Socket successPort = socket.accept();
			System.out.println("Server Hazir...");
			InputStreamReader inputStreamReader = new InputStreamReader(successPort.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			// BufferedReader bufferedReader2 = new BufferedReader
			// (new InputStreamReader(new ServerSocket(4999).accept().getInputStream()));
			
			// Clienttan gelen veriyi alamak
			String str = bufferedReader.readLine();
			System.out.println("Client : " + str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		serverMethod();
	}
	
}
