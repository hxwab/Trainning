package com.thread;

import java.util.concurrent.atomic.*;

public class Test {
	
	public static void main(String[] args) {
		
		/*ThreadImpl t = new ThreadImpl();
		new Thread(t,"�߳�1").start();
		new Thread(t,"�߳�2").start();
		new Thread(t,"�߳�3").start();*/
		
		
		AtomicBoolean b ;
		RunableImpl r = new RunableImpl();
		new Thread(r,"�߳�1").start();
		new Thread(r,"�߳�2").start();
		new Thread(r,"�߳�3").start();

	}

}
