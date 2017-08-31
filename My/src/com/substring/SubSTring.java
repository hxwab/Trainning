package com.substring;
/**
 * ��������������⣨�����в��������Ӵ�������
 * @author admin
 *
 *���������������������ηֽ�������⣬��A=��a0��a1������am-1����B=��b0��b1������bm-1������Z=��z0��z1������zk-1��Ϊ���ǵ�����������С�����֤�����������ʣ�

��1�� ���am-1=bn-1����zk-1=am-1=bn-1���ҡ�z0��z1������zk-2���ǡ�a0��a1������am-2���͡�b0��b1������bn-2����һ������������У�

��2�� ���am-1!=bn-1������zk-1!=am-1���̺���z0��z1������zk-1���ǡ�a0��a1������am-2���͡�b0��b1������bn-1����һ������������У�

��3�� ���am-1!=bn-1������zk-1!=bn-1���̺���z0��z1������zk-1���ǡ�a0��a1������am-1���͡�b0��b1������bn-2����һ������������С�

����������A��B�Ĺ���������ʱ������am-1=bn-1�����һ�����һ�������⣬�ҡ�a0��a1������am-2���͡�b0��b1������bm-2����һ������������У�
���am-1!=bn-1����Ҫ������������⣬�ҳ���a0��a1������am-2���͡�b0��b1������bn-1����һ������������к��ҳ���a0��a1������am-1���͡�b0��b1������bn-2����һ������������У���ȡ�����нϳ�����ΪA��B������������С�
 *
 *��⣺

����һ����ά����c[][]����c[i][j]��¼X[i]��Y[j] ��LCS �ĳ��ȣ�b[i][j]��¼c[i][j]��ͨ����һ���������ֵ��õģ��Ծ��������ķ���
�������Ե����Ͻ��е��Ƽ��㣬��ô�ڼ���c[i,j]֮ǰ��c[i-1][j-1]��c[i-1][j]��c[i][j-1]���Ѽ����������ʱ���Ǹ���X[i] = Y[j]����X[i] != Y[j]���Ϳ��Լ����c[i][j]��

����ĵݹ�ʽд�ɣ�
              0  ; i = 0 or j=0;
C(i,j)  =     c(i-1,j-1) ;i,j>0 and xi = yj;
              max{c(x-1,j) , c(x,j-1)} xi!=yj


recursive formula

�����������������й��̣�
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
	 * @param str1  ��ȥ�����ַ�ʹʣ�µ��ַ���Ϊ���ġ�ת��Ϊ��str1�����Ӵ�����󹫹�������
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
	 * @param str1  ,str2������������еĳ���
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
