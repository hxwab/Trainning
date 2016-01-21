package com.thread.producerandcustomer2;

public class Factory {
	
	private int i =0;
	
	private Object lock = new Object();
	
	private boolean created = false;
	
	
	public void create(){
		
		synchronized (lock) {
			if(!created){
				i++;
				System.out.println("created: "+i);
				created =true;
				lock.notify();
			}else{
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public void consume(){
		synchronized (lock) {
			if(created){
				i--;
				System.out.println("consume: "+i);
				created = false;
				lock.notify();
			}else {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
