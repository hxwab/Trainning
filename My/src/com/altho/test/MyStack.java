package com.altho.test;

import java.util.Stack;
/**
 * 
 * ��ת�����е��ʵ�˳��
 ��Ŀ������һ��Ӣ�ľ��ӣ���ת�����е��ʵ�˳�򣬵��������ַ���˳�򲻱䡣
 �����е����Կո��������Ϊ������������ź���ͨ��ĸһ������
 �������롰I am a student.�����������student. a am I����
 * 
 * 
 * 1������ջ���Ƚ��������
 * 2��ǰ��Ե�
 * @author csdc
 *
 */
public class MyStack {
	
	private Stack<String> stack;
	
	public MyStack() {
		stack = new Stack<String>();
	}
	
	private void revert(String s){
		String [] ss = s.split(" ");
		for(int i=0;i<ss.length;i++){
			stack.push(ss[i]);
		}
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
	}
	
	public static void main(String[] args) {
		MyStack m = new MyStack();
		m.revert("i am a students.");
	}

}
