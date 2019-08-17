package com.bridgelabz.datastrucutre;
/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 
 *  Purpose: BalanceParanthesis in a equation
 *
 *  @author  BridgeLabz_ashu
 *  @version 1.0

 *
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */
import java.util.Scanner;

public class Stack_balance {
static int a=1000;
static String[] stack=new String[a];
static String b;
//static String s;
static int top=-1;
static Scanner tr=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
System.out.println("enter the expression to check the balance paranthesis");
b=tr.next();
d=balance(b);
if(d==0)
{
	System.out.println("equation has no balanced parenthesis");
}
else
{
	System.out.println("equation has balanced parenthesis");
}
	}
	
	
	
	public static int balance(String data) {
	int s=data.length();
		for(int i=0;i<s;i++)
			{
			String z,last;
			if(data.charAt(i)=='[' || data.charAt(i)=='{' || data.charAt(i)=='(')
			{
				z=Character.toString(data.charAt(i));
				push(z);
			}
			else if(data.charAt(i)==']' || data.charAt(i)=='}' || data.charAt(i)==')')
			{
				if(isEmpty()==1)
				{
					return 0;
				}
				else 
				{
					z=pop();
					last=z;
				}
				if((Character.toString(data.charAt(i)).equals(")") && last.equals("[")) || (Character.toString(data.charAt(i)).equals(")") && last.equals("}")) || (Character.toString(data.charAt(i)).equals("]") && last.equals("(")) || (Character.toString(data.charAt(i)).equals("]") && last.equals("}")) || (Character.toString(data.charAt(i)).equals("}") && last.equals("(")) || (Character.toString(data.charAt(i)).equals("}") && last.equals("[")))
						{
					return 0;
						}
			
			}	
			
		
			}
		if(top>-1)
			
			return 0;
		
		else
		
			return top;
		
		
	}
	public static void push(String ele)
	{
		if(isFull()==1)
		{
			System.out.println("full stack");
		}
		else {
			top++;
		stack[top]=ele;
		
		}
	}
	public static int isFull()
	{
		if(top==a-1)
		{
			return 1;
		}
		else
			return 0;
	}
	public static int isEmpty()
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
	if(isEmpty()==1)
			
		{
			System.out.println("empty stack");
		}
		else
		{
			b= stack[top];
			top--;
			return b;
		}
		return null;
		//public static String pop()
		//{
			//if(isEmpty()==1)
			//	System.out.println("Stack is empty");
			//else 
			//{
			//	element=stack[top];
			//	top--;
			//	return element;
		//	}
			//return null;
		//}
	}
}
