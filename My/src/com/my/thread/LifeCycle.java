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
		thread.join();//等待线程执行完成后再执行之后的语句
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
