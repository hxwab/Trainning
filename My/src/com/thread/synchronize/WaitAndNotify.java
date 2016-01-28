package com.thread.synchronize;

/**
 * wait�����ͷ��������Ĵ����ڻ��Ѻ�ִ��
 * notify�������ͷ��������߳�ִ������ͷ���
 * @author csdc
 *
 */
public class WaitAndNotify {

	public static void main(String[] args) {
	
		Object lock = new Object();
		
		System.out.println("syn ����");
		synchronized (lock) {
		
			System.out.println("syn in");
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("wait �������");
		}
		
		System.out.println("syn����");
		
	}
}
