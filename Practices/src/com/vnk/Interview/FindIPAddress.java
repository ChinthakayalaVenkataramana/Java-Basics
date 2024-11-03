package com.vnk.Interview;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class FindIPAddress {

	public static void main(String[] args) throws UnknownHostException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter website name:" );
		String str=sc.nextLine();
		InetAddress it=InetAddress.getByName(str);
		System.out.println(it);
	}

}
