package com.bnp.collections;

import java.util.HashSet;
import java.util.Set;
// Full of error
public class SetTest_HashSet_1 {

	// full of error in this program.
	public static void main(String ar[])
	{
		Set<> s = new Hashset(); //We can't user <> here at list not in this case
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add(“new Object(I)); //No Object constructor is defined like here.
		s.add(new Integer (I)  ); //Integer Constructor accepts String or number and passed String should be number

		for  (Object Q ;  s) //it should not me ; it should be : 
		System.out.println  (s); //here printing input should be Q not s

	}
}
