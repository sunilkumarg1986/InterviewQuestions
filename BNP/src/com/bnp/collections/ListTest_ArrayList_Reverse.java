package com.bnp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ListTest_ArrayList_Reverse {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		   
	    //Add elements to ArrayList object
	    aList.add("1");
	    aList.add("2");
	    aList.add("3");
	    aList.add("4");
	    aList.add("5");
	    
	    Collections.reverse(aList);
	    
	    	System.out.println(aList);
	}

}
