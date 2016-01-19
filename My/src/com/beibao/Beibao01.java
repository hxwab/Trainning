package com.beibao;


/**
 * 
 * @author csdc
 *背包问题：动态规划、回溯剪枝法
 *http://blog.csdn.net/jarvischu/article/details/16067319
 *
 *
 */
public class Beibao01 {
	
	final int  N = 3;
	final int  C=16;
	int[] w={10,8,5};  //每个物品的重量  
	int[] v={5,4,1};   //每个物品的价值  
	int[] x={0,0,0};   //x[i]=1代表物品i放入背包，0代表不放入  
	  
	int CurWeight = 0;  //当前放入背包的物品总重量  
	int CurValue = 0;   //当前放入背包的物品总价值  
	  
	int BestValue = 0;  //最优值；当前的最大价值，初始化为0  
	int BestX[] = new int[N];       //最优解；BestX[i]=1代表物品i放入背包，0代表不放入  
	   
	//t = 0 to N-1  
	void backtrack(int t)  
	{  
	 //叶子节点，输出结果  
	    if(t>N-1)   
	    {  
	        //如果找到了一个更优的解  
	        if(CurValue>BestValue)  
	        {  
	            //保存更优的值和解  
	           BestValue = CurValue;  
	            for(int i=0;i<N;++i) BestX[i] = x[i];  
	        }  
	    }  
	    else  
	    {  
	       //遍历当前节点的子节点：0 不放入背包，1放入背包  
	        for(int i=0;i<=1;++i)  
	        {  
	            x[t]=i;  
	  
	            if(i==0) //不放入背包  
	            {  
	                backtrack(t+1);  
	            }  
	            else //放入背包  
	            {  
	               //约束条件：放的下  
	                if((CurWeight+w[t])<=C)  
	              {  
	                 CurWeight += w[t];  
	                    CurValue += v[t];  
	                   backtrack(t+1);  
	                   CurWeight -= w[t];  
	                    CurValue -= v[t];  
	                }  
	          }  
	        }  
	        
	    }  
	}  


}
