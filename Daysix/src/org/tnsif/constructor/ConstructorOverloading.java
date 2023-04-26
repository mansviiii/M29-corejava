package org.tnsif.constructor;


public class ConstructorOverloading {
	private static int x;
	private static int y;

	
	//construtor overloading
	public ConstructorOverloading()

	{
		System.out.println("Default construtor ");
	}
	
	public ConstructorOverloading(int x )

	{
		System.out.println("parameteized construtor "+x);
	}
	
	public ConstructorOverloading(int x ,int y)

	{
		System.out.println("parameteized construtor "+x+" "+y);
	}
	
	public static void main1(String[] args) {
	}
	
}