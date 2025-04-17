package org1.operations;

public class instanceofOperation8 {

	public static void main(String[] args) {
		
		// it only works on Objects
		// Not on Primitive type
		
		Integer num = 10;
		String str = "Hello";
		System.out.println(num instanceof Integer);
		System.out.println(str instanceof String);
		
		
		//System.out.println(num instanceof instanceofOperation8);
		// This may get error due the reason of "num" is a Primitive type
	}

}
