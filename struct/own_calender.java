package com.bridgelabz.datastrucutre;
/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************

 *  
 *  Purpose: calender
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

public class own_calender {
public static int day(int month, int day, int year)
{
	 int y = year - (14 - month) / 12;
     int x = y + y/4 - y/100 + y/400;
     int m = month + 12 * ((14 - month) / 12) - 2;
     int d = (day + x + (31*m)/12) % 7;
	return d;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner tr=new Scanner(System.in);
int mon,year;
int c = 0;
System.out.println("enter month and year of the which calender to be display:");
mon=tr.nextInt();
year=tr.nextInt();
if(mon>12)
{
	
	c++;
	System.out.println("enter the month which does not exist");
	
}
String[] month= {"","january","february","march","april","may","june","july","august","september","october","november","december"};

int[] days= {0,31,28,31,30,31,30,31,31,30,31,30,31};
if(mon==2 && year%4==0 )
{
days[mon]=29;	
}
if(c==0)
{
System.out.println("Calender:");
System.out.println("------------------------------------------------------------");	
System.out.println("\t "+month[mon]+"\t"+year);
System.out.println("------------------------------------------------------------");	
System.out.println("   S   M   T   W   T   F   S");

	int d=day( mon, 1, year);
			
			for(int i=0;i<d;i++)
			
				System.out.print("    ");
			
			for(int i=1;i<=days[mon];i++)
			{
				System.out.printf("  %2d", i);
				  
				if (((i + d) % 7 == 0) || (i == days[mon])) System.out.println();
				//System.out.print("------------------------------");
			}	
			
			}
	}

}
