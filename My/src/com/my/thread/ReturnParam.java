package com.my.thread;

import java.util.Random;

/**
 * ͨ���̷߳��ز���
 * @author csdc
 *
 */
public class ReturnParam {

	
	public static void main(String[] args) {
		ReturnParam rp= new ReturnParam();
		rp.test();
		rp.test2();
		rp.test3();
	}
	
	public void test(){
		MyRuturn1 m = new MyRuturn1();
		m.start();
		System.out.println(m.name + m.age);//�߳�֮ǰ��ִ���˸ľ䣬�����Ϊ�ա�start()����������ִ�У���Ҫ�ȴ���Դ����
	}
	
	/**
	 * �Ƽ�����
	 */
	public void test2(){
		MyRuturn1 m = new MyRuturn1();
		m.start();
		try {
			m.join();//�߳�ִ����Ϻ���ִ�к�������
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(m.name + m.age);
	}
	
	/**
	 * ����ʱ�䲻ȷ��
	 */
	public void test3(){
		MyRuturn1 m = new MyRuturn1();
		m.start();
		try {
			m.sleep(100);//���ߣ��ȴ��߳�ִ�����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(m.name + m.age);
	}
}

/**
 * ͨ���������������
 * @author csdc
 *
 */
class MyRuturn1 extends Thread{
	
	public String name;
	public int  age;
	@Override
	public void run() {
		name = "James";
		age =25;
	}
}


 
  
  /**
 *  ͨ���غ������ݲ���
 * @author csdc
 *�������۵��������߳��д������ݵķ�������õġ��������ַ�������main���������������ݴ����߳���ġ�
 *������߳���˵���Ǳ���������Щ���ݵġ�Ȼ��������ЩӦ������Ҫ���߳����еĹ����ж�̬�ػ�ȡ���ݣ�
 *������������run�����в�����3���������Ȼ��ͨ��Work���process������������������ĺͣ�
 *��ͨ��Data���value��������ء���������ӿ��Կ������ڷ���value֮ǰ������Ҫ�õ������������
 
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

  
  */
