package com.my.thread;

/**
 * http://itlab.idcquan.com/Java/line/779590.html
 * @author csdc
 *
 */

public class DataSyc {

	
	
	public static void main(String[] args) {
		DataSyc ds = new DataSyc();
		ds.test();
	}
	
	public void test(){
		DataThread d= new DataThread();
		Thread[] thread = new Thread[100];
		for(int i=0;i<100;i++){
			thread[i]=new Thread(d);
		}
		
		for(int i=0;i<100;i++){
			thread[i].start();
		}
		for(int i=0;i<100;i++){
			try {
				thread[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(d.n);
	}
}


class DataThread extends Thread{
	
	public static int n=0;//����ĳ�Ա�������̲߳���ȫ
	@Override
	public void run() {
		int m =n;
		yield();//��ͣ���߳��ͷ���Դ������������
		m++;//����ԭ�Ӳ���
		n=m;
	}
}