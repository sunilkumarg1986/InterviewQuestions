package com.bnp.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class List_Remove_Duplicate {

	public static void main(String[] args) {
		List     l  =  new  ArrayList  ();
		l.add ("a");
		l.add ("b");
		l.add ("e");
		l.add ("a");

		LinkedHashSet s=new LinkedHashSet(l);
		
		System.out.println(s);
	}

}
