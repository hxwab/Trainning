package com.thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Factory {
	
	private int i=100;
	
	private ReentrantLock lock = new ReentrantLock();//���ֻ���������߲�����
	private Condition isFull = lock.newCondition();
	private Condition isEmpty =lock.newCondition();
	
	public synchronized void creat(){
		//lock.lock();
		System.out.println(Thread.currentThread().getName());
		if(i<90)
		System.out.println("��Ʊ"+ ++i);
		else System.out.println("������Ʊ");
		//lock.unlock();
	
		
	}
	
	public synchronized void  consum(){
		//lock.lock();
		System.out.println(Thread.currentThread().getName());
		if(i>10)
		System.out.println("��Ʊ"+ --i);
		else System.out.println("��Ʊ����***");
		//lock.unlock();
		
	}
	
	

}
