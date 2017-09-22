package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);//��С�̶��������̳߳ش�С�Ĳ���ִ��
		ExecutorService executor1 = Executors.newCachedThreadPool();
		ExecutorService executor2 = Executors.newSingleThreadExecutor();//����
		ExecutorService executor3 = Executors.newScheduledThreadPool(10);
		for(int i=0;i<5;i++){
			executor.execute(new TestRunnable());
		    System.out.println("a"+i+"******");
		}
		executor.shutdown();
		testThreadPoolExecutor();
	}
	
	public static  void testThreadPoolExecutor(){
		
		java.util.concurrent.ThreadPoolExecutor executor = new java.util.concurrent.ThreadPoolExecutor(10, 20, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(10));
		for(int i=0;i<50;i++){
			executor.execute(new TestRunnable());
		    System.out.println("******a***"+i+"******");
		}
	}

}
