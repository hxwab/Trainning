package com.altho;
/**
 * ��ư���min ������ջ������ջ�����ݽṹ��Ҫ�����һ��min �������ܹ��õ�ջ����СԪ�ء�
 * Ҫ����min��push �Լ�pop ��ʱ�临�Ӷȶ���O(1)��
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
			System.out.println("ջ���");
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
