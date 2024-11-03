package com.vnk.Interview;

public class Fibanocci {
public void fibanocci(int no) {
	int f=0,s=1;
	for(int i=0;i<no;i++) {
		System.out.print(f+" ");
		int a=f+s;
		f=s;
		s=a;
	}
 }
	public static void main(String[] args) {
		new Fibanocci().fibanocci(10);
	}
}
