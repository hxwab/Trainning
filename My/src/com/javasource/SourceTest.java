package com.javasource;

public class SourceTest {

 Object o;
}


 interface A{
	public void test();
	
}
 
 interface B{

	 public  void test();
 }
 
 interface C extends A,B{
	 //void test();
 }
 
 class Imp implements C{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	 
 }