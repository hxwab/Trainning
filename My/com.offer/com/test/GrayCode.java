package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class GrayCode {
	
	
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int num = sc.nextInt();
			ArrayList<Integer> arr= new ArrayList<Integer>();
			for(int i=0;i<=num;i++){
				arr.add(i);
			}
			System.out.println(getLast(arr));
		}
		*/
		
		int [][] a  = new int[4][4];
		int index =1;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				a[i][j]= index++;
			}
		}
		
		print(a);
		
	}
	
	//����һ���ݹ�
	//�ݹ��˼·����nλgray������n-1λgray�����ɣ��ٸ����Ӽ�һЩ��
	//������n=3��gray�룬����֪��n=2��gray����(00,01,11,10)
	//��ôn=3��gray����ʵ���Ƕ�n=2��gray����λ���0��1���ɵģ����0����(000,001,011,010)
	//���1����Ҫ˳����ͱ��(110,111,101,100)
	//�����һ�����(000,001,011,010,110,111,101,100)
	
	public ArrayList<String> getGray(int n){
		ArrayList<String> gray = new ArrayList<String>();
		if(n==1){
			gray.add("0");
			gray.add("1");
			return gray;
		}
		
		ArrayList<String> lastGray = getGray(n-1);
		for(int i=0;i<lastGray.size();i++){
			gray.add("0"+lastGray.get(i));
		}
		
		for(int i =lastGray.size()-1;i>0;i--){
			gray.add("1"+lastGray.get(i));
		}
		
		return gray;
		
	}
	
	
	public static  int getLast(ArrayList<Integer> array){
		
		while(array.size()!=1){
			int length = array.size();
			for(int i=length-1;i>=0;i--){
				if(i%2==0)
				array.remove(i);
			}
		}
		
		return array.get(0);
	}

	
	public  static void print(int[][] arr){
		int length = arr.length-1;
		int [] re = new int[length*length];
		
		int index =0;
		
		while(index<=length){
			
			for(int i =0;i<=index;i++){
				System.out.println(arr[i][length+i-index]);
			}
			index++;
		}
		
		index--;
		
		while(index>=0){
			int y=0;
			for(int i = length-index+1;i<=length;i++){
				System.out.println(arr[i][y++]);
			}
			index--;
		}
		
	}
}
