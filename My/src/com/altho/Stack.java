package com.altho;
/**
 * 设计包含min 函数的栈。定义栈的数据结构，要求添加一个min 函数，能够得到栈的最小元素。
 * 要求函数min、push 以及pop 的时间复杂度都是O(1)。
 * ANSWER:

Stack is a LIFO data structure. When some element is popped from the stack, the status will recover to the original status as before that element was pushed. So we can recover the minimum element, too.

 * @author csdc
 *
 */
public class Stack {

	private int size;
	private int top;
	private int min;
	private int[] arr;
	private int[] data;
	private static final int MAX = 1000000;
	
	public Stack() {

		size=10;
		arr = new int[size];
		data=new int[size];
		top=-1;
		min=MAX;
	}
	
	public Stack(int size){
		this.size=size;
		arr = new int[size];
		data=new int[size];
		top=-1;
		min=MAX;
	}
	
	public void push(int element){
		if(top<size){
			arr[++top]=element;
			if(min>element){
				min=element;
			}
			data[top]=min;
		}else{
			System.out.println("栈溢出");
		}
	}
	
	public int pop(){
		return arr[top--];
	}

	public int min(){
		return data[top];
	}
	
	public int length(){
		return top;
	}
	
	public boolean isFull(){
		return top==size;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
}
