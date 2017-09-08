package com.test;

public class XiPai {

	
	public static void main(String[] args) {
		XiPai x= new XiPai();
		int [] arr= new int[]{1,2,3,4,5,6};


		
		for(int i =arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
		
		x.change(arr);
		System.out.println();
		for(int i =arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
	
	public void change(int[] a){
		a[1] = 1;
		a[2] =2;
		
	}
	
	public int [] xiPai(int [] arr ,int k){
		
		int[] tmp ;
		int start = (arr.length-1)/2;
		int end = arr.length-1;
		while(k-->0){
			tmp = new int[arr.length];
			int index =0;
			for(int i = end,j=start;i>start&&j>=0;i--,j--){
				tmp[index++] = arr[i];
				tmp[index++] = arr[j];
			}
			
			arr = tmp;
		}
		return arr;
	}
	
	
}
