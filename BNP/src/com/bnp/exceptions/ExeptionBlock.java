package com.bnp.exceptions;

public class ExeptionBlock {
	public static void main(String amgs[]) {
		try {
			badMethod();
			System.out.println("A");
		} 
		catch (RuntimeException re) 
		{
			System.out.println("B");
		} 
		catch (Exception e) 
		{
			System.out.println("C");
		} 
		finally 
		{
			System.out.println("d");
		}
		System.out.println("e");
	}
	//use throws if throwing checked Exception.
	private static void badMethod() throws Exception {
		throw new Exception();

	}

}
