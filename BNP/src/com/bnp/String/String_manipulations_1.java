package com.bnp.String;

public class String_manipulations_1 {

	public static void main(String[] args) {

		String a= "hi5";
		String b="hi" + "5";
		String c="12345" ;
		String d="hi" + c.length ; // it should be length()

		System.out.println(a==b);
		System.out.println(a==d);
	}
}
