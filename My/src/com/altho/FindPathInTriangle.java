package com.altho;

/***
 * 
 * 图示出了一个数字三角形，请编一个程序，
计算从顶至底的某处的一条路劲，
使该路劲所经过的数字的总和最大。
图如下：
    7
   3  8
  8  1  0
 2  7  4  4
4  5  2  6  5
（1） 每一步可沿左斜线向下或右斜线向下； 
（2） 1＜三角形行数≤100； 
（3） 三角形中的数字为0，1，……99
 * @author admin
 *
 *
 *解题：
这个题用DP解是最为方便的，假定M(i,j)为第i层上第j个点的最大路径点，那么M(i,j)=max(M(i+1,j),M(i+1,j+1))+B(i,j);其中i层次从上到下递增，
B(i,j)为三角在i,j位置的值。这样这个大问题就可以划归一些小的可重复的问题来求解，另外还有一点，就是，其中有重复求解地方，
例如，计算M(1,0)是计算一次M(2,1),计算M(1,1)时又计算一次M(2,1)，这样符合动态规划求解的2个特征：
[1]最优子结构;[2]子问题的重叠性;
这里我们用一个数组结构来记录每次的状态，避免重复计算

假若是求最小的值呢？

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
