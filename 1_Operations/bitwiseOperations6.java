package org1.operations;


public class bitwiseOperations6 {

	public static void main(String[] args) {
		
		/*
		 * &
		 * |
		 * ~ 
		 * >>
		 * <<
		 * >>>
		 * 
		 */
		
		int x = 10;   // --> 1010
		int y = 11;   // --> 1011
		
		// Converting Decimal to Binary
		String binary_x = Integer.toBinaryString(x);  // --> 1010
		String binary_y = Integer.toBinaryString(y);  // --> 1011
		
		System.out.println("Binary of X: " +(binary_x));
		System.out.println("Binary of Y: " +(binary_y));
		
		System.out.println(("x & y: ") + (x & y));
		System.out.println(("x | y: ") + (x | y));
		System.out.println(("~x: ") + (~x));
		System.out.println(("x >> 2: ") + (x >> 2));
		System.out.println(("x << 2: ") + (x << 2));
		System.out.println(("x >>> 1: ") + ( x >>> 1));
		
		
		
		System.out.println();
		
		

	}

}
