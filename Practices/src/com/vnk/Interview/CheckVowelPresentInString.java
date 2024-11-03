package com.vnk.Interview;

public class CheckVowelPresentInString {

	public static void main(String[] args) {
		String str= "dwrwqdsdghwluyfedsds";	
		String str1=str.toLowerCase();
		int count=0;
		for(int i=0;i<str1.length();i++) {
		switch(str.charAt(i)) {
		case 'a':
			count++;
			break;
		case 'e':
			count++;
			break;
		case 'i':
			count++;
			break;
		case 'o':
			count++;
		case 'u':
			count++;
			break;
		default:   
		  }
		}
		if(count!=0) {
			System.out.println(count+" in that vowels are ther in this String "+str);
		}else {
			System.out.println("Not Present Vowels");
		}
	}
}
