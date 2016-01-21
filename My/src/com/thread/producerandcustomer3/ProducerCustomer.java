package com.thread.producerandcustomer3;

public class ProducerCustomer {
	
	public static void main(String[] args) {
		final Factory factory = new Factory();
		
		/**
		 * 容易造成线程阻塞
		 * 假设线程0创建后，created 为false,执行创建操作后created=true.再次循环后执行wait,让出CUP进入阻塞状态。
		 * 假设线程1创建后，created为true,执行创建，此时created为true，只能执行wait,让出CUP进入阻塞状态。
		 * 假设线程2创建后，created 为true,执行消费操作后created=false,并且唤醒另外的一个线程，假设为线程1.再次循环后执行wait,让出CUP进入阻塞状态。
		 * 假设线程3创建后，created为false,执行消费，但created=false，执行wait,让出CUP进入阻塞状态。
		 */
		for(int i=0;i<2;i++){
			new Thread(new Producer(factory)).start();
			new  Thread(new Customer(factory)).start();
		}
	}

}
