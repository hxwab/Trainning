package com.oj;

import java.util.ArrayList;
import java.util.List;

public class GetLength {
	
	public static void main(String[] args) {
		GetLength g = new GetLength();
		String str = " hello world";
		System.out.println(g.getLength(str));
		
		System.out.println(g.revert(str));
		System.out.println(g.change(str));
		
		System.out.println(g.transform("0X76E"));
	}
	
	public int getLength(String str){
		int index = str.lastIndexOf(" ");
		String s = str.substring(index+1);
		return s.length();
		
	}
	

	public String revert(String str){
		if(str==null||str.length()==1) return str;
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
	
	public String change(String s ){
		char [] ch = s.toCharArray();
		return ch.toString();
	}
	
	
	  public  int  transform(String str){
	        
	        if(str ==null || str.length()<2) return 0;
	        
	        str = str.substring(2);
	        int result=0;
	        
	        for(int i =0
	        		;i<str.length();i++){
	            
	            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
	                
	                result =  result *16 +(str.charAt(i)-'0');
	            }else if(str.charAt(i)>='A'&&str.charAt(i)<='F'){
	            	result = result *16 +(str.charAt(i)-'A'+10);
	            }
	            
	        }
	        
	        
	        return result;
	    }
	    
	
	
	public Integer[] decPrime(int n) { 
		
		    List<Integer> list = new ArrayList<Integer>(); 
		
		    for (int i=2;i <= n;i++){ 
		
		        while(n != i){ 
		            if(n%i != 0){ 
		                break;//不能整除肯定不是因数，能够整除在这里一定是质数。因为所有的2，3,5,7 
		                      //都被除完之后。剩下的因数只能是奇数，且是质数。 
		            } 
		            list.add(Integer.valueOf(i)); 
		            n = n/i; 
		        } 
		    } 
		    list.add(Integer.valueOf(n)); 
		    return list.toArray(new Integer[list.size()]); 
		}

}
