package com.yigit;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class _30_DecoderEncoder {
	
	// Encode(Şifreleme) Decoder(Çözmek)
	// Encoder: Yazılımda bir kelimeyi belli bir formatta şifreleme için kullanılır
	// Decoder : Yazılımda şifrelenmiş bir kodu, çözmek için kullanılır
	// Base64 kütüphanesi kullanırız
	// Encoder-Decoder JWT en çok kullanırız
	// Neden kullanıyoruz? Büyük verilerde az yer kaplar
	// Decoder-Encoder, MD5 ,SHA ile karıştırmayalım....
	
	// Kullanıcıdan veri alma
	public static String getDataFromUser() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lutfen bir seyler yaziniz : ");
		String vocabulary = klavye.nextLine();
		return vocabulary;
	}
	
	// Encoder(Şifreleme) method
	public static String getEncoderData(String vocabulary) {
		Encoder encoder = Base64.getEncoder();
		// encodlanmıs yapıyı string'e ceviriyoruz
		String encrpted = encoder.encodeToString(vocabulary.getBytes());
		return encrpted;
	}
	
	// Decoder(Çözümleme) method
	public static String getDecoderData(String vocabulary) {
		Decoder decoder = Base64.getDecoder();
		String solved = new String(decoder.decode(vocabulary));
		return solved;
	}
	
	public static void encoderDecoderMainMethod() {
		String kelime = getDataFromUser();
		System.out.println("İlk hali : " + kelime);
		
		// Encoder (Şifreleme)
		String encrpted = getEncoderData(kelime);
		System.out.println("Sifrelenmis data : " + encrpted);
		
		// Decoder (Çözmek)
		String solved = getDecoderData(getEncoderData(kelime));
		System.out.println("Cozumlenmis data : " + solved);
	}
	
	public static void main(String[] args) {
		encoderDecoderMainMethod();
	}
}
