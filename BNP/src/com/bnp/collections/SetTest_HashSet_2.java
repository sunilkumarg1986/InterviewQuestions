package com.bnp.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest_HashSet_2 {

		public static void main(String ar[])
		{
			Set s = new HashSet();
			s.add("a");
			s.add("b");
			s.add("c");
			s.add("d");
			s.add(new Object());
			s.add(new Integer ("12")); // it accepts number in String, if passing String make sure its number

			for  (Object o :  s)
			System.out.println  (o);

		}
	}
