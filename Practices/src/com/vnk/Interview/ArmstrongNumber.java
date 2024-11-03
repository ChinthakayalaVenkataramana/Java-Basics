package com.vnk.Interview;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int x=153;
		int x1=x;
		int arm=0;		
		while(1<=x) {
			int v=x%10;
			arm=arm+(v*v*v);
			x/=10;
		}
		if(x1==arm)
		System.out.println(x1);
		else
		 System.out.println("NOT ARMSTRONG");
	}
}
