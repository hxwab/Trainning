package coo;

import java.util.ArrayList;
import java.util.Scanner;


/***
 * [1 , 1 , 1 ,3]转化为回文的最小次数，转化规则：两个相邻的相加后替换掉前一个位置
 * @author admin
 *
 */
public class Huiwen {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list ;
        
		while(sc.hasNext()){
			list = new ArrayList<Integer>();
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
				list.add(sc.nextInt());
			}
			
			int re = getResult(list);
			System.out.println(re);
		}
	}
	
	
	public static  int getResult(ArrayList<Integer> list ){
		
		ArrayList<Integer> tmp = new ArrayList<Integer>(list);
		int len = list.size();
		
		int start = 0;
		int end = len-1;
		int count =0;
		int re=0;
		while(end-start>1){
			if(tmp.get(start)==tmp.get(end)){
				start++;
				end--;
			}else {
				int sum=0;
				int temp =tmp.get(end);
				for(int i = start;i<len;i++){
					sum+=tmp.get(i);
					if(sum==temp){
						count = i-start;
						start =i;
						re +=count;
						break;
					}else if(sum>temp){
						temp+=tmp.get(end-1);
						end--;
					}
				}
				
			}
			
		}
				
		
		
		return re;
		
	}
}
