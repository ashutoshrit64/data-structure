package com.bridgelabz.datastrucutre;
/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 * 
 *  
 *  Purpose:2-Dimensional array in prime
 *
 *  @author  BridgeLabz_ashu
 *  @version 1.0

 *
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */
import java.util.LinkedList;

public class prime_2d {
//public static boolean isPrime()
//{
	//return true;
//}
	
//int []a=new int[]
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		LinkedList obj=new LinkedList();
	        int i,k,j;
	        int ab[][]=new int[100][100];
	        int n=0;
	        int count=100;
	        for(i=1;i<1000;i++)
	        {
	            k=0;
	            for(j=2;j<i;j++)
	            {
	                if(i%j==0)
	                {
	                    k=1;
	                    break;
	             
	                }
	            }
	            if(i==1||i==2)
	            {
	            	k=1;
	            }
	            if(k==0)
	            {
	                //System.out.println(i);
	                obj.add(i);
	            }
	        }
	        i=0;
	        for(int m=0;m<(1000/100);m++)
	        {
	        	System.out.println("The number is in between "+(count-100)+" to "+count);
	        	for(int t=0;t<=100;t++)
	        	{
	        		
	        		if((int)obj.get(n)<count)
	        		{
	        			//Object[][] ab;
						ab[m][t]=(int) obj.get(i);
						System.out.print(ab[m][t]+"  ");
						i++;
						n++;
						
	        		}
	        		else
	        		{
	        			//System.out.println("error");
	        		}
	        	}
	        	count=count+100;
	        	System.out.println("");
	        	System.out.println("");
	        }
	        for(int m=0;m<(i/100);m++)
	        {
	        	for(int t=0;t<=100;t++)
	        	{
	        		System.out.println("list:"+ab[m][t]);
	        	}
	        
	        }
	        
	        
	        
	    }
	
	
	
	}


