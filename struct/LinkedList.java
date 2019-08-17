package com.bridgelabz.datastrucutre;
/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************

 *  
 *  Purpose: LinkedList
 *
 *  @author  BridgeLabz_ashu
 *  @version 1.0
 * *
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */
public class LinkedList
{
	static Node head;
	public static class Node {
		String data;
		Node next;
		//public String at;.
Node(String d)
{
	d=data;
	next=null;
}
		}
	//insert method
	public static void add(String data)
	{
		Node node= new Node(data); //a object named node of class Node created
		node.data=data;
		node.next=null;   // data|next(null)
	
		if(head==null) 
		{
			head=node;	//if there's only one node so head will be that node
		}
		else
		{
			Node n=head;	//creating a new node
		
		
		//now jumping of nodes
		
		while(n.next!=null)		// address position if not null
		{
			n=n.next;		//n la next node shi point kela
		}
		
		//once you get the null
		n.next=node;	//next node madhe previous node takla
		}
	}
	
	//remove item
	public static boolean remove(String word) {

	    if (head== null)   // list is empty
	        return false;

	    Node n = head;
	    Node prev = null;

	    do {
	       if (n.data.equals(word)) {  // word found
	           if (prev != null)
	           {
	              prev.next = n.next;   // connect previous to next
	           } else {
	              head = head.next;     // connect head to next
	           }
	           return true;
	       }
	       prev = n;
	       n = n.next;
	    } while (n != null);   // repeat till the end of a list
	    return false;
	}
	

	
	//show method
	 public static void show()
	 {
		 Node node=head;
		 
		 while(node.next!=null) // traverse until there is nothing in address block
		 {
			 System.out.println(node.data+" "); //print data of each node
			 node=node.next; // shifting to the next node
		}
		 System.out.println(node.data);
		 /*The upper while loop will not print the last node
		 because last node has next=null but it has data for that the below ---*/
		 
		 
	 }
	
	
	
//end of linked list class

}
