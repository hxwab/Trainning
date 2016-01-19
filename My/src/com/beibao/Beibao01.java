package com.beibao;


/**
 * 
 * @author csdc
 *�������⣺��̬�滮�����ݼ�֦��
 *http://blog.csdn.net/jarvischu/article/details/16067319
 *
 *
 */
public class Beibao01 {
	
	final int  N = 3;
	final int  C=16;
	int[] w={10,8,5};  //ÿ����Ʒ������  
	int[] v={5,4,1};   //ÿ����Ʒ�ļ�ֵ  
	int[] x={0,0,0};   //x[i]=1������Ʒi���뱳����0��������  
	  
	int CurWeight = 0;  //��ǰ���뱳������Ʒ������  
	int CurValue = 0;   //��ǰ���뱳������Ʒ�ܼ�ֵ  
	  
	int BestValue = 0;  //����ֵ����ǰ������ֵ����ʼ��Ϊ0  
	int BestX[] = new int[N];       //���Ž⣻BestX[i]=1������Ʒi���뱳����0��������  
	   
	//t = 0 to N-1  
	void backtrack(int t)  
	{  
	 //Ҷ�ӽڵ㣬������  
	    if(t>N-1)   
	    {  
	        //����ҵ���һ�����ŵĽ�  
	        if(CurValue>BestValue)  
	        {  
	            //������ŵ�ֵ�ͽ�  
	           BestValue = CurValue;  
	            for(int i=0;i<N;++i) BestX[i] = x[i];  
	        }  
	    }  
	    else  
	    {  
	       //������ǰ�ڵ���ӽڵ㣺0 �����뱳����1���뱳��  
	        for(int i=0;i<=1;++i)  
	        {  
	            x[t]=i;  
	  
	            if(i==0) //�����뱳��  
	            {  
	                backtrack(t+1);  
	            }  
	            else //���뱳��  
	            {  
	               //Լ���������ŵ���  
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
