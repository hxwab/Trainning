package com.thread.producerandcustomer2;

public class ProducerAndCustomer {
	
	private static final Factory factory = new Factory();
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true)
				factory.create();
			}
		}).start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {

				while(true)
				factory.consume();
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {

				while(true)
				factory.consume();
			}
		}).start();
	}
	

}
