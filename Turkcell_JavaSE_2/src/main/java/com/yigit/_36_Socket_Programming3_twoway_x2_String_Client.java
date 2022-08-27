package com.yigit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
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
public class _36_Socket_Programming3_twoway_x2_String_Client {
	
	public static void main(String[] args) {
		String receiveMessage; // mesaj almak
		String sendMessage; // mesaj g�ndersin
		
		try {
			Socket socket = new Socket("localhost", 9595);
			
			// Client veri g�nderecek
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			// serverdan gelen veriyi alamak
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
			System.out.println("Client : L�tfen mesaj yaziniz ");
			
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
