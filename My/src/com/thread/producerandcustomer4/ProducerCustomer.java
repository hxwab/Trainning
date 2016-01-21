package com.thread.producerandcustomer4;

public class ProducerCustomer {
	
	public static void main(String[] args) {
		final Factory factory = new Factory();
		
		for(int i=0;i<2;i++){
			new Thread(new Producer(factory)).start();
			new  Thread(new Customer(factory)).start();
		}
	}

}
