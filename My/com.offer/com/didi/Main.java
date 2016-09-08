package com.didi;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Main m = new Main();
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] arr = new int[n];
			int negtiveCounts =0;
			int max=Integer.MIN_VALUE;
			for(int i =0;i<n;i++){
				arr[i] =sc.nextInt();
				if(arr[i]<0){
					negtiveCounts++;
					if(arr[i]>max){
						max = arr[i];
					}
				}
			}
			//int re=m.getMaxSum(new int[]{-1,2, 1});
			
			int re =0;
			if(negtiveCounts==n){
				re = max;
			}else{
				re = m.getMaxSum(arr);
			}
			System.out.println(re);
		}
		
		
		
	}

	public int getMax(int[] arr){
		int max =Integer.MIN_VALUE;
		for(int num : arr){
			if(num>max){
				max = num;
			}
		}
		return max;
	}
	
	
	public int getMaxSum(int[] arr){
		
		int sum = 0;
		int max = 0;
		
		for(int i=0;i<arr.length;i++){
			if(sum>=0) {
				sum+=arr[i];
			}else{
				sum = arr[i];
			}
			
			if(max<sum){
				max =sum;
			}
			
		}
		
		return max;
		
	}
}





