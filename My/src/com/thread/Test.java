package com.thread;

import java.util.concurrent.atomic.*;

public class Test {
	
	public static void main(String[] args) {
		
		/*ThreadImpl t = new ThreadImpl();
		new Thread(t,"线程1").start();
		new Thread(t,"线程2").start();
		new Thread(t,"线程3").start();*/
		
		
		AtomicBoolean b ;
		RunableImpl r = new RunableImpl();
		new Thread(r,"线程1").start();
		new Thread(r,"线程2").start();
		new Thread(r,"线程3").start();

	}

}
