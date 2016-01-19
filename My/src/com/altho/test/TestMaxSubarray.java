package com.altho.test;

import com.altho.MaxSubarray;

public class TestMaxSubarray {

	public static void main(String[] args) {
		
		int max = new MaxSubarray().getMaxSubArray(new int[]{1,-2,3,10,-4,7,2,-5});
		System.out.println(max);
	}
}
