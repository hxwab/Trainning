package com.thread.synchronize;

/**
 * **
 * wait立即释放锁，其后的代码在唤醒后执行
 * notify执行完后释放锁
 * @author csdc
 *
 */
public class TestWait {

	private  static final Factory factory = new Factory();
	
	public static void main(String[] args) {
		TestWait t = new TestWait();
		t.test();
	}
	
	
	public void test(){
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				factory.tWait();
			}
		}).start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				factory.tNotify();
			}
		}).start();
	}
}
