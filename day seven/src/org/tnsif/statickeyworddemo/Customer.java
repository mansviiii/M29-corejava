//program to demonstrate on static block and static method
package org.tnsif.statickeyworddemo;
public class Customer {

	//non-static data member
	private int custId;
	//static data member
	private static String companyName;
	
	//static block
	//static block is used to initialize static variable only
	static
	{
		//we can not use non static variable inside the static block
		companyName="Myntra";
		
	}

	public Customer() {
		System.out.println("Default constructor");
		custId++;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + " companyName="+companyName+"]";
	}

	static void display()
	{
		System.out.println(" Company Name: " +companyName);
	}
	
	
	
	
}