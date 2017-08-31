package com.thread.lock;

public class ProducerAndCustomer {
	
	private  static final Factory factory = new Factory();
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					factory.creat();
				}
			}
		},"thread-0").start();
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					factory.consum();
					
				}
			}
		},"thread-1").start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					factory.creat();
				}
			}
		},"thread-3").start();
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					factory.consum();
					
				}
			}
		},"thread-4").start();
		
		
	}

}
