package com.altho;

/***
 * 
 * ͼʾ����һ�����������Σ����һ������
����Ӷ����׵�ĳ����һ��·����
ʹ��·�������������ֵ��ܺ����
ͼ���£�
    7
   3  8
  8  1  0
 2  7  4  4
4  5  2  6  5
��1�� ÿһ��������б�����»���б�����£� 
��2�� 1��������������100�� 
��3�� �������е�����Ϊ0��1������99
 * @author admin
 *
 *
 *���⣺
�������DP������Ϊ����ģ��ٶ�M(i,j)Ϊ��i���ϵ�j��������·���㣬��ôM(i,j)=max(M(i+1,j),M(i+1,j+1))+B(i,j);����i��δ��ϵ��µ�����
B(i,j)Ϊ������i,jλ�õ�ֵ���������������Ϳ��Ի���һЩС�Ŀ��ظ�����������⣬���⻹��һ�㣬���ǣ��������ظ����ط���
���磬����M(1,0)�Ǽ���һ��M(2,1),����M(1,1)ʱ�ּ���һ��M(2,1)���������϶�̬�滮����2��������
[1]�����ӽṹ;[2]��������ص���;
����������һ������ṹ����¼ÿ�ε�״̬�������ظ�����

����������С��ֵ�أ�

m(i,j) = min(m(i-1,j),m(i-1,j+1))+p(i,j);
 */

public class FindPathInTriangle {
	
	private static int [][] max = new int[5][5];
	private static int [] index = new int[6];
	
	public static void main(String[] args) {
		int [][] arr = new int[][]{{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		int sum = getMaxPath(arr, 0, 0);
		System.out.println(sum);
		System.out.println(index.toString());
		System.out.println(max.toString());
		
	}
	
	public static  int getMaxPath(int [][] arr,int i,int j){
		
		if(i==arr.length) return 0;
		if(arr[i][j]!=0){
			
			int max1 = getMaxPath(arr, i+1, j);
			int max2 = getMaxPath(arr, i+1, j+1);
			if(max1>max2){
				max[i][j] = max1+arr[i][j];
			    index[i+1] = j;
			}else{
				max[i][j] =max2+arr[i][j];
				index[i+1] =j+1;
			}
			
		}
		return max[i][j];
	}

}
