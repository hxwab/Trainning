package com.my.thread;

public class TestSyn {
	
	
	
	public static void main(String[] args) {
		TestSyn t = new TestSyn();
		t.testMethod();
	}
	
	public void testMethod(){
		SynchronizedExample myThread1 = new SynchronizedExample();
		myThread1.method1();
		SynchronizedExample myThread2 = new SynchronizedExample();
		myThread2.method2();
	}
	
	
	public void test(){
		
		SynchronizedExample myThread1 = new SynchronizedExample();
        for (int i = 0; i <= 4; i++)
        {
            myThread1.methodName = "method" + String.valueOf(i);
            new Thread(myThread1).start();
            try {
            	Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}

}
