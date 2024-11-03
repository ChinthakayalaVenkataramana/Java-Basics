package com.vnk.Interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianOfArray {
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int []arr=IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
	        Arrays.sort(arr);
	        
			/*int[] arr=new int[nums1.length+nums2.length];
				for(int i=0;i<nums1.length;i++) {
					arr[i]=nums1[i];
				}
				for(int i=0;i<nums2.length;i++) {
					arr[nums1.length+i]=nums2[i];
				}*/
	        
			/*System.arraycopy(nums1, 0, arr, 0, nums1.length);
			System.arraycopy(nums2, 0, arr,  nums1.length, nums2.length);*/	
			/* 
			for(int a:arr) {
				System.out.print(a+" ");
			}
			System.out.println();*/
	        
	        double median=0;
	        if(arr.length%2==1) return arr[arr.length/2];
	        else 
	        	median=arr[arr.length/2-1]+arr[arr.length/2];
	        return median/2.0;
	    }
	public static void main(String[] args) {
	  
		System.out.println(MedianOfArray.findMedianSortedArrays(new int[] {1,2}, new int[]{3,4}));
	}
}
