package org1.operations;

public class AssigmentOperation2 {

	public static void main(String[] args) {
		
		/*
		 * =
		 * +=
		 * -=
		 * *=
		 * /=
		 * %=
		 
		 */
		
		int a = 10;
		int b;
		System.out.println("a = b:" + (b = a));
		System.out.println("a += b:" + (a += b));
		System.out.println("a -= b:" + (a -= b));
		System.out.println("a *= b:" + (a *= b));
		System.out.println("a /= b:" + (a /= b));
		System.out.println("a %= b:" + (a %= b));

	}

}
