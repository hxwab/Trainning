package com.thread;

public class TestRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"�̱߳�������");
		
			try {
				Thread.sleep(2);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

}
