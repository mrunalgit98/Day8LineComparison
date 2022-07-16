package com.linecomparison;

public class length {

	
	double length(int x1,int y1 ,int x2,int y2) {
		
		double value =((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
		double length=Math.sqrt(value);
		return value;
	}
}
