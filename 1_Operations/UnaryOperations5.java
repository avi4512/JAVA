package org1.operations;

public class UnaryOperations5 {

	public static void main(String[] args) {
		
		/*
		 * +
		 * -
		 * ++
		 * --
		 * !
		 */
		int x = 5;
		
		System.out.println("+x "+ (+x));
		System.out.println("-x " + (-x));
		System.out.println("++x " +(++x));
		System.out.println("x++" + (x++));
		System.out.println("x-- " + (x--));
		System.out.println("--x " + (--x));
		System.out.println("!true " +(!true));

	}

}
