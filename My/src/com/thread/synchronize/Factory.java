package com.thread.synchronize;

public class Factory {
	
	
	private Object lock = new Object();
	
	public  void tWait(){
		synchronized (lock) {
			System.out.println("��ʼ wait time"+System.currentTimeMillis());
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("wait����"+System.currentTimeMillis());
		}
		
		
	}
	
	
	public void tNotify(){
		
		synchronized (lock) {
	
			System.out.println("��ʼnotify"+System.currentTimeMillis());
			lock.notify();
			System.out.println("notify����"+System.currentTimeMillis());
		}		
	}
	

}
