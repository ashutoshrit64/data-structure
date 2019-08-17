package com.bridgelabz.datastrucutre;

import java.util.Scanner;

public class calender {
			
			
			
			public static int Month(int Month,int year)
			{
				if((Month==1) || (Month==2)||(Month==3) || (Month==4)|| (Month==5) || (Month==6)|| (Month==7) || (Month==8)||(Month==9) || (Month==10)||(Month==11) || (Month==12))
				{	int Monthnumber[]={0,1,2,3,4,5,6,7,8,9,10,11,12};
				int Monthsdate[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				//Leap year Condition
				if((year%400 == 0) || ((year%4 == 0) && (year%100 !=0)))
				{ 
					
					Monthsdate[2] = 29;
				}
				//Used to get day for given Month
				int maximum = 0;
				for(int i=1; i<=12; i++)
				{
					//Month entered by user is check with String array of Monthnames and ignore lower and uppercase
					if(Month==Monthnumber[i])
					{
						maximum = Monthsdate[i];
					}
				}
				return maximum;}
				else
					return 0;
			}		
			
			public static int Daycode(int Date,int Month,int Year)
			{
					//	y0 = y − (14 − m) / 12
				int y0,d,d0,y,x,m0,m;
				m=Month;
				y=Year;
				d=Date;
				y0=y-(14-m)/12;											//x = y0 + y0/4 − y0/100 + y0/400
				x=y0 + y0/4 -y0/100 + y0/400;				//	m0 = m + 12 × ((14 − m) / 12) − 2
				m0=m+12*((14-m)/12)-2;							//d0 = (d + x + 31m0 / 12) mod 7
				d0=(d+x+(31*m0/12))%7;
				return d0;
			}
			

			//Function to Create Calender
			public static int[][] Create_Calender(int maximum, int day_number)
			{
				//Initailize array with row length 6 and column length 7 
				int array[][] = new int[6][7];
				int a = 1 ;
				int b = day_number; 
				for(int i=0; i<6; i++)
				{
					for(int j=day_number; j<7; j++)
					{
						if(a <= maximum)
						{
							array[i][j] = a;
							a++;
						}
					}
					day_number = 0;
				}
				//Adjustment to bring last (6th) row elements to first row
				for(int j=0; j<b; j++)
				{
					array[0][j] = array[5][j]; 
				}
				return array;
			}
			//function to DisplayCalender
			public static void DisplayCalender(int array[][], int Month, int year)
			{
			String[] month={"","January","February","March","April","May","June","July","August","Septeber","Octomber","November","December"}; 
				System.out.println("\n\t    ---------------------------------------------------------\t\t\t");
		      System.out.println("\t\t\t\t   "+month[Month]+" "+year); 
		      System.out.println("\t    ---------------------------------------------------------\t\t\t"); 
		      System.out.println("\t\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		      System.out.println("\t    ---------------------------------------------------------\t\t\t"); 
		      //Loop for displaying calender
		      for(int i=0; i<5; i++)
		      {
		    	  System.out.print("\t");
		      	for(int j=0; j<7; j++)
		      	{
		      		if(array[i][j] != 0)
		      		{
		      			System.out.print("\t"+array[i][j]);
		      		}
		      		else
		      		{
		      			System.out.print("\t");
		      		}
		      	}
		      	System.out.println("\n\t    ---------------------------------------------------------\t\t\t");
		      }
				
			}
			

			public static void main(String[] args) 
			{

				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in); 
				System.out.println("Enter Month: ");
				int Month = scanner.nextInt();
				if(Month==0||Month>12)
					System.out.println(+Month+" Month is invalid");
				else 
				{
					System.out.println("Enter Year: ");
					int year = scanner.nextInt();
					if(year==0)
						System.out.println(+year+" year is Invalid");
					else
					{
							int maximum = Month(Month, year);
							int day_number =  Daycode( 1, Month, year);
							int array[][] = new int[6][7];
							array=Create_Calender(maximum, day_number);
				
							DisplayCalender(array,Month,year);
							System.out.println("\n\n\n");
					}
						
				}
			}
		
	}


