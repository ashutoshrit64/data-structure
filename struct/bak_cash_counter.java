package com.bridgelabz.datastrucutre;
/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  
 *  
 *  Purpose: Bank_cash_counter
 *
 *  @author  BridgeLabz_ashu
 *  @version 1.0
 * 
 *
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */
import java.util.Scanner;

public class bak_cash_counter {
static int queue[]=new int[1000];
static int size;
static int front;
static int rear;
public static void enqueue(int data) {
	queue[rear]=data;
	rear=(rear+1); 
	size++;
}
public static int dequeue()
{
	int data=queue[front];
	front=(front+1);
	size--;
	//System.out.println(data);
	return data;
}
public static void show()
{
	for(int i=0;i<size;i++)
	{
		System.out.println(queue[(front+ i)] +" ");  
	}
}
public int size()
{
	return size;
}
public  boolean isEmpty()
{
	if(size()==0)
	{
		return true;
		
	}
	return false;
}
//public boolean isFull()
//{
	//if(rear=size-1)
	//{
		//return 
//	}
//}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner tr=new Scanner(System.in);
		bak_cash_counter as=new bak_cash_counter();
		int people=0;
		System.out.println("enter the total bank balance of the bank:");
		int bank_bal=tr.nextInt();
		while(people<100) {
		
		System.out.println("for today total balance in the bank is"+bank_bal);
		System.out.println("Enter 1:Deposit cash\n 2:Withdraw of cash \n 3 for to add person");
		int s=tr.nextInt();
		@SuppressWarnings("unused")
		int max_capa=5;
		
		switch(s)
		{
		case 1:
		{
			if(as.isEmpty())
			{
				System.out.println("enter first user data then deposit or withdraw cash");
			
			}
			else
			{
				System.out.println("enter the amount to deposit the cash");
				int amount;
				amount=tr.nextInt();
				bank_bal=bank_bal+amount;
				System.out.println("total balance="+bank_bal);
				System.out.println();
				as.dequeue();
				
			}
			break;}
		case 2:{
			if(as.isEmpty())
			{
				System.out.println("enter first user data then deposit or withdraw cash");
				break;
			}
			else
			{
				System.out.println("enter the amount to be withdraw from  the bank");
				int amount;
				amount=tr.nextInt();
				if(amount<=bank_bal)
				{
				bank_bal=bank_bal-amount;
				System.out.println("total balance="+bank_bal);
				System.out.println();
				as.dequeue();
				break;
				}
				else {
					System.out.println("bank does not have enoygh bank balance!!!!please enter amount upto"+bank_bal);
					break;
				}
		}
			
			
			
			
		
		}
		case 3:{
			int data=0;
			as.enqueue(data);
			data++;
			people++;
			break;
		}
	}}

	}}
