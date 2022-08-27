package com.yigit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

// Two Way (Client - Server String Example)
// Client kullanýcýdan aldýðý veriyi Servere göndersin
// Client - Server yazýþmasýný File yazdýrsýn

// Unutma:
// 1-) öncelikle Server'i çaðýrmalýsýn
// 2-) PSVM ==> Serverda olur
// 3-) java.net kütüphanesini import ediyoruz

// Önce Server'ý hazýrlamalýyýz
// Sonra Client'ý çalýþtýrýyoruz.

// Random 49152<=X<=65535
public class _36_Socket_Programming3_twoway_x2_String_Client {
	
	public static void main(String[] args) {
		String receiveMessage; // mesaj almak
		String sendMessage; // mesaj göndersin
		
		try {
			Socket socket = new Socket("localhost", 9595);
			
			// Client veri gönderecek
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			// serverdan gelen veriyi alamak
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
			System.out.println("Client : Lütfen mesaj yaziniz ");
			
			while (true) {
				// clientten veri almak
				sendMessage = bufferedReader.readLine();
				printWriter.println(sendMessage);
				printWriter.flush();
				
				if ((receiveMessage = bufferedReader2.readLine()) != null) {
					System.out.println("SERVET : " + receiveMessage);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
