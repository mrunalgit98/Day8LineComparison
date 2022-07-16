package com.linecomparison;

import java.util.Scanner;

public class lineComparison {

	static double length(int x1,int y1 ,int x2,int y2)
	{
		double value =((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
		double length=Math.sqrt(value);
		return value;
	}
	
	 public static void lineEquality(double l1,double l2){
	        
	        if(l1==l2)
	        {
	            System.out.println("Both the lines are equal");
	        }
	        else
	        {
	            System.out.println("Both the lines are not equal");
	        }
	 }
        public static void main(String[] args) {
		System.out.println("ENTER FIRST COORDINATE X1");
		Scanner x1=new Scanner(System.in);
		int a1=x1.nextInt();
		
		System.out.println("ENTER SECOND COORDINATE Y1");
		Scanner x2=new Scanner(System.in);
		int a2=x2.nextInt();
		
		System.out.println("ENTER FIRST COORDINATE X2");
		Scanner y1=new Scanner(System.in);
        int b1=y1.nextInt();
		
		
		System.out.println("ENTER SECOND COORDIANTE Y2");
		Scanner y2=new Scanner(System.in);
        int b2=y2.nextInt();
        
       double l1=length(a1,a2,b1,b2);
       System.out.println("length of line1 is "+l1 );
       
       
       
       System.out.println("ENTER FIRST COORDINATE X3");
		Scanner x3=new Scanner(System.in);
		int a3=x3.nextInt();
		
		System.out.println("ENTER SECOND COORDINATE Y3");
		Scanner x4=new Scanner(System.in);
		int a4=x4.nextInt();
		
		System.out.println("ENTER SECOND COORDINATE Y3");
		Scanner y3=new Scanner(System.in);
		int b3=y3.nextInt();
		
		System.out.println("ENTER SECOND COORDINATE Y3");
		Scanner y4=new Scanner(System.in);
		int b4=y4.nextInt();
		
		double l2=length(a3,a4,b3,b4);
	     System.out.println("length of line1 is "+l2  );
	     
	     lineComparison.lineEquality(l1, l2);
       
	}
}
