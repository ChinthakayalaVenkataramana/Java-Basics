package com.vnk.Interview;

public class EquelsOperationn {
public static void main(String[] args) {
	String s="java";
	String s2="java";
	System.out.println(s==s2);
	System.out.println(s.equals(s2));
	System.out.println(System.identityHashCode(s2)+" "+System.identityHashCode(s));
 }
}
