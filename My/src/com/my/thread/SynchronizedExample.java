package com.my.thread;
/**
 * 1、synchronized不能继承
 * 2.  在定义接口方法时不能使用synchronized关键字。
 * 3.  构造方法不能使用synchronized关键字
 * @author csdc
 *
 */
public class SynchronizedExample  extends Thread{
	
	  public String methodName;

	    public static void method(String s)
	    {
	        System.out.println(s);
	        while (true)
	            ;
	    }
	    public synchronized void method1()
	    {
	        method("非静态的method1方法");
	    }
	    public synchronized void method2()
	    {
	        method("非静态的method2方法");
	    }
	    public static synchronized void method3()
	    {
	        method("静态的method3方法");
	    }
	    public static synchronized void method4()
	    {
	        method("静态的method4方法");
	    }
	    public void run()
	    {
	        try
	        {
	            getClass().getMethod(methodName).invoke(this);
	        }
	        catch (Exception e)
	        {
	        }
	    }
	    
	    /**
	     * ，如果在类中使用synchronized关键字来定义非静态方法，那将影响这个中的所有使用synchronized关键字定义的
	     * 非静态方法。如果定义的是静态方法，那么将影响类中所有使用synchronized关键字定义的静态方法。
	     * 
	     * @param args
	     * @throws Exception
	     */
	   /* public static void main(String[] args) throws Exception
	    {
	    	SynchronizedExample myThread1 = new SynchronizedExample();
	        for (int i = 0; i <= 4; i++)
	        {
	            myThread1.methodName = "method" + String.valueOf(i);
	            new Thread(myThread1).start();
	            sleep(100);
	        }
	    	
	    }
*/
}
