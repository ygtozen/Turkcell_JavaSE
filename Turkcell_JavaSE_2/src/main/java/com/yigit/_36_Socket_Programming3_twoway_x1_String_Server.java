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
// Client kullan�c�dan ald��� veriyi Servere g�ndersin
// Client - Server yaz��mas�n� File yazd�rs�n

// Unutma:
// 1-) �ncelikle Server'i �a��rmal�s�n
// 2-) PSVM ==> Serverda olur
// 3-) java.net k�t�phanesini import ediyoruz

// �nce Server'� haz�rlamal�y�z
// Sonra Client'� �al��t�r�yoruz.

// Random 49152<=X<=65535
public class _36_Socket_Programming3_twoway_x1_String_Server {
	
	public static void main(String[] args) {
		String receiveMessage; // mesaj almak (Clienttan gelen mesajlar)
		String sendMessage; // mesaj g�ndersin (Clienta e-mesaj g�nder)
		
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
