package com.test;

import java.util.ArrayList;

public class Tencent {
	
	final int NUM = 1000;
	
	public static void main(String[] args) {
		Tencent t = new Tencent();
		ArrayList<Integer> list = new ArrayList<Integer>();
		t.init(list);
		int re=t.getResult(list, 12);
		System.out.println(re);
		System.out.println(t.result(5, 1));
	}
	
	public   void init( ArrayList<Integer> list){
		
		for (int i=2;i<NUM;i++){
			int j=2;
			for(;j<i;j++){
				if(i%j==0)
					break;
			}
			if(i==j) list.add(i);
		}
	}
	
	public int getResult(ArrayList<Integer> list ,int num){
		int start = 0;
		int end = list.size()-1;
		int cnt=0;
		while(start<=end){
			if(list.get(start)+list.get(end)<num){
				start++;
			}else if(list.get(start)+list.get(end)>num){
				end--;
			}else {
				cnt++;
				start++;
			}
		}
		if(list.get(start)*2==num)
			cnt++;
		
		return cnt;
	}
	
	
	public int result(int x, int k){
		
		int num=1;
		int index=0;
		while(num<=x){
			num =num << 1;
		}
		int y =1;
		for(;y<num;y++){
			if(x+y==(x|y)){
				index++;
			}
			if(index==k)
				break;
		}
		
		return y;
	}

}
