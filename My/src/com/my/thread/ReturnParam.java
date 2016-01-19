package com.my.thread;

import java.util.Random;

/**
 * 通过线程返回参数
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
		System.out.println(m.name + m.age);//线程之前就执行了改句，所输出为空。start()并不是立即执行，需要等待资源分配
	}
	
	/**
	 * 推荐做法
	 */
	public void test2(){
		MyRuturn1 m = new MyRuturn1();
		m.start();
		try {
			m.join();//线程执行完毕后再执行后面的语句
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(m.name + m.age);
	}
	
	/**
	 * 休眠时间不确定
	 */
	public void test3(){
		MyRuturn1 m = new MyRuturn1();
		m.start();
		try {
			m.sleep(100);//休眠，等待线程执行完毕
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(m.name + m.age);
	}
}

/**
 * 通过类变量返回数据
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
 *  通过回函数传递参数
 * @author csdc
 *上面讨论的两种向线程中传递数据的方法是最常用的。但这两种方法都是main方法中主动将数据传入线程类的。
 *这对于线程来说，是被动接收这些数据的。然而，在有些应用中需要在线程运行的过程中动态地获取数据，
 *如在下面代码的run方法中产生了3个随机数，然后通过Work类的process方法求这三个随机数的和，
 *并通过Data类的value将结果返回。从这个例子可以看出，在返回value之前，必须要得到三个随机数。
 
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

  
  */
