package com.altho;

/**
 * 
 * 题目：输入一个已经按升序排序过的数组和一个数字，在数组中查找两个数，使得它们的和正好是输入的那个数字。要求时间复杂度是O(n)。
 * 如果有多对数字的和等于输入的数字，输出任意一对即可。
 例如输入数组1、2、4、7、11、15 和数字15。由于4+11=15，因此输出4 和11。


拓展：1、也可以是无序数组 O（nlogn）
    2、和为定值的多个数
 * 
 */
public class Find2NumInArray {
	
	public void find2Num(int [] arry,int num){
		
		int start=0;
		int end =arry.length-1;
		while(start<=end){
			if(arry[start]+arry[end]==num){
				System.out.println(arry[start]+","+arry[end]);
				break;
			}else if(arry[start]+arry[end]>num){
				end--;
			}else{
				start++;
			}
		}
	}
}
