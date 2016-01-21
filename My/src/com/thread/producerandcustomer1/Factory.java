package com.thread.producerandcustomer1;

public class Factory {
	
	private int i=0;
	
	private Object lock = new Object();
	
	
	public  void create(){
		synchronized(lock){
			
			System.out.println("created: "+ ++i);
		}
	}
	
	public  void consume(){
		synchronized (lock) {
			System.out.println("consume: "+--i);
		}
		
	}

}
