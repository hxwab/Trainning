package com.substring;
/**
 * 最长回文子串（连续的）
 * @author admin
 *
 */
public class HuiWenSubString {
	public static void main(String[] args) {
		int a=getTheLongest("abcacbca");
		System.out.println(a);
	}
	
	public  static int getTheLongest(String str){
		
		StringBuffer s = new StringBuffer();
		int maxLength =0;
		for(int i =0;i<str.length();i++){
			s.append(str.charAt(i));
			s.append("#");
		}
		str = s.toString();
		
		for(int i=1;i<s.length();i++){
			
			int temp =0;
			for(int j=1;j<=i&&j<s.length()-i;j++){
				if(str.charAt(i-j)==str.charAt(i+j)){
					temp++;
				}else{
					break;
				}
				
			}
			if(maxLength<temp){
				maxLength=temp;
			}
			
		}
		
		return maxLength;
		
	}
}
