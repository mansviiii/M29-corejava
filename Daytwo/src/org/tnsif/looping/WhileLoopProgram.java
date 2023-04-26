package org.tnsif.looping;
import java.util.Scanner;
public class WhileLoopProgram {

	public static void main(String[] args) {
		// print 1 to n
		int i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value of N: ");
		int N=s.nextInt();
		while(i<=N)
		{
			System.out.println(i+" ");
			i++;
		}

	}

}