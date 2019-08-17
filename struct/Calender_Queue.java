package com.bridgelabz.datastrucutre;

import java.util.Scanner;

public class Calender_Queue {
	public static int day(int month, int day, int year)
	{
		 int y = year - (14 - month) / 12;
	     int x = y + y/4 - y/100 + y/400;
	     int m = month + 12 * ((14 - month) / 12) - 2;
	     int d = (day + x + (31*m)/12) % 7;
		return d;
	}
	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		
		@SuppressWarnings("unused")
		int mon,year;
		Scanner tr=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the month and year :");
		mon=tr.nextInt();
		year=tr.nextInt();
		//LinkedList obj=new LinkedList();

	}

}
