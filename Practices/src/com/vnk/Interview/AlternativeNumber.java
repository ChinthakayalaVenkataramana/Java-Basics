package com.vnk.Interview;

import java.util.stream.IntStream;

public class AlternativeNumber {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8,9,10};
	IntStream.range(0,arr.length).filter(i->i%2==0).map(j->arr[j]).forEach(System.out::print);

	}

}
