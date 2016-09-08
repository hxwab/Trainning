package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n =0;
		int m=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
	    HashMap<String ,Integer> fruits = new HashMap<String, Integer>();
	    
	
		String str1 = sc.nextLine();
		String [] ss = str1.split(" ");
		n = Integer.parseInt(ss[0]);
		m = Integer.parseInt(ss[1]);
		String str2 = sc.nextLine();
		String [] ss2 = str2.split(" ");
		for(String s : ss2){
			list.add(Integer.parseInt(s));
		}
		
		Collections.sort(list);
		
		for(int i=0;i<m;i++){
			String name = sc.nextLine();
			if(fruits.containsKey(name)){
				fruits.put(name, fruits.get(name)+1);
			}else{
				fruits.put(name, 1);
			}
		}
		
		ArrayList< Map.Entry<String, Integer>> infos = new ArrayList<Map.Entry<String,Integer>>(fruits.entrySet());
		Collections.sort(infos,new Comparator<Map.Entry<String, Integer>>() {
			
			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		
		
		int min =0;
		int max =0;
		
		int index=0;
		for(Map.Entry<String, Integer> map :infos){
			
			min +=map.getValue()*list.get(index);
			max +=map.getValue()*list.get(n-index-1);
			index++;
			
		}
		
       System.out.println( min +" " +max);		
	} 
	

}

/**
 * 
 * 
 * 
 * 
 * ʱ�����ƣ�C/C++���� 1000MS���������� 3000MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
ս����Ϸ��������Ҫ���ھ�Ҫ�����ˣ���εĽ������������������������СB�����׶��ķ����������׶�����һ�����滷ɽ������У���Χ��n��Сɽ����һ��������ΪԤ����ʩ��
СB�ƻ���ÿ��Сɽ������һ���۲��ڣ���ҹ��ͣ�Ĳt����Χ�����������
һ��������������¼���ɽ���ϵĸ��ڽ���ȼ���̡��������������ڵ�ɽ��֮��û�и��ߵ�ɽ���ڵ�������֮��������ͨ·������ڿ��Թ۲쵽��һ��ɽ���ϵķ����Ƿ��ȼ��
����Сɽ���ڻ��ϣ���������Сɽ֮�����������ͬ������ͨ·�������������ڵ��������£�һ��ɽ���ϸ��ڵ�ȼ�ķ������ٿ���ͨ��һ��ͨ·����һ�˹۲쵽�������������ڵĸ��ڣ�
һ�˵ĸ���һ�����Է���һ�˵�ȼ�ķ��̡�
СB��Ƶ����ֱ���������һ����Ҫ�������ܹ��۲⵽�Է����̵ĸ��ڶԵ���������ϣ�����ܹ��������������⡣
����
�������ж���������ݡ�ÿ��������ݵĵ�һ��Ϊһ������n��3<=n <=10^6����Ϊ�׶���Χ��Сɽ�������ڶ���Ϊn�����������α�ʾСɽ�ĸ߶�h����1<=h<=10^9����
���
��ÿ��������ݣ��ڵ�����һ����������໥�۲쵽�ĸ��ڵĶ�����

��������
5
1 2 4 5 3
�������
7

Hint

��ܰ��ʾ
�뾡����ȫ�����Խ���10����ǰ���Գ��򣬷��������ܼ��Ŷ��ύ�����ܲ�ѯ���������� 
��������ԡ���ɱ������
��������ʹ�ñ��ر���������ҳ�治��¼��������
**/
