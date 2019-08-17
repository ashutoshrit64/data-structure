package com.bridgelabz.datastrucutre;
/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************

 *  
 *  Purpose: Utility Function
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */
import java.util.ArrayList;

public class PrimeUtility {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		public static int[]findPrime(int start,int stop)
		{
			
			ArrayList<Integer>prime=new ArrayList<Integer>();
			int count=0;
			int Prime[]=new int[200];
			for(int i=start;i<stop;i++)
			{
				if(i>=2)
				{
					boolean isPrime=true;
					for(int j=2;j<=i/2;j++)
					{
						if(i%j==0)
						{
							isPrime=false;
							break;
						}
					}
					if(isPrime)
					{
						prime.add(i);
						Prime[count++]=i;
					}
				}
			}
//			int Prime[]=new int[prime.size()];
//			for(int k=0;k<prime.size();k++)
//			{
//				System.out.print(prime.get(k)+" ");
//				Prime[k]=prime.get(k);
//			}
			return Prime;
		}
		public static int[]findAnagram(int[]prime)
		{
			@SuppressWarnings("unused")
			ArrayList<Integer>arr=new ArrayList<Integer>();
			int anagram[]=new int[100];
			int count=0;
			for(int i=0;i<prime.length-1;i++)
			{
				if(prime[i]>0)
				{	
					for(int j=i+1;j<prime.length;j++)
					{
						int firstNum=prime[i];
						int secondNum=prime[j];
						int firstLength=0,secondLength=0;
						int[] firstCount=new int[10];
						int[] secondCount=new int[10];
					
						boolean isAnagram=true;
						for(int k=0;k<10;k++)
						{
							firstCount[k]=0;
							secondCount[k]=0;
						}
						while(firstNum>0)
						{
							int digit1=firstNum%10;
							firstCount[digit1]++;
							firstLength++;
							firstNum/=10;
						}
						while(secondNum>0)
						{
							int digit=secondNum%10;
							secondCount[digit]++;
							secondLength++;
							secondNum/=10;
						}
						if(firstLength==secondLength)
						{
							for(int itr=0;itr<10;itr++)
							{
								if(firstCount[itr]!=secondCount[itr])
								{
									isAnagram=false;
									break;
								}
							}
							if(isAnagram)
							{
//								System.out.println(prime[i]+" "+prime[j]);
//								arr.add(prime[i]);
//								arr.add(prime[j]);
								System.out.println(prime[i]+" "+prime[j]);
								anagram[count]=prime[i];
								anagram[++count]=prime[j];
								count++;
							}
						}
					
			
					
					}
				}
			}
//			int anagram[]=new int[arr.size()];
//			for(int k=0;k<arr.size();k+=2)
//			{
//				System.out.println(arr.get(k)+" "+arr.get(++k));
//				anagram[k]=arr.get(k);
//			}
			for(int k=0;k<anagram.length;k+=2)
			{
				if(anagram[k]>0)
				System.out.println(anagram[k]+" "+anagram[++k]);
				
			}
			return anagram;
		}
	}


	//}

//}
