package org1.operations;

public class logicalOperation4 {

	public static void main(String[] args) {
		
		/*
		 * AND (&&)
		 * OR  (||)
		 * NOT (!)
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println((num1 < num2 )&& (num2 > num1));
		System.out.println((num1 > num2) || (num2 > num1));
		System.out.println(!(num1 == num2));
		
		

	}

}
