package com.my.thread;

import java.util.Random;

/**
���̴߳��ݲ����ķ��� 
* @author csdc
 *
 */
public class SetParam {

	public static void main(String[] args) {
		SetParam p = new SetParam();
		p.testMyThread();
		p.testMyThread2();
		p.testMythread3();
	}
	
	
	
	public void testMyThread(){
		MyThread1 m = new MyThread1("tom");
		m.start();
	}
	
	public void testMyThread2(){
		MyThread2 m = new MyThread2();
		m.setName("Jom");
		new Thread(m).start();
	}
	
	public void testMythread3(){
		MyThread3 m = new MyThread3(new Work());
		m.start();
	}
}


/**
 * ���캯������
 * @author csdc
 *
 */
class MyThread1 extends Thread{
	
	private String name ;
	
	public MyThread1(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println("hello "+name );
	}
}


/**
 * ͨ����ֵ
 * @author csdc
 *
 */
class MyThread2 implements Runnable{

	private String name;
	
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("hello "+name);
	}
	
}


/**
 *  ͨ���غ������ݲ���
 * @author csdc
 *�������۵��������߳��д������ݵķ�������õġ��������ַ�������main���������������ݴ����߳���ġ�
 *������߳���˵���Ǳ���������Щ���ݵġ�Ȼ��������ЩӦ������Ҫ���߳����еĹ����ж�̬�ػ�ȡ���ݣ�
 *������������run�����в�����3���������Ȼ��ͨ��Work���process������������������ĺͣ�
 *��ͨ��Data���value��������ء���������ӿ��Կ������ڷ���value֮ǰ������Ҫ�õ������������
 */
class MyThread3  extends Thread{
	private Work work;

	public MyThread3(Work work) {
		this.work = work;
	}
	
	@Override
	public void run() {
		
		Random random = new Random();
		int d1 = random.nextInt(1000);
		int d2 = random.nextInt(2000);
		int d3 = random.nextInt(3000);
		Data data = new Data();
		work.process(data, d1,d2,d3);//�ص�����
		  System.out.println(String.valueOf(d1) + "+" + String.valueOf(d2) + "+"
	                + String.valueOf(d3) + "=" + data.value);
		
	}
	
}

class  Data{
	public int value=0;
}

class Work{
	
	public void process(Data data,Integer... numbers){
		for(int n :numbers){
			data.value+=n;
		}
	}
}
