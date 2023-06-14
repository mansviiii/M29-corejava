//program to demonstrate on abstract class and abstract method
package org.tnsif.abstractkeyworddemo;
 
/*if any class contains atleast one abstract method then that class 
 * must be declare as an abstract class
 */

public abstract class Remote {
	public String cellName;

	//abstract method
	
	abstract void functionremote();
	abstract void create();
	//concrete method
	void display()
	{
		System.out.println("Cell Name is: "+cellName);
	}
}
//implementable class 
abstract class RemoteChild extends Remote
{
	 @override
	void functionRemote() {
		System.out.println("Abstract method is implemented");
	}
	void create() {
		System.out.println("Abstract method -2");
	}
}