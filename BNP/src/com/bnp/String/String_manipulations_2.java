package com.bnp.String;

public class String_manipulations_2 {

	public static void main(String[] args) {

		String a= "hi5";
		String b="hi" + "5";
		String c="12345" ;
		String d="hi" + c.length() ; 

		System.out.println(a==b); //returns true because of String pool and literals
		System.out.println(a==d); //returns false because c.lenght() returns number not String and not in String pool
	}
}
