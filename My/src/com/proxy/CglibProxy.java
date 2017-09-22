package com.proxy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	
	private Object target;
	
	public Object getProxyInstance(Object target){
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
		
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(arg0.getClass().getName());
		System.out.println(arg3.getClass().getName());
		Field [] fields0 = arg0.getClass().getDeclaredFields();  
		System.out.println("fields0");
        for(Field f:fields0){  
            System.out.println(f.getName());  
        }  
        System.out.println("methods0");
        Method[] methods0 = arg0.getClass().getDeclaredMethods();  
        for(Method m :methods0){  
            System.out.println(m.getName());  
        }  
		
        System.out.println("fields");
		Field [] fields = arg3.getClass().getDeclaredFields();  
        for(Field f:fields){  
            System.out.println(f.getName());  
        }  
        System.out.println("methods");
        Method[] methods = arg3.getClass().getDeclaredMethods();  
        for(Method m :methods){  
            System.out.println(m.getName());  
        }  
		
		System.out.println("start");
		Object result = arg1.invoke(target, arg2);
		System.out.println("end");
		return result;
	}
	
}
