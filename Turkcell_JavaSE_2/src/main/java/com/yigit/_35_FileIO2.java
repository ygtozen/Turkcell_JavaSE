package com.yigit;

import java.io.File;
import java.util.Date;

public class _35_FileIO2 {
	
	public static void main(String[] args) {
		try {
			File file = new File(_35_FileIO.MY_PATH);
			
			// isFile() == > Dosya mý
			if (file.isFile()) {
				System.out.println("Dosyada calisiyorsunuz");
				
				// can ==> boolean doner (e bilmek, yapabilmek durumu) Linux izinleri 755 777
				// 4+2+1
				System.out.println("***** CAN *************************");
				System.out.println("Calisabilen dosya mi : " + file.canExecute());
				System.out.println("Okunabilen dosya mi : " + file.canRead());
				System.out.println("Yazilabilen dosya mi : " + file.canWrite());
				System.out.println("******************************");
				
				// is ==> soru sorar
				System.out.println("***** IS *************************");
				System.out.println("Dizin mi  : " + file.isDirectory());
				System.out.println("Dosya mi : " + file.isFile());
				System.out.println("Gizli dosya mi : " + file.isHidden());
				System.out.println("******************************");
				
				// get : getirmek
				System.out.println("***** GET *************************");
				System.out.println("Absolute path : " + file.getAbsolutePath());
				System.out.println("Class : " + file.getClass());
				System.out.println("Name : " + file.getName());
				System.out.println("Parent : " + file.getParent());
				System.out.println("Normal Path : " + file.getPath());
				System.out.println("CanonicalPath : " + file.getCanonicalPath());
				System.out.println("******************************");
				
				// set : deðiþtirmek
				System.out.println("***** SET *************************");
				System.out.println("Calisma iznini kapatmak : " + file.setExecutable(false));
				System.out.println("Yazabilme iznini kapatma : " + file.setWritable(false));
				System.out.println("Okunabilme iznini kapatma : " + file.setReadable(false));
				
				// file information
				System.out.println("Toplam karakter sayisi : " + file.length());
				System.out.println("Degisiklik tarihi : " + new Date(file.lastModified()));
				System.out.println("Absolute path : " + file.getAbsolutePath());
				System.out.println("Normal Path : " + file.getPath());
				System.out.println("CanonicalPath : " + file.getCanonicalPath());
				System.out.println("Toplam GB : " + file.getTotalSpace());
				System.out.println("Kullanilabilen GB : " + file.getUsableSpace());
			} else {
				System.out.println("Dosya degil");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
	}
}
