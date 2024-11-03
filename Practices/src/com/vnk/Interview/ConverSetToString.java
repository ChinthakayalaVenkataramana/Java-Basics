package com.vnk.Interview;
import java.util.Iterator;
import java.util.Set;

public class ConverSetToString {

	public static void main(String[] args) {
		Set<String> set =Set.of("Venky", "RamVenky", "ManiVenky", "Charry");
		
		/*String string=set.toString();
		System.out.println(string);*/
		System.out.println(set.size());
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String st=it.next();
			for(int i=0;i<st.length();i++) {
				
			}
		}
		
	}

}
