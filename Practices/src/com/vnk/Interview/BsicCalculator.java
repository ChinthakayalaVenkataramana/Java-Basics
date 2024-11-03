package com.vnk.Interview;

import java.util.Scanner;

public class BsicCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value 1:");
		double v1=sc.nextDouble();
		System.out.println("Enter a Vaue 2:");
		double v2=sc.nextDouble();
		System.out.println("\t1. +\n\t2. -\n\t3. / \n\t4. * \n\t5. %");
		char ch=sc.next().charAt(0);
		double total=0;
		switch(ch) {
		case '+': total=v1+v2;
			break;
		case '-':total=v1-v2;
			break;
		case '%':total=v1%v2;
			break;
		case '/':total=v1/v2;
			break;
		case '*':total=v1*v2;
			break;
		default:
			System.out.println("place enter Currect Symbol");
		}
		System.out.printf("%.1f %c %.1f = %.1f",v1,ch,v2,total);
	}

}
