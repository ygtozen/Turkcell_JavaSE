package com.yigit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

// step.1-) File için CRUD iþlemi yapacak bir algoritma yapýnýz
// step olusturulan her bir dosyaya enum ile ADMIN(yazma,okuma,olusturma),
// WRITER(yazma ve okuma),USER(okuma) rollerini en sola yazalým
// step.2-) bir dosyayý okuyacak baþka bir dosyaya verileri yazacak (object)
// step.2-) Bu projemiz þunuda yapsýn
// person.txt ve homework.txt diye dosyamýz olsun bu dosyalar
// person.txt dosyasýnda ==> kisi ismi ve soyisimi olacak
// homework.txt dosyasýnda ==> odevler olacak
// bilgisayar random olarak kisiye odev verecek

public class _35_File04_FileCommonExample {
	// sýnýf deðiþkeni (class variable)
	private static Scanner klavye;
	
	private static String MY_PATH = "";
	
	_35_File04_FileClass pathClass;
	
	public _35_File04_FileCommonExample(_35_File04_FileClass pathClass) {
		this.pathClass = new _35_File04_FileClass();
	}
	
	// Chooise Method
	public static int chooise() {
		klavye = new Scanner(System.in);
		System.out.println("Secim yapiniz : ");
		System.out.println("" + "0-)Cikis\n1-)Dosya Olusturmak\n"
				+ "2-)Dosya Yaz\n3-)Dosya Oku\n4-)Dosya Sil\n5-)Dosya Bilgileri");
		
		return klavye.nextInt();
	}
	
	public static void mainMethod() throws IOException {
		int key = chooise();
		switch (key) {
			case 1:
				createDateFile();
				break;
			
			case 2:
				writeDateFile();
				break;
			
			case 3:
				readDateFile();
				break;
			
			case 4:
				deleteDateFile();
				break;
			
			case 5:
				showFileData();
				break;
			
			case 0:
				systemExit();
				break;
			
			default:
				System.out.println("Secim diisnda bir deger girdiniz.");
		}
	}
	
	private static String dataMerge(String data) {
		StringBuilder builder = new StringBuilder();
		builder.append("D:\\Bootcamp\\").append(data).append(".txt");
		return builder.toString();
	}
	
	// create path
	private static String createPath() {
		klavye = new Scanner(System.in);
		System.out.println("Dosya adini giriniz :");
		String fileName = klavye.nextLine();
		_35_File04_FileClass pathClass = new _35_File04_FileClass(dataMerge(fileName));
		return pathClass.getPath();
	}
	
	// create method
	private static void createDateFile() throws IOException {
		System.out.println("***** Dosya olusturmak *****");
		String path = createPath();
		MY_PATH = path;
		System.out.println(MY_PATH);
		File file = new File(path);
		if (file.createNewFile()) {
			System.out.println(file.getAbsolutePath() + " Dosya olusturuldu");
		} else {
			System.out.println("Olusturulmadi");
		}
	}
	
	// write method
	private static void writeDateFile() {
		System.out.println("***** Dosya Yazma *****");
		/*
		 * File file = new File(MY_PATH);
		 * FileWriter fileWriter = new FileWriter(file);
		 * BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		 */
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, true))) {
			klavye = new Scanner(System.in);
			System.out.println("Dosya yazmak icin bir seyler yaziniz :");
			String vocabulary = klavye.nextLine();
			_35_File04_FileClass class1 = new _35_File04_FileClass();
			bufferedWriter.write(class1.getDate() + " ==> " + vocabulary);
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// read method
	private static void readDateFile() {
		System.out.println("*** Dosya Oku ***");
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(MY_PATH))) {
			StringBuilder builder = new StringBuilder();
			String satir = "";
			while ((satir = bufferedReader.readLine()) != null) {
				builder.append(satir);
			}
			System.out.println(builder);
		} catch (Exception e) {
			System.out.println("Okumada sorun oluþtu");
			e.printStackTrace();
		}
	}
	
	// delete method
	private static void deleteDateFile() {
		System.out.println("***** Dosya Sil *****");
		// try-with resources
	}
	
	private static void systemExit() {
		System.out.println("***** Cikis *****");
		
	}
	
	private static void showFileData() {
		File file = new File(MY_PATH);
		System.out.println("toplam karakter sayýsý: " + file.length());
		System.out.println("absolute path: " + file.getAbsolutePath());
		System.out.println("normal path: " + file.getPath());
		System.out.println("toplam GB : " + file.getTotalSpace());
		System.out.println("kullanýlabileceðin GB : " + file.getUsableSpace());
		System.out.println("Deðiþikliði Tarihi: " + new Date(file.lastModified()));
	}
	
	public static void main(String[] args) {
		
		try {
			for (;;) {
				mainMethod();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
