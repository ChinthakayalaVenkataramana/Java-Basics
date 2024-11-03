package com.vnk.Interview;

public class PrimeNumber {

	public static void main(String[] args) {	
		int num=101;
		/*for(int i=1;i<=num;i++) {
			int count=0;
			if(i==0||i==1)continue;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.print(i+" ");
			}
		}*/
		
		int count=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("polindrome :"+num);
		}
		
	}
}
