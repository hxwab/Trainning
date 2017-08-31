package com.substring;
/**
 * 最长公共子序列问题（子序列不连续、子串连续）
 * @author admin
 *
 *考虑最长公共子序列问题如何分解成子问题，设A=“a0，a1，…，am-1”，B=“b0，b1，…，bm-1”，并Z=“z0，z1，…，zk-1”为它们的最长公共子序列。不难证明有以下性质：

（1） 如果am-1=bn-1，则zk-1=am-1=bn-1，且“z0，z1，…，zk-2”是“a0，a1，…，am-2”和“b0，b1，…，bn-2”的一个最长公共子序列；

（2） 如果am-1!=bn-1，则若zk-1!=am-1，蕴涵“z0，z1，…，zk-1”是“a0，a1，…，am-2”和“b0，b1，…，bn-1”的一个最长公共子序列；

（3） 如果am-1!=bn-1，则若zk-1!=bn-1，蕴涵“z0，z1，…，zk-1”是“a0，a1，…，am-1”和“b0，b1，…，bn-2”的一个最长公共子序列。

这样，在找A和B的公共子序列时，如有am-1=bn-1，则进一步解决一个子问题，找“a0，a1，…，am-2”和“b0，b1，…，bm-2”的一个最长公共子序列；
如果am-1!=bn-1，则要解决两个子问题，找出“a0，a1，…，am-2”和“b0，b1，…，bn-1”的一个最长公共子序列和找出“a0，a1，…，am-1”和“b0，b1，…，bn-2”的一个最长公共子序列，再取两者中较长者作为A和B的最长公共子序列。
 *
 *求解：

引进一个二维数组c[][]，用c[i][j]记录X[i]与Y[j] 的LCS 的长度，b[i][j]记录c[i][j]是通过哪一个子问题的值求得的，以决定搜索的方向。
我们是自底向上进行递推计算，那么在计算c[i,j]之前，c[i-1][j-1]，c[i-1][j]与c[i][j-1]均已计算出来。此时我们根据X[i] = Y[j]还是X[i] != Y[j]，就可以计算出c[i][j]。

问题的递归式写成：
              0  ; i = 0 or j=0;
C(i,j)  =     c(i-1,j-1) ;i,j>0 and xi = yj;
              max{c(x-1,j) , c(x,j-1)} xi!=yj


recursive formula

回溯输出最长公共子序列过程：
 */
public class SubSTring {

	static int[][] dp;
	
	public static void main(String[] args) {
		String str = "sogou";
		int re =  getLCS(str);
		System.out.println(re);
	}
	
	/**
	 * 
	 * @param str1  除去多少字符使剩下的字符串为回文。转化为求str1及其子串的最大公共子序列
	 * @return
	 */
	public static int getLCS(String str1){
		dp = new int [str1.length()+1][str1.length()+1];
		
		String str2 = new StringBuffer(str1).reverse().toString();
		int len = str1.length();
		for(int i =0 ; i<len;i++){
			for(int j=0;j<len;j++){
				if(str1.charAt(i)==str2.charAt(j)){
					dp[i+1][j+1] =dp[i][j]+1;
				}else{
					dp[i+1][j+1] =Math.max(dp[i][j+1], dp[i+1][j]);
				}
			}
		}
		return dp[len][len];
	}
	
	
	/**
	 * 
	 * @param str1  ,str2的最长公共子序列的长度
	 * @return
	 */
	public static int getLCS(String str1,String str2){
		dp = new int [str1.length()+1][str2.length()+1];
		
		
		int len = str1.length();
		int len2 = str2.length();
		for(int i =0 ; i<len;i++){
			for(int j=0;j<len2;j++){
				if(str1.charAt(i)==str2.charAt(j)){
					dp[i+1][j+1] =dp[i][j]+1;
				}else{
					dp[i+1][j+1] =Math.max(dp[i][j+1], dp[i+1][j]);
				}
			}
		}
		return dp[len][len];
	}
	
}
