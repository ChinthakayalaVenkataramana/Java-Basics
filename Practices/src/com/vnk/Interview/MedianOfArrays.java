package com.vnk.Interview;

public class MedianOfArrays {
     public double medain(int []arr) {
    	double r=0;
    	 if(arr.length%2==1)return arr[arr.length/2];
    	 else {
    	r =arr[(arr.length-1)/2]+arr[(arr.length/2)];	 
    	 }
    	 return r/2.0;
     }
	public static void main(String[] args) {
			System.out.println(new MedianOfArrays().medain(new int[] {10,20,31,32,50,60}));	
	}

}
