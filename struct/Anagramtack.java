package com.bridgelabz.datastrucutre;

public class Anagramtack {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		static AnagramNode top=new AnagramNode();
		public static boolean isEmpty()
		{
			if(top==null)
				return true;
			else
				return false;
		}
		public static void push(int first,int second)
		{
			AnagramNode newNode=new AnagramNode();
			newNode.firstNum=first;
			newNode.secondNum=second;
					
			if(isEmpty())
			{
				top=newNode;
			}
			else
			{
				AnagramNode current=top;
				newNode.next=current;
				top=newNode;
			}
		}
		public static AnagramNode pop()
		{
			AnagramNode current=top.next;
			top=current;
			current=null;
			
			return top;
		}}
	

	//}

//}
