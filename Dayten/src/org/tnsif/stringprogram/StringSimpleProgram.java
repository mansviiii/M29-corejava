//program to demonstrate onstring literral and using new keyword 
package org.tnsif.stringprogram;

import java.util.Scanner;

public class StringSimpleProgram {

	public static void main(String[] args) {
		//using string literal
		String str1 ="sandhya";
		System.out.println(" using string literal :-"+str1);
		
		//using new keyword
		String str2 =new String("khamgal");
		System.out.println(" using new keyword :-"+str2);
		
		/* when the string is created by using new keyword and both 
		 * both the string are same it will create a memory for that string
		 * and hence using == we will get it as different (false)
		 */
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		String str3 ="sandhya";
		System.out.println(" using string literal :-"+str3);
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
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