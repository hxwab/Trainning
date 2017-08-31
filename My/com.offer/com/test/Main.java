package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n ;i++){
			nums[i]=sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		m.init(list,nums[nums.length-1]);
		int [] counts = m.Counts(list, nums);
		int re = m.getSum(counts);
		System.out.println(re);
		}
	}
	
	/*public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n ;i++){
			nums[i]=sc.nextInt();
		}
		sc.close();
		ArrayList<Integer> list = new ArrayList<Integer>();
		m.init(list,nums[nums.length-1]);
		int [] counts = m.Counts(list, nums);
		int re = m.getSum(counts);
		System.out.println(re);
		
	}*/
	
	public   void init( ArrayList<Integer> list , int n){
		
		for (int i=2;i<=n;i++){
			int j=2;
			for(;j<i;j++){
				if(i%j==0)
					break;
			}
			if(i==j) list.add(i);
		}
	}
	
	public int [] Counts(ArrayList<Integer> list,int[] nums){
		int [] tmp = new int[nums.length];
		for(int i =0; i<nums.length;i++){
			int index =0;
			for(int cmp : list){
				if(cmp<nums[i]){
					index++;
				}else{
					break;
				}
			}
			tmp[i] = index;
		}
		
		return tmp;
	}
	
	
	public int getSum(int[] counts){
		int sum=0;
		for(int i =0;i<counts.length;i++){
			
			for(int j=i;j<counts.length;j++){
				sum +=Math.abs(counts[i]-counts[j]);
			}
		}
	
		 return sum;
	}
	
}
