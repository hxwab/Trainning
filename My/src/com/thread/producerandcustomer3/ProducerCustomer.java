package com.thread.producerandcustomer3;

public class ProducerCustomer {
	
	public static void main(String[] args) {
		final Factory factory = new Factory();
		
		/**
		 * ��������߳�����
		 * �����߳�0������created Ϊfalse,ִ�д���������created=true.�ٴ�ѭ����ִ��wait,�ó�CUP��������״̬��
		 * �����߳�1������createdΪtrue,ִ�д�������ʱcreatedΪtrue��ֻ��ִ��wait,�ó�CUP��������״̬��
		 * �����߳�2������created Ϊtrue,ִ�����Ѳ�����created=false,���һ��������һ���̣߳�����Ϊ�߳�1.�ٴ�ѭ����ִ��wait,�ó�CUP��������״̬��
		 * �����߳�3������createdΪfalse,ִ�����ѣ���created=false��ִ��wait,�ó�CUP��������״̬��
		 */
		for(int i=0;i<2;i++){
			new Thread(new Producer(factory)).start();
			new  Thread(new Customer(factory)).start();
		}
	}

}
