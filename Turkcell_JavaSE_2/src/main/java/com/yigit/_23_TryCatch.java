package com.yigit;

import java.io.IOException;

public class _23_TryCatch {
	// java.leng>Object> Throwable> 1-)Exception 2-)Error
	// try-catch-finally-throw-throws
	
	// method
	public static void fakeMailSend(String data) {
		System.out.println("admine mail gonderildi " + data);
	}
	
	public static void main(String[] args) throws ArithmeticException, NullPointerException, IOException {
		
		int sayi = 10;
		// if(true){throw new istisnaTuru("mesaj buraya")}else{}
		if (sayi == 10) {
			throw new ArithmeticException("Bunu yazma");
		} else {
			System.out.println("Succes");
		}
		
		// 1.
		try {
			// istisna meydana gelecek kodlar
			int number = 4 / 0;
			System.out.println(number);
		} catch (ArithmeticException | NullPointerException ae) {// catch özelden(hızlı) genele doğru
			fakeMailSend(ae.getMessage());
			fakeMailSend(ae.toString());
			ae.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			fakeMailSend(e.getMessage());
			fakeMailSend(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("db.close(), port.close()");
		}
		
		System.out.println("son satir");
		
		// 2.
		// try {
		// // istisna meydana gelecek kodlar
		// int number = 4 / 0;
		// System.out.println(number);
		// } catch (ArithmeticException | NullPointerException ae) {// catch
		// özelden(hızlı) genele doğru
		// throw(ae);
		// } catch (Exception e) {
		// // TODO: handle exception
		// fakeMailSend(e.getMessage());
		// fakeMailSend(e.toString());
		// e.printStackTrace();
		// } finally {
		// System.out.println("db.close(), port.close()");
		// }
		
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// syntax error
		// intx number = 4 / 1;
		// System.out.println(number);
		
		// logic error : tanımsız
		
		// try {
		// int number = 4 / 0;
		// System.out.println(number);
		// } catch (ArithmeticException e) {
		// e.printStackTrace();
		// fakeMailSend(e.getMessage());
		// } catch (Exception e) {
		// e.printStackTrace();
		// // System.out.println(e.getMessage());
		// fakeMailSend(e.getMessage());
		// } finally {
		// System.out.println("mutlaka calisacak yerdir, db.close(), port.close()");
		// }
		
	}
}
