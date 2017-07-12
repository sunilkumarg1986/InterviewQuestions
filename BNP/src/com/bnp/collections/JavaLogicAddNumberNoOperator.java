package com.bnp.collections;

public class JavaLogicAddNumberNoOperator {

	public static void main(String[] args) {

		System.out.println(add(5,7));
		
	}

	public static int add(int a,int b)
	{
		if(a==0) return b;
		if(b==0)return a;
		
		int sum=a^b;//XOR retuns sum of two numbers make numbers are different else if will get subtracted.,if
		int carry=(a & b)<< 1;
		return add(sum, carry);
	}
}
