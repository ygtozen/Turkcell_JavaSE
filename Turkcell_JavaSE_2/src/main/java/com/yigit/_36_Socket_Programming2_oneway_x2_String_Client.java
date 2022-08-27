package com.yigit;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

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
public class _36_Socket_Programming2_oneway_x2_String_Client {
	
	// Server Method
	private static void clientMehod() {
		
		// port
		int serverPort = _36_Socket_Programming2_oneway_x1_String_Server.PORT;
		
		//
		String ipaddress = _36_Socket_Programming2_oneway_x1_String_Server.ipAddress;
		
		// kullanýcýdan alacaðým veri
		String vocabulary = JOptionPane.showInputDialog("Lutfen bir seyler yaziniz : ");
		
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipaddress, 6363).getOutputStream())) {
			
			dataOutputStream.writeUTF(vocabulary);
		} catch (IOException e) {
			System.out.println("Client Method IOException Error : ");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Client Method Error : ");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		clientMehod();
	}
}
