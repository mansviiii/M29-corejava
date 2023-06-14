//Program to demonstrate on Array object class
package org.tnsif.arrays;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Customer[] arr =new Customer[2];
		
		arr[0]=new Customer(2455,"Vaishnavi");
		arr[1]=new Customer(5884,"Neha");
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getId()+" "+arr[i].getName());
		}

	}

}