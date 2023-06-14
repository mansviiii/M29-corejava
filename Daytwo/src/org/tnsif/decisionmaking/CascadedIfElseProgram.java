package org.tnsif.decisionmaking;
import java.util.Scanner;
public class CascadedIfElseProgram {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the three value");
			float percentage1 =s.nextFloat();
			float percentage2 =s.nextFloat();
			float percentage3 =s.nextFloat();
			
			if(percentage1>percentage2 && percentage1>percentage3)
			{
				System.out.println("percentage 1 highest ");
			}
			else if (percentage2>percentage3 && percentage2>percentage1)
			{
				System.out.println("percentage 2 highest ");
			}
			else 
			{
				System.out.println("percentage 3 highest ");
			}
		}
	}

}
