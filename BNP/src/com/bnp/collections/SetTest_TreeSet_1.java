package com.bnp.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetTest_TreeSet_1 {

	public static void main(String[] args) {

		Set s= new TreeSet();
		s.add("a");
		s.add(new Integer(5)); //ClassCastException because its Integer, initially we past a as String
		s.add(new String("a"));
		s.add(new Object()); // ClassCastException because it is not comparable
		
		System.out.println(s);
	}

}
