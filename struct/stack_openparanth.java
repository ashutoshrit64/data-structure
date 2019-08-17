package com.bridgelabz.datastrucutre;
/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 * 
 *  
 *  Purpose:BalanceParanthisis
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */
import java.util.Scanner;

public class stack_openparanth {
	static String stack[]=new String[100];
	static int top=0;
	static String a;
	public static void push(String data)
	{
	
		stack[top]=data;
		top++;
		
	}
	public int fullS()
	{
		if(top==99)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	public static int isempty()
	{
		if(top==-1)
		{
			//System.out.println("stack is empty");
		return 1;
		}
		else
		{
			return 0;
		}
		
		
	}
	public static String pop()
	{
		if(isempty()==1)
			
		{
			System.out.println("empty stack");
		}
		else
		{
			a=stack[top];
			top--;
			return a;
		}
		return null;
	}
public void show()
{
	for(String n:stack)
	{
		System.out.println(n);
	}
}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner gh=new Scanner(System.in);
System.out.println("enter the full equation to check balanced paranthesis:");

a=gh.next();
int c=a.length();
for(int i=0;i<c;i++)
{
	String s=Character.toString(a.charAt(i));
	{
		if(s=="(" || s=="{" || s=="[")
		{
			push(s);
		}
	 if(s==")" || s=="}" || s=="]")
		{
			if(isempty()==1)
			{
				System.out.println("stack is empty");
			}
			else if(pop()!=s)
			{
				System.out.println("not balanced");
			}
			//else
			//{
			//	System.out.println("balnaced");
			//}
		}
	}
	
}
	}

}
