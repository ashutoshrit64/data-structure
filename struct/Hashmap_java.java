package com.bridgelabz.datastrucutre;
/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Hashmap.
 *
 *  @author  BridgeLabz_ashu
 *  @version 1.0
 * 
 *
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hashmap_java {
	static int[] slot=new int[10];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		//BufferedReader f1=new BufferedReader(new FileReader(file));
	
		try 
{
			
			File file=new File("/home/admin1/a/ggh");
			Scanner scan=new Scanner(file);
			int temp=0;
			int i=0;
			while(scan.hasNext())
		{
			 temp=scan.nextInt();
			 slot[i]=temp;
			 i++;
		}
		
		scan.close();
}
		catch(Exception e) 
{
					System.out.println("error");
}
		
					System.out.println("File converted into slot:"+Arrays.toString(slot));
		
		
					
					ArrayList<Integer> list0=new ArrayList<Integer>(10);
					ArrayList<Integer> list1=new ArrayList<Integer>(10);
					ArrayList<Integer> list2=new ArrayList<Integer>(10);
					ArrayList<Integer> list3=new ArrayList<Integer>(10);
					ArrayList<Integer> list4=new ArrayList<Integer>(10);
					ArrayList<Integer> list5=new ArrayList<Integer>(10);
					ArrayList<Integer> list6=new ArrayList<Integer>(10);
					ArrayList<Integer> list7=new ArrayList<Integer>(10);
					ArrayList<Integer> list8=new ArrayList<Integer>(10);
					ArrayList<Integer> list9=new ArrayList<Integer>(10);
		
	@SuppressWarnings("resource")
	Scanner tr= new Scanner(System.in);
	System.out.println("enter the number to be searched in the slot");
	int a=tr.nextInt();
	
	int slotnumber=a%11;
	String writer=" ";
	
	for(int i=0;i<slot.length;i++)
	{
		int c=slot[i]%11;
			if(c==0)
		{
			list0.add(slot[i]);
		}
			else if(c==1)
		{
			list1.add(slot[i]);
		}
			else if(c==2)
		{
			list2.add(slot[i]);
		}
			else if(c==3)
		{
			list3.add(slot[i]);
		}
			else if(c==4)
		{
			list4.add(slot[i]);
		}
			else if(c==5)
		{
			list5.add(slot[i]);
		}
			else if(c==6)
		{
			list6.add(slot[i]);
		}
			else if(c==7)
		{
			list7.add(slot[i]);
		}
			else if(c==8)
		{
			list8.add(slot[i]);
		}
			else if(c==9)
		{
			list9.add(slot[i]);
		}
		
	}
			switch(slotnumber)
	{
			
	case 0:
	{
				boolean gotNum=true;
				gotNum=list0.contains(a);
			if(gotNum)
			{
				System.out.println("list has number already in it so we delete the element");
				list0.removeAll(Arrays.asList(a));
				System.out.println("new slot of array is:");
				for(int slotnum:list0 )
				{
					//writer=slotnum;
					//System.out.println(" "+slotnum);
					System.out.println(writer+" "+slotnum);
				}
			}
			else
			{
				System.out.println("Number is not present in the list so we add number in the list");
				list0.add(a);
				System.out.println("new slot of array is:");
				for(int slotnum:list0)
				{
					//writer=slotnum;
					//System.out.println(" "+slotnum);
					System.out.println(writer+""+slotnum);
				}
			}
			break;
	}
	case 1:
	{
				boolean gotNum=true;
				gotNum=list1.contains(a);
			if(gotNum)
			{
				System.out.println("list has number already in it so we delete the element");
				list1.removeAll(Arrays.asList(a));
				System.out.println("new slot of array is:");
				for(int slotnum:list1)
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+" "+slotnum);
				}
			}
			else
			{
				System.out.println("Number is not present in the list so we add number in the list");
				list1.add(a);
				System.out.println("new slot of array is:");
				for(int slotnum:list1)
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+""+slotnum);
				}
			}
			break;
	}
	case 2:
	{
				boolean gotNum=true;
				gotNum=list2.contains(a);
			if(gotNum)
			{
				System.out.println("list has number already in it so we delete the element");
				list2.removeAll(Arrays.asList(a));
				System.out.println("new slot of array is:");
				for(int slotnum:list2 )
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+" "+slotnum);
				}
			}
			else
			{
				System.out.println("Number is not present in the list so we add number in the list");
				list2.add(a);
				System.out.println("new slot of array is:");
				for(int slotnum:list2)
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+""+slotnum);
				}
			}
			break;
	}
	case 3:
	{
				boolean gotNum=true;
				gotNum=list3.contains(a);
			if(gotNum)
			{
				System.out.println("list has number already in it so we delete the element");
				list3.removeAll(Arrays.asList(a));
				System.out.println("new slot of array is:");
				for(int slotnum:list3 )
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+" "+slotnum);
				}
			}
			else
			{
				System.out.println("Number is not present in the list so we add number in the list");
				list3.add(a);
				System.out.println("new slot of array is:");
				for(int slotnum:list3)
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+""+slotnum);
				}
			}
			break;
	}
	case 4:
	{
				boolean gotNum=true;
				gotNum=list4.contains(a);
			if(gotNum)
			{
				System.out.println("list has number already in it so we delete the element");
				list0.removeAll(Arrays.asList(a));
				System.out.println("new slot of array is:");
				for(int slotnum:list4 )
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+" "+slotnum);
				}
			}
			else
			{
				System.out.println("Number is not present in the list so we add number in the list");
				list4.add(a);
				System.out.println("new slot of array is:");
				for(int slotnum:list4)
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+""+slotnum);
				}
			}
			break;
	}
	case 5:
	{
				boolean gotNum=true;
				gotNum=list5.contains(a);
			if(gotNum)
			{
				System.out.println("list has number already in it so we delete the element");
				list5.removeAll(Arrays.asList(a));
				System.out.println("new slot of array is:");
				for(int slotnum:list5 )
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+" "+slotnum);
				}
			}
			else
			{
				System.out.println("Number is not present in the list so we add number in the list");
				list5.add(a);
				System.out.println("new slot of array is:");
				for(int slotnum:list5)
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+""+slotnum);
				}
			}
			break;
	}
	case 6:
	{
				boolean gotNum=true;
				gotNum=list6.contains(a);
			if(gotNum)
			{
				System.out.println("list has number already in it so we delete the element");
				list6.removeAll(Arrays.asList(a));
				System.out.println("new slot of array is:");
				for(int slotnum:list6 )
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+" "+slotnum);
				}
			}
			else
			{
				System.out.println("Number is not present in the list so we add number in the list");
				list6.add(a);
				System.out.println("new slot of array is:");
				for(int slotnum:list6)
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+""+slotnum);
				}
			}
			break;
	}
	case 7:
	{
				boolean gotNum=true;
				gotNum=list7.contains(a);
			if(gotNum)
			{
				System.out.println("list has number already in it so we delete the element");
				list0.removeAll(Arrays.asList(a));
				System.out.println("new slot of array is:");
				for(int slotnum:list7 )
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+" "+slotnum);
				}
			}
			else
			{
				System.out.println("Number is not present in the list so we add number in the list");
				list7.add(a);
				System.out.println("new slot of array is:");
				for(int slotnum:list7)
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+""+slotnum);
				}
			}
			break;
	}
	case 8:
	{
				boolean gotNum=true;
				gotNum=list8.contains(a);
			if(gotNum)
			{
				System.out.println("list has number already in it so we delete the element");
				list0.removeAll(Arrays.asList(a));
				System.out.println("new slot of array is:");
				for(int slotnum:list8 )
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+" "+slotnum);
				}
			}
			else
			{
				System.out.println("Number is not present in the list so we add number in the list");
				list8.add(a);
				System.out.println("new slot of array is:");
				for(int slotnum:list8)
				{
					//System.out.println(" "+slotnum);
					System.out.println(writer+""+slotnum);
				}
			}
			break;
	}
	case 9:
	{
				boolean gotNum=true;
				gotNum=list9.contains(a);
			if(gotNum)
			{
				System.out.println("list has number already in it so we delete the element");
				list9.removeAll(Arrays.asList(a));
				System.out.println("new slot of array is:");
				for(int slotnum:list9 )
				{
					//writer=slotnum;
					//System.out.println(" "+slotnum);
					System.out.println(writer+" "+slotnum);
				}
			}
			else
			{
				System.out.println("Number is not present in the list so we add number in the list");
				list9.add(a);
				System.out.println("new slot of array is:");
				for(int slotnum:list9)
				{
					//System.out.println(" "+slotnum);
					//writer=slotnum;
					System.out.println(writer+""+slotnum);
				}
			}
			break;
	}
			
			
			
			
			
	}
	
try
{
FileWriter f1=new FileWriter("/home/admin1/a/write ");
f1.write(writer);
f1.close();
}
catch(Exception e)
{
	System.out.println("file error");
}
















	}

}
