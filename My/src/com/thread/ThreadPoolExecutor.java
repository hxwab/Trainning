package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);//��С�̶��������̳߳ش�С�Ĳ���ִ��
		ExecutorService executor1 = Executors.newCachedThreadPool();
		ExecutorService executor2 = Executors.newSingleThreadExecutor();//����
		ExecutorService executor3 = Executors.newScheduledThreadPool(10);
		for(int i=0;i<5;i++){
			executor.execute(new TestRunnable());
		    System.out.println("******a"+i+"******");
		}
		executor.shutdown();
		
	}

}
