package com.bridgelabz.datastrucutre;
/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 * 
 *  
 *  Purpose:prime
 *
 *  @author  BridgeLabz_ashu
 *  @version 1.0
 *  
 *
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */
/**
 * @author user
 *
 */
public class Prime_2d_ana { 
	static int i; 
	static int no=0;
	
	public static void main(String[] args) {
		int prime[][]=new int[10][200];
		int anagram[][]=new int[10][500];
		@SuppressWarnings("unused")
		int start=0,stop=100,Primecount=0,AnagramCount=0;
		for(int i=0;i<10;i++)
		{
			
			 int returnPrime[]=PrimeUtility.findPrime(start, stop);
			 for(int k=0;k<returnPrime.length;k++)
			 {
				prime[i][k]=returnPrime[k];
				Primecount++;
			}
			 int returnAngram[]=PrimeUtility.findAnagram(returnPrime);
			 for(int k=0;k<returnAngram.length;k++)
			 {
				anagram[i][k]=returnAngram[k];
				
			}
			start=start+100;
			stop=stop+100;
		}
		start=0;stop=100;
		System.out.println("Anagram Number are as follows");
		for(int i=0;i<10;i++)
		{
				System.out.print("\nRange "+start+" - "+stop+"  :\n");	
				for(int k=0;k<anagram[i].length;k+=2)
				{
					if(anagram[i][k]>0 && anagram[i][k+1]>0)
					{
						System.out.print(anagram[i][k]+" And "+anagram[i][++k]+ " Are Anagram\n");
						AnagramCount++;
					}
				
				}
			
			start=start+100;
			stop=stop+100;
		}
	
		System.out.println("Total "+AnagramCount/2);
		
		start=0;stop=100;
		for(int i=0;i<10;i++)
		{
//				System.out.print("\nRange "+start+" - "+stop+"  :\n");	
				for(int k=0;k<anagram[i].length;k+=2)
				{
					if(anagram[i][k]>0 && anagram[i][k+1]>0)
						Anagramtack.push(anagram[i][k],anagram[i][++k]);
				
				}
		}
		
		System.out.println("\nAnagram in Decending Order");
		int count=0;
		AnagramNode node=new AnagramNode();
		node=Anagramtack.pop();
		while(node!=null && Anagramtack.top!=null )
		{
			System.out.println(node.firstNum+" and "+node.secondNum+ " are Anagram");
			node=Anagramtack.pop();
			count++;
		}
		System.out.println("Total Count:"+count);

	}
}

	
	
        
        
 
