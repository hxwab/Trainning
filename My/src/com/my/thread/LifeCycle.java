package com.my.thread;
/**
 * 
 * @author csdc
 *
 */
public class LifeCycle  extends Thread{

	public static void main(String[] args) throws Throwable {
		LifeCycle thread= new LifeCycle();
		System.out.println(thread.isAlive());
		thread.start();
		System.out.println(thread.isAlive());
		thread.join();//�ȴ��߳�ִ����ɺ���ִ��֮������
		System.out.println(thread.isAlive());
	}
	
	
	
	@Override
	public void run() {
		int  i =0;
		while(i<1000){
			System.out.println(i++);
		}
	}
	
}
