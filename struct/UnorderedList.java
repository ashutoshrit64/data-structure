package com.bridgelabz.datastrucutre;

/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */
/******************************************************************************
 *  
 *  
 *  Purpose:UnorderedList
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  
 *
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.*;

	public class UnorderedList extends LinkedList  {
		
//	     
		static int totalCountbeforedeletion=0,totalCountafterdeletion=0;
		
		
		
		@SuppressWarnings("resource")
		public static void main(String[] args) throws IOException
		{
			Scanner scanner=new Scanner(System.in);
			
			//reading file
			File f1=new File("/home/user/ashu/unordered"); //Creation of File Descriptor for input file
		    FileReader fr=new FileReader(f1);
			BufferedReader br=new BufferedReader(fr);
			
			String[] words=null ;  //Initialize the word Array , this word array is used to store the new words from the file
			
			String s;//this string s used to store each word from the lines of the file
			int count=0;// this count counts the word(newdata) of user i.e how many times the user's word is in the list 
			
			//take input from the user
			System.out.println("Enter string you want to search in the list");
			String newdata=scanner.next(); // user's string stored in newdata 
			
			//UnorderedList list=new UnorderedList();
			
			while((s=br.readLine())!=null)   //Reading Content from the file
		      {
		         words=s.split(" ");
		        // System.out.println(words[]);
		         //Split the word using space and all words will be stored in the words array
		          for (String word : words) //it will run that many times as much there are words in the array
		          {
		        	  System.out.println(word);
		        	  LinkedList.add(word); // we are filling the list here with the words in the file
		        	  if(word.equals(newdata)) 
		        	  {	 
		        		  count++; // if we get the match just increase the count
		        	  }
		        	  
		        		  	  
		        	  totalCountbeforedeletion++;
		          }
		      }	
			System.out.println("\nNumber of words before any operation performed in the list - "+totalCountbeforedeletion);
			
			totalCountafterdeletion=totalCountbeforedeletion-count;
			
			if(count==0)
			{	
				System.out.println("Your word '"+newdata+"' is not in the list");
				totalCountafterdeletion++;
			}
			else
			{
				System.out.println("Your word '"+newdata+"' is found in the list - ");
			}
			//System.out.println("The list is before deletion of word "+newdata);
			System.out.println();
			LinkedList.show();// method of linked list to show the list
			
				
			
			for(int i =0;i<count;i++)  // it deletes same words in the list
			{
				LinkedList.remove(newdata); 
				
			}
			
			if(count==0)
			LinkedList.add(newdata);
			
			System.out.println();
			if(count==0)
			{
				System.out.println("Your word - '"+newdata+"' was not found therefore we added your word to the list.");
				System.out.println("\nUpdated list is as follows -\n");
			}
			else
			{

				System.out.println("There are "+count+" such words in the list");
				System.out.println("The list is after deletion of word "+newdata);
			}//System.out.println(totalCountafterdeletion);
			
			LinkedList.show();
			
			System.out.println("\nFinally there are "+totalCountafterdeletion+" words in the list");
		}

	}