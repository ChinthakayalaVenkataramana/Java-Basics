package com.vnk.Interview;

public class ReversString {

	public static void main(String[] args) {
		String s="@HARI";
		/*for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i)+"");
		}*/
		
		/*StringBuffer sb=new StringBuffer();
		sb.append(s);
		System.out.println(sb.reverse().toString());*/
		
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+"");
		}
		

	}

}
