package com.thread.synchronize;

/**
 * **
 * wait�����ͷ��������Ĵ����ڻ��Ѻ�ִ��
 * notifyִ������ͷ���
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
