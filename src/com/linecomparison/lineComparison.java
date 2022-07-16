package com.linecomparison;

import java.util.Scanner;

public class lineComparison {

	static double length(int x1,int y1 ,int x2,int y2)
	{
		double value =((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
		double length=Math.sqrt(value);
		return value;
	}
	public static void main(String[] args) {
		System.out.println("ENTER FIRST COORDINATE X");
		Scanner x1=new Scanner(System.in);
		int a1=x1.nextInt();
		
		System.out.println("ENTER SECOND COORDINATE Y");
		Scanner x2=new Scanner(System.in);
		int a2=x2.nextInt();
		
		System.out.println("ENTER FIRST COORDINATE X");
		Scanner y1=new Scanner(System.in);
        int b1=y1.nextInt();
		
		
		System.out.println("ENTER SECOND COORDIANTE Y");
		Scanner y2=new Scanner(System.in);
        int b2=y2.nextInt();
        
       double value=length(a1,a2,b1,b2);
       
       System.out.println("length of line is "+value  );
	}
}
