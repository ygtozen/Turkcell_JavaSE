package com.yigit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
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
public class _36_Socket_Programming3_twoway_x1_String_Server {
	
	public static void main(String[] args) {
		String receiveMessage; // mesaj almak (Clienttan gelen mesajlar)
		String sendMessage; // mesaj göndersin (Clienta e-mesaj gönder)
		
		try {
			ServerSocket serverSocket = new ServerSocket(9595);
			Socket socket = serverSocket.accept();
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			InputStream inputStream = socket.getInputStream();
			BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
			
			while (true) {
				if ((receiveMessage = receiveRead.readLine()) != null) {
					System.out.println("CLIENT : " + receiveMessage);
				}
				
				sendMessage = bufferedReader.readLine();
				printWriter.println(sendMessage);
				printWriter.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
