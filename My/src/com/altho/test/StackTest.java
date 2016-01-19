package com.altho.test;

import com.altho.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(2);
		stack.push(5);
		stack.push(1);
		stack.push(4);
		stack.push(3);
		System.out.println(stack.min());
	}

}
