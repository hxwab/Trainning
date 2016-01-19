package com.altho;
/**
 * 输入一个整形数组，数组里有正数也有负数。
 数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
 求所有子数组的和的最大值。要求时间复杂度为O(n)。
 例如输入的数组为1, -2, 3, 10, -4, 7, 2, -5，和最大的子数组为3, 10, -4, 7, 2，
 因此输出为该子数组的和18。
ANSWER:
 A traditional greedy approach.
 Keep current sum, slide from left to right, when sum < 0, reset sum to 0.
 * 
 * @author csdc
 *
 *事实上，当我们令currSum为当前最大子数组的和，maxSum为最后要返回的最大子数组的和，当我们往后扫描时， 
• 对第j+1个元素有两种选择：要么放入前面找到的子数组，要么做为新子数组的第一个元素； ◦ 如果currSum加上当前元素a[j]后不小于a[j]，则令currSum加上a[j]，否则currSum重新赋值，置为下一个元素，即currSum = a[j]。 

• 同时，当currSum > maxSum，则更新maxSum = currSum，否则保持原值，不更新。 

即 
currSum = max(a[j], currSum + a[j])
maxSum = max(maxSum, currSum)


 *
 */
public class MaxSubarray {
	
	
	public int getMaxSubArrayD(int[] arry){
		int  max = 0;
		int currSum=0;
		for(int i =0; i<arry.length;i++){
			for(int j=i;j<arry.length;j++){
				
				for(int k=i;k<j;k++){
					
					currSum+=arry[k];
					
				}
			}
			
			
		}
		
		return 0;
		
	}
	

	public int getMaxSubArray(int [] arr){
		
		int currSum =0;
		int max=0;
		
		for(int i=0;i<arr.length;i++){
			
			if(currSum+arr[i]<arr[i]){
				currSum =arr[i];
			}else {
				currSum+=arr[i];
			}
			
			if(max<currSum){
				max =currSum;
			}
		}
		
		
		int size =0;
		while(size<arr.length){
			
			currSum+=arr[size++];
			
			if(currSum<0){
				currSum =0;
			}
			if(max<currSum){
				max =currSum;
			}
		}
		return max;
	}

}
