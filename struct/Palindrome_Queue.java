package com.bridgelabz.datastrucutre;
/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 
 *  
 *  Purpose: Palindrome Queue
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  
 *
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */
import java.util.Scanner;

public class Palindrome_Queue {
	static char[] queue=new char[1000];
	static int rear;
	static int front;
	static int size;
public void enqueue(char c)
{
	queue[rear]=c;
	rear++;
	size++;
	System.out.println("word getting added to the queue:"+c);
	
}
public char dequeue()
{
	
	char c=queue[front];
	front=front+1;
	rear=rear--;
	size--;
//	System.out.println(queue[front]);
	
	return c;
	
}
public int size()
{
	return size;
}
public boolean isEmpty()
{
	return(size()==0);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner br=new Scanner(System.in);
		String a;
		System.out.println("enter string to be for palindrome to be checked");
		a=br.nextLine();
		int c;
		Palindrome_Queue d=new Palindrome_Queue();
		c=a.length();
		for(int i=c-1;i>=0;i--)
		{
			d.enqueue(a.charAt(i));
		}
		// while (!queue.isEmpty()) {
	         //   reverseString = reverseString+queue.remove();
		String reverse="";
		for(int i=1;i<=c;i++)
		{
		while(!d.isEmpty())
		{
			reverse= reverse+d.dequeue();
	
			
		}
		}
		System.out.println("word after the dequeing from queue::    "+reverse);
	if(a.equals(reverse))	
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("given word is palindrome");
	}
	else
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("word is not palindrome");
	}
		

	}

}
