package com.altho;

/**
 * 
 * ��Ŀ������һ���Ѿ�������������������һ�����֣��������в�����������ʹ�����ǵĺ�������������Ǹ����֡�Ҫ��ʱ�临�Ӷ���O(n)��
 * ����ж�����ֵĺ͵�����������֣��������һ�Լ��ɡ�
 ������������1��2��4��7��11��15 ������15������4+11=15��������4 ��11��


��չ��1��Ҳ�������������� O��nlogn��
    2����Ϊ��ֵ�Ķ����
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
