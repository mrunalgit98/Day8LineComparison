package com.linecomparison;

public class compare extends equality{

	public static void lineEquality(double l1,double l2){
        
        if(l1==l2)
        {
            System.out.println("Both the lines are equal");
        }
        else if(l1>l2)
        {
            System.out.println("line1 is greater than second");
        }
        else {
        	System.out.println("line2 is greater than line1");
        }
	
}
}

