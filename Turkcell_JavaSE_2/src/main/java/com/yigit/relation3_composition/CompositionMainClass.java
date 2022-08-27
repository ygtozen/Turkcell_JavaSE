package com.yigit.relation3_composition;

import java.util.ArrayList;

public class CompositionMainClass {
	
	public static void main(String[] args) {
		
		// (Single class)
		Writer writer = new Writer();
		writer.setWriterName("Nuri Güntekin");
		
		// null pointer almamak için (1) olandan List oluþturmalýyýz
		writer.setBookList(new ArrayList<Book>());
		
		// multiple class
		Book book = new Book();
		book.setBookName("Calikusu");
		book.setWriter(writer); // kitaba yazar ekledim
		book.getWriter().bookList.add(book);// listeye kitap ekledim
		
		// multiple class
		Book book2 = new Book();
		book2.setBookName("Yaprak Dokumu");
		book2.setWriter(writer); // kitaba yazar ekledim
		book2.getWriter().bookList.add(book2);// listeye kitap ekledim
		
		// yazar adý
		System.out.println("Yazar adi  :" + writer.getWriterName());
		
		// kitaplar
		for (Book temp : book.getWriter().getBookList()) {
			System.out.println(temp);
		}
	}
	
}
