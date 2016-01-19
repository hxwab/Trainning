package com.thread;

public class ThreadImpl extends Thread{

	private int i= 20;
	
	
	
	@Override
	public  void run() {
		
		while(true){
			
			if(i>0){
				i--;
				System.out.println( Thread.currentThread().getName()+"ÕıÔÚÂô"+i);
				
			}
		}
			
	}
	

}
