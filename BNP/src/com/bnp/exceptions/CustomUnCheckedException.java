package com.bnp.exceptions;

/**
 * 
 * @author Sunilkumar Gupta
 *6)Write the class structure definition of custom class which is an unchecked exception.
Assume class name as BusinessException.

 */
public class CustomUnCheckedException extends RuntimeException {

	public CustomUnCheckedException(String e) {
		super(e);
	}
}
