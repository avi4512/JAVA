package com.learn.arrays1;

public class BasicArray1 {

	public static void main(String[] args) {
		
		// Syntax:
		// dataType[] arrayName = new dataType[size];
		
		
		//i Declaration of Array
		int[] arr;
		
		// ii. Allocating Memory 
		arr = new int[5];
		
		//iii.adding values
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		//size of the Array
		int arrSize = arr.length;
		System.out.println("Length of the Array: "+arrSize);
		
		// Printing Array
		System.out.println("Array Element At index1 : " + arr[0]);
		System.out.println("Array Element At index2 : " + arr[1]);
		System.out.println("Array Element At index3 : " + arr[2]);
		System.out.println("Array Element At index4 : " + arr[3]);
		System.out.println("Array Element At index5 : " + arr[4]);
		
		

	}

}
