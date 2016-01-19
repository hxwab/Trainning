package com.my.thread;

import java.util.Random;

/**
向线程传递参数的方法 
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
 * 构造函数传参
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
 * 通过设值
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
 *  通过回函数传递参数
 * @author csdc
 *上面讨论的两种向线程中传递数据的方法是最常用的。但这两种方法都是main方法中主动将数据传入线程类的。
 *这对于线程来说，是被动接收这些数据的。然而，在有些应用中需要在线程运行的过程中动态地获取数据，
 *如在下面代码的run方法中产生了3个随机数，然后通过Work类的process方法求这三个随机数的和，
 *并通过Data类的value将结果返回。从这个例子可以看出，在返回value之前，必须要得到三个随机数。
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
		work.process(data, d1,d2,d3);//回调函数
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
