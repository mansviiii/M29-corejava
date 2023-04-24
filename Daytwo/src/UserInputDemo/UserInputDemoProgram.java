package UserInputDemo;
import java.util.Scanner;

public class UserInputDemoProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		float salary = s.nextFloat();
		
		
		System.out.println("Enter your n: ");
		String name = s.next();
		s.nextLine();
		
		System.out.println("Enter your Name1: ");
		String name1 = s.nextLine();
		
		System.out.println("Enter your Character: ");
		char ch = s.next().charAt(0);
		
		System.out.println("Salary is: "+salary);
		System.out.println("Name is: "+name);
		System.out.println("Name2 is: "+name1);
		System.out.println("Character is: "+ch);
		
		s.close();
		
	}

}