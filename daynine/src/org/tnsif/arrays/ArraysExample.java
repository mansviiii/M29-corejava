//Program to demonstrate on simple array program
package org.tnsif.arrays;
import java.util.Scanner;
public class ArraysExample {

	public static void main(String[] args) {
		System.out.println("Enter the number of elemnts");
		Scanner s= new Scanner(System.in);
		int num =s.nextInt ();
		//array declaration
		int arr[]= new int[num];
		//array initialization
		for(int i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		//for printing the array elements
		for(int itr:arr)
		{
			System.out.println("Array elements are: " +itr+ " ");
		}

	}

}