package com.vnk.Interview;

public class CreatingObject {
public void sum() {
	System.out.println(2+3);
}
	public static void main(String[] args) throws ClassNotFoundException {
		CreatingObject  cb=new CreatingObject();
		Class c=Class.forName("CreatingObject");
	}
}
