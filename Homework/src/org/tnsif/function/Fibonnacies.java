/*Write a program to find the nth term in the Fibonacci series using recursion.
Note that the first 2 terms in the Fibonacci Series are 0 and 1.
0,1,1,2,3,5,8,....*/
package org.tnsif.function;

public class Fibonnacies {

	
			static int fib(int n)
			{
				if(n==0|| n==1)
					return 0;
				else if(n==2)
					return 1;
				return fib(n-1) + fib(n-2);
			}

		 public static void main(String[] args) {
			int n= 9;
			System.out.println(fib(n));

			}
	}