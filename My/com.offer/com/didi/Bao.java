package com.didi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Bao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			
			int n =sc.nextInt();
			int m =sc.nextInt();
			ArrayList<Integer> capcity = new ArrayList<Integer>();
			ArrayList<Custome> custome = new ArrayList<Custome>();
			for(int i=0;i<n;i++){
				capcity.add(sc.nextInt());
			}
			
			for(int i =0;i<m;i++){
				custome.add(new Custome(sc.nextInt(),sc.nextInt()));
			}
			
			
			ArrayList<Custome> pepoles =  new ArrayList<Custome>(custome);
			Collections.sort(pepoles, new Comparator<Custome>() {
				
				@Override
				public int compare(Custome o1, Custome o2) {
					if(o1.pepoles==o2.pepoles){
						return o1.prices-o2.prices;
					}else{
						return o1.pepoles-o2.pepoles;
					}
				}
			});
			
			Collections.sort(capcity);
			
			int total=0;
			for(int tableSize : capcity){
				int maxPrice =0;
				for(Custome c :custome){
					if(c.isUsed&&c.pepoles<tableSize){
						if(maxPrice<c.prices){
							maxPrice =c.prices;
							c.isUsed =true;
						}
					}else{
						break;
					}
					
				}
				
				total+=maxPrice;
				
			}
			
			System.out.println(total);
		}
	}
	
	
	public static  int getLessIndex(ArrayList<Custome> list,int tableSize){
		int left =0;
		int right = list.size()-1;
		int index=0;
		while(true){
			int mid = (left+right)/2;
			if(list.get(mid).pepoles<tableSize){
				left = mid+1;
			}else if( list.get(mid).pepoles>tableSize){
				right = mid-1;
			}else{
				index =mid;
				break;
			}
		}
		return index;
		
	}
	
	
}

class Custome{
	int pepoles;
	int prices;
	boolean isUsed =false;
	public Custome(int pepoles, int prices) {
		this.pepoles = pepoles;
		this.prices = prices;
	}
	
}
