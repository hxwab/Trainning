package com.didi;

import java.util.Scanner;

public class BestGrade {
	
	
	public static void main(String[] args) {
		BestGrade bestGrade = new BestGrade();
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int m =0;
		String s0 = sc.nextLine();
		String [] str0 = s0.split(" ");
		n = Integer.parseInt(str0[0]);
		m = Integer.parseInt(str0[1]);
 	//	ArrayList<Integer> grades = new ArrayList<Integer>();
		int [] grades = new int[n+1];
		int index =0;
		/*while(sc.hasNextInt()){
			grades[++index] = sc.nextInt();
		}*/
		String s = sc.nextLine();
		String [] str1 = s.split(" ");
		for(String num : str1){
			grades[++index] = Integer.parseInt(num);
		}
		
		
		
	while(sc.hasNext()){
			String str =sc.nextLine();
			String [] ss = str.split(" ");
			char type = ss[0].charAt(0);
			int first = Integer.parseInt(ss[1]);
			int second = Integer.parseInt(ss[2]);
			if(type=='Q') 
				System.out.println(bestGrade.query(grades, first, second));
			else if(type=='U')
				bestGrade.update(grades, first, second);
			
		}
		
	}
	
	
	
	
	
	public  void update(int[] grades,int id,int grade){
		grades[id] = grade;
	}
	
	public int query(int [] grades ,int start ,int end){
		int max =0;
		for(int i = start;i<=end;i++){
			if(max<grades[i]){
				max = grades[i];
			}
		}
		return max;
	}

}




 class Main1 {
    public static void main(String[] args) {
        int M=0 ,N=0;
        int i;
        int A = 0,B = 0;
        Scanner in = new Scanner(System.in);
        
        //多组输入
        while(in.hasNext()){
                N = in.nextInt();
                M = in.nextInt();  
     
    //          System.out.println (N + " " + M);
                 
            int[] score = new int[N];
            for(i=0; in.hasNext() && i<N; i++){
                score[i] = in.nextInt();
    //          System.out.println (score[i] + " ");
            }
             
            String c = null;
             //AB大小顺序不一定
            for(i=0; in.hasNext() && i< M; i++){
                c  = in.next();
                A = in.nextInt();
                B = in.nextInt();  
                process(c,A,B,score);
            }
        }
             
    }
 
    private static void process(String c, int a, int b, int[] score) {
        int begin,end;     
         
        if(c.equals("Q")){
            end = Math.max(a, b);
            begin = Math.min(a, b)-1;
            int max = score[begin];
            for(int i=begin;i<end;i++){
                if(max<score[i]){
                    max = score[i];
                }
            }
            System.out.println(max);
        }else if(c.equals("U")){
            score[a-1] = b;
        }
    }
}
