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
	
	public static int n=0;//共享的成员变量，线程不安全
	@Override
	public void run() {
		int m =n;
		yield();//暂停，线程释放资源，产生脏数据
		m++;//并非原子操作
		n=m;
	}
}