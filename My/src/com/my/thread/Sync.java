package com.my.thread;
/**
 * http://itlab.idcquan.com/Java/line/779782_2.html
 * @author csdc
 *
 */
public class Sync {
	
	public static void main(String[] args) {
		Sync s = new Sync();
		s.test2();
	}
	
	public void test(){
		ThreadSyn th1 = new ThreadSyn(new Test());
		ThreadSyn th2 = new ThreadSyn(new Test());//test is different
		th1.start();
		th2.start();
	}
	
	public void test2(){
		Test test = new Test();
		ThreadSyn th1 = new ThreadSyn(test);
		ThreadSyn th2 = new ThreadSyn(test);//the object of test  is the same. Singleton can solve the problem
		th1.start();
		th2.start();
	} 

}



class Test{
	
	static int i=0;
	public  synchronized  void add(){
		System.out.println(i++);
	}
}


class  ThreadSyn extends Thread{
	
	private Test test;
	public ThreadSyn(Test test) {
		this.test = test;
	}
	
	@Override
	public void run() {
		while(test.i<1000){
			test.add();
		}
	}
}



class  Singleton{
	
	
}

