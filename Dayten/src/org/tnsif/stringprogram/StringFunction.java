package org.tnsif.stringprogram;

import java.util.Scanner;

public class StringFunction {

	public static void main(String[] args) {
		String str1 ="sandhya";
		System.out.println(" using string literal :-"+str1);
		
		Scanner s= new Scanner (System.in);
		String str4 =new String(s.nextLine());
		
		if(str1.equals(str4))
		{
			System.out.println("string equal");
		}
		else
		{
			System.out.println("not equl");
		}
		

	}

}