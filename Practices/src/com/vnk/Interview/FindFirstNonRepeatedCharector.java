package com.vnk.Interview;

public class FindFirstNonRepeatedCharector {
   public char nonRepeatedCharector(String str) {
	   char c=' ';
	   for(int i=0;i<str.length();i++) {
		   int count=0;
		   for(int j=0;j<str.length();j++) {
			   if(str.charAt(i)==str.charAt(j)&&i!=j) {
				   count++;
			   }
		   }
		   if(count==0) {
			   c=str.charAt(i);
			   break;
		   }else {
			   c='0';
		   }
	   }
	   return c;
   }
	public static void main(String[] args) {
		System.out.println(new FindFirstNonRepeatedCharector().nonRepeatedCharector("leetcode"));
	}
}
