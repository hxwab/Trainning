package com.altho.test;

import java.util.Stack;
/**
 * 
 * 翻转句子中单词的顺序。
 题目：输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
 句子中单词以空格符隔开。为简单起见，标点符号和普通字母一样处理。
 例如输入“I am a student.”，则输出“student. a am I”。
 * 
 * 
 * 1、利用栈的先进后出特性
 * 2、前后对调
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
