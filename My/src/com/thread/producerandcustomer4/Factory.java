package com.thread.producerandcustomer4;

public class Factory {
	
	private int i =0;
	
	private boolean created = false;
	
	
	public synchronized void create(){
		
		synchronized (this) {
			if(!created){
				i++;
				System.out.println(Thread.currentThread().getName()+"created: "+i);
				created =true;
				notifyAll();
			}else{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public void consume(){
		synchronized (this) {
			if(created){
				i--;
				System.out.println(Thread.currentThread().getName()+"consume: "+i);
				created = false;
				notifyAll();
			}else {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
