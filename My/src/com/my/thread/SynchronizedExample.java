package com.my.thread;
/**
 * 1��synchronized���ܼ̳�
 * 2.  �ڶ���ӿڷ���ʱ����ʹ��synchronized�ؼ��֡�
 * 3.  ���췽������ʹ��synchronized�ؼ���
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
	        method("�Ǿ�̬��method1����");
	    }
	    public synchronized void method2()
	    {
	        method("�Ǿ�̬��method2����");
	    }
	    public static synchronized void method3()
	    {
	        method("��̬��method3����");
	    }
	    public static synchronized void method4()
	    {
	        method("��̬��method4����");
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
	     * �����������ʹ��synchronized�ؼ���������Ǿ�̬�������ǽ�Ӱ������е�����ʹ��synchronized�ؼ��ֶ����
	     * �Ǿ�̬���������������Ǿ�̬��������ô��Ӱ����������ʹ��synchronized�ؼ��ֶ���ľ�̬������
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
