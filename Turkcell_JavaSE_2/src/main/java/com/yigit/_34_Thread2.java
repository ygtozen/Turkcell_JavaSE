package com.yigit;

// Thread Kullaným Þekli
// 1-) extends (kalýtým) ==> public class MultiThreadExam extends Thread {}
// ==> extends javada 1 tane kullanbilriz.
// extends zorunlu olarak run metodunu eklemez
public class _34_Thread2 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
}

// 2-) implement (Interface) ==> public class IMultiThread implements Runnable
// ==> implements , Javada istediðimiz kadar implements virgül koyarak
// yazabiliriz.
// implements zorunlu olarak run metodunu ekler

class _34_Thread2Implements implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

// 3-) anonymous (isimsiz) ==> Metot olarak
// Thread thread = new Thread(new Runnable(){})

class _34_Thread2Method {
	public void threadMethod() {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
