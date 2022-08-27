package com.yigit.relation_association;

public class AssosicationMainClass {
	
	public static void main(String[] args) {
		Market market = new Market();
		market.setMarketAdi("xyz market");
		
		Person person = new Person();
		person.setInsanAdi("klm insan");
		
		System.out.println("Association  :" + market.getMarketAdi() + " " + person.getInsanAdi());
	}
}
