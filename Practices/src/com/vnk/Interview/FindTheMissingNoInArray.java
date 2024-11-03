package com.vnk.Interview;

import java.util.Arrays;

public class FindTheMissingNoInArray {

	public static void main(String[] args) {
		FindTheMissingNoInArray mn=new FindTheMissingNoInArray();
		System.out.println(mn.missing(new int[] {0,1}));
	}

	private int missing(int[] arr) {
		/*Arrays.sort(arr);
		int bigNum=arr[arr.length-1];
			int num=0;
			for(int i=0;i<bigNum;i++) {
				int count=0;
				for(int j=0;j<arr.length;j++) {
					if(i==arr[j]&&i!=j) {
						count++;
					}
				}
				if(count==0) {
					num=i;
				}
			}
			return num;*/
		
		/*int a[]=new int[arr.length+1];
		Arrays.fill(a,-1);
		for(int i=0;i<arr.length;i++) {
			a[arr[i]]=arr[i];
			System.out.println(a[arr[i]]+" "+arr[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==-1)  return i;
		}
		return 0;*/
		
		int s=arr.length*(arr.length+1)/2;
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return s-sum;
	}
}
