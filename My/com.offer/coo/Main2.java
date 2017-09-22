package coo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 暗黑字符串ABC三个组成的字符串里不连续
 * @author admin
 *
 */
public class Main2 {

	public static char[] chars = new char[30];
	public static int count = 0;
	public static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			
			int n  = sc.nextInt();
			
			
		}
	}
	
	
	
	
	public void swap(char[] ch , int i,int j )
	{
	    char tmp;
	    tmp = ch[i];
	    ch[i] = ch[j];
	    ch[j] =tmp;
	}
	 
	
	public void permute(char [] ch, int i, int n)
	{
	   int j;
	   if (i == n){
		   list.add(new StringBuffer().append(ch).toString());
	   }
	   
	   else
	   {
	        for (j = i; j <= n; j++)
	       {
	          if(ch[i] == ch[j] && j != i)  
	        	  continue;
	          swap(ch,i, j);
	          permute(ch, i+1, n);
	          swap(ch,i, j); //backtrack
	       }
	   }
	} 
	

	
	//含有ABC的
	public int getReslut(String str){
		int len = str.length();
		if(len<=2) return 0;
		StringBuffer sb;
		String tmp;
		int index =0;
		for(int i =0,j=2;i<len-1&&j<len-1;i++,j++){
			sb= new StringBuffer(str.substring(i, j));
			 tmp = sb.toString();
			if(tmp.contains("A")&&tmp.contains("B")&&tmp.contains("C")){
				index++;
				break;
			}
		}
		return index;
	}
}


