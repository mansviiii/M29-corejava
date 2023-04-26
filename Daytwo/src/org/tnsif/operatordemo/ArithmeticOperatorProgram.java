package org.tnsif.operatordemo;
import java.util.Scanner;
public class ArithmeticOperatorProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("The addition of x and y is : "+(x+y));
		System.out.println("The Substraction of x and y is : "+(x-y));
		System.out.println("The multiplication of x and y is : "+(x*y));
		System.out.println("The division of x and y is : "+(x/y));

	}

}