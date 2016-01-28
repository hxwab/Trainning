package com.thread.synchronize;

/**
 * wait立即释放锁，其后的代码在唤醒后执行
 * notify不立即释放锁，该线程执行完后释放锁
 * @author csdc
 *
 */
public class WaitAndNotify {

	public static void main(String[] args) {
	
		Object lock = new Object();
		
		System.out.println("syn 上面");
		synchronized (lock) {
		
			System.out.println("syn in");
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("wait 下面代码");
		}
		
		System.out.println("syn外面");
		
	}
}
