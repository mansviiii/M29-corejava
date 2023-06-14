//Program to demonstrate on Array class
package org.tnsif.arrays;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		//array initialization
		int array[] = {12,67,54,90,87};
		//using arrays class we pint all the element
		System.out.println(Arrays.toString(array));
		//Sorting the array
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}

}