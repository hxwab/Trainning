package com.thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Factory {
	
	private int i=100;
	
	private ReentrantLock lock = new ReentrantLock();//各种机制用于提高并发性
	private Condition isFull = lock.newCondition();
	private Condition isEmpty =lock.newCondition();
	
	public synchronized void creat(){
		//lock.lock();
		System.out.println(Thread.currentThread().getName());
		if(i<90)
		System.out.println("退票"+ ++i);
		else System.out.println("不能退票");
		//lock.unlock();
	
		
	}
	
	public synchronized void  consum(){
		//lock.lock();
		System.out.println(Thread.currentThread().getName());
		if(i>10)
		System.out.println("买票"+ --i);
		else System.out.println("余票不足***");
		//lock.unlock();
		
	}
	
	

}
