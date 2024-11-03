package com.vnk.Interview;

import java.util.Arrays;

public class CountNoOfElements {

	public static void main(String[] args) {
		String str="Hello Word demo";
		System.out.println(Arrays.stream(str.split("\\s+")).count());
	}

}
