package com.bnp.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sunilkumar Gupta
 *
 *
 *class  parent  {     }
class child extends Parent  {    }

List  <parent> list  =  new Arraylist<child>  ( );

Is the syntax right? If not then how to fix it.

 */
class Parent
{
	
}
class Child extends Parent
{
	
}
public class GenericTest {

	public static void main(String ar[])
	{
		//Compile time Error
		//List  <Parent> list  =  new ArrayList<Child>  ( ); 
		
		List<? extends Parent> extendslist  =  new ArrayList<Child>();
		
		List<? super Child> superlist  =  new ArrayList<Parent>();
	}
}



