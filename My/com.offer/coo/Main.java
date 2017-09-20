package coo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int x =sc.nextInt();
			int y = sc.nextInt();
			
			int re =  rev(rev(x)+rev(y));
			System.out.println(re);
			
		}
	}
	
	public static  int rev(int x){
		StringBuffer sb= new StringBuffer(String.valueOf(x));
		String str = sb.reverse().toString();
		return Integer.parseInt(str);
	}

}
