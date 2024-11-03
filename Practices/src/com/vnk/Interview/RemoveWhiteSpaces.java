package com.vnk.Interview;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="Java Is A Height Level Object Oreanted Programing Language, Plateform Indepedent, Robost, Secured, InterPreted Language, Archetructure Nutral Language"
				+ "It's Introduced From Jemse Grosling In Indonesia At 1995 ,The First Name Of Java Is OAK The Symbole Of Java Is TeeCup";
		
		/*String str2=str.replaceAll(" ", "");
		System.out.println(str2);*/
		
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ')
			System.out.print(ch[i]+"");
		}
	}

}
