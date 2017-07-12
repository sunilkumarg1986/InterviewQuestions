package com.bnp.collections;

import java.util.HashSet;
import java.util.Set;

//No Error but output is junk character; boolean objects location hash code.
public class SetTest_HashSet_3 {

	public static void main(String ar[])
	{
		Set<String> s = new HashSet<String>(); //adding value in hashset returns true of no duplicate else false.
		Boolean[] b=new Boolean[5];
		b[0]=s.add("e"); // true no duplicate
		b[1]=s.add("a"); // true no duplicate
		b[2]=s.add("b"); // true no duplicate
		b[3]=s.add("a"); // false duplicate
		b[4]=s.add("c"); // true no duplicate
		
		System.out.println(b); //returns hashcode object value since we are passing array of boolean.

	}
}