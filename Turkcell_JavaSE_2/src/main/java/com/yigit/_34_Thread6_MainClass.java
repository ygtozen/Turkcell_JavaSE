package com.yigit;

// Thread Kullaným Þekli
// 1-) extends (kalýtým) ==> public class MultiThreadExam extends Thread {}
// ==> extends javada 1 tane kullanbilriz.
// extends zorunlu olarak run metodunu eklemez
public class _34_Thread6_MainClass extends Thread {
	
	public static void main(String[] args) throws InterruptedException {
		_34_Thread_ExtendsThread multiple1 = new _34_Thread_ExtendsThread("1.instance");
		_34_Thread_ExtendsThread multiple2 = new _34_Thread_ExtendsThread("2.instance");
		_34_Thread_ExtendsThread multiple3 = new _34_Thread_ExtendsThread("3.instance");
		
		// öncelikli sýrasý
		multiple1.setPriority(Thread.MAX_PRIORITY);
		multiple2.setPriority(Thread.NORM_PRIORITY);
		multiple3.setPriority(Thread.MIN_PRIORITY);
		
		/*
		 * System.out.println("1.thread  : " + multiple1.isAlive());
		 * System.out.println("2.thread  : " + multiple2.isAlive());
		 * System.out.println("3.thread  : " + multiple3.isAlive());
		 */
		
		multiple1.start();
		// öncellikle thread 1 bitmesi gerekiyor 1.thread bittikten sonra diðerleri
		// baþlar
		multiple1.join();
		System.out.println("1.Thread ID :" + multiple1.getId());
		System.out.println("2.Thread ID :" + multiple1.getName());
		System.out.println("Degisti 1");
		System.out.println("2.Thread ID :" + multiple1.getName());
		System.out.println("********************************");
		
		multiple2.start();
		multiple2.wait(); // 2. emre kadar dursun
		multiple2.notify();
		multiple2.notifyAll();
		
		multiple3.start();
		
		/*
		 * System.out.println("1.thread  : " + multiple1.isAlive());
		 * System.out.println("2.thread  : " + multiple2.isAlive());
		 * System.out.println("3.thread  : " + multiple3.isAlive());
		 */
		// Çarþamba ==> Thread innerClass
		// Perþembe ==> File,
		// Cuma ==> Socket
		// Pazartesi ==> Generics Collection (List, set, map)
		// Salý ==> Generics Collection (List, set, map)
		// Çarþamba ==> Inheritance, examp
		// Perþmebe ==> abstract, exam, interface
		// Cuma ==> Software Prensible, SOLID
		
		// Bayram sonrasý : JavaSE + PostgreSQL
		// Java PostgreSql (PreparedStatement)
		// SQL ==> https://www.w3schools.com/sql
		// SQL ==> https://sqlkodlari.com/
		
		/////////////////
		/*
		 * 9 temmuz - 18 temmuz tatil
		 * KURULUMLAR
		 * git ==> https://git-scm.com/download/win
		 * visual studio code ==> https://code.visualstudio.com/download
		 * node js ==> https://nodejs.org/en/
		 * postgresql ==>
		 * https://www.enterprisedb.com/downloads/postgres-postgresql-downloads
		 * Docker ==> https://docs.docker.com/desktop/windows/install/
		 * Browser ==> Google Chrome
		 * Oracle Vm ==> https://www.virtualbox.org/wiki/Downloads
		 * Editor ==> Notepad++
		 * JDK
		 * JDK ==> https://www.oracle.com/java/technologies/downloads/#jdk18-windows
		 * Eclipse ==> https://www.eclipse.org/downloads/
		 * OracleVM ==> https://www.virtualbox.org/wiki/Downloads
		 * Postman ==> Desktop ve ya Google Chrome Install Plugin
		 */
		
		//////////////////////////////////////////////////////////////
		// PostgreSQl
		// Spring Framework
		// Spring Boot
		// Spring MVC
		// Spring Data (SMTP = mail push)
		// Spring Rest
		// Spring Security
		// Project + Spring Thymeleaf ==> OpenAPI, H2DB, Swagger
	}
	
}
