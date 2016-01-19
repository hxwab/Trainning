package com.my.thread;

import java.io.IOException;

public class StopThread {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		StopThread s = new StopThread();
		s.testInterrupt();
	}
	
	
	public void testInterrupt() throws IOException, InterruptedException{
		
		ThreadInterrupt r = new ThreadInterrupt();
		r.start();
		System.out.println("enter any key to interrupt in 50s");
		System.in.read();
		r.interrupt();
		r.join();
		System.out.println("interrupted");
		
	}
	
	
	
	public void testStopThread1() throws InterruptedException{
		StopThread1 r = new StopThread1();
		Thread thread =  new Thread(r);
		thread.start();
		thread.join(10);
		r.exit();
		thread.join();
	}
	
	

}

class StopThread1  implements Runnable{

	private volatile boolean isExit=false;
	
	public void exit(){
		isExit = true;
		System.out.println("exit");
	}
	
	@Override
	public void run() {
		System.out.println("in");
  		int i =0;
		while(!isExit){
			System.out.println(i++);
		}
	}

}


/**
 *  使用interrupt方法来终端线程可分为两种情况：
    （1）线程处于阻塞状态，如使用了sleep方法。
    （2）使用while（！isInterrupted（））{……}来判断线程是否被中断。
    在第一种情况下使用interrupt方法，sleep方法将抛出一个InterruptedException例外，而在第二种情况下线程将直接退出。
    下面的代码演示了在第一种情况下使用interrupt方法。
 * @author csdc
 *
 *
 *在Thread类中有两个方法可以判断线程是否通过interrupt方法被终止。一个是静态的方法interrupted（），
 *一个是非静态的方法isInterrupted（），这两个方法的区别是interrupted用来判断当前线是否被中断，
 *而isInterrupted可以用来判断其他线程是否被中断。因此，while （！isInterrupted（））也可以换成
 *while （！Thread.interrupted（））
 *
 */
class ThreadInterrupt extends Thread{

	
	@Override
	public void run() {

		try {
			sleep(50000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


/**
 * 
 * 
 * volatile的简单变量如果当前值由该变量以前的值相关，那么volatile关键字不起作用，也就是说如下的表达式都不是原子操作：
n = n + 1;
n++;
    如果要想使这种情况变成原子操作，需要使用synchronized关键字
 */
