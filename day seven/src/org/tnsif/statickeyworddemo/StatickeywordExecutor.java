//Driver class
//Program to demonstrate on static variable
package org.tnsif.statickeyworddemo;

public class StatickeywordExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Employee.companyName);
		
		Employee e=new Employee (101, "Abhinav R");
		System.out.println(e);
		
		Employee e1=new Employee(102, "Parag G");
		System.out.println(e1);
		
		//without creating the object we can call to static method
		Customer.display();
		Customer c=new Customer();
		System.out.println(c);
	}

}