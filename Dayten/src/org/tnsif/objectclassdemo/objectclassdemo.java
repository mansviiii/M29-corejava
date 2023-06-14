package org.tnsif.objectclassdemo;

class sample
{
	
}
class Demo
{
	Demo()
	
	{
		//resourse allocate
		System.out.println("Demo constructor");
	}
	
	protected void finalize()
	{
		System.out.println("in finalize method");
	}
}


public class objectclassdemo {

	public static void main(String[] args) {
		sample s =new sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		
		Demo d =new Demo ();
		System.out.println(d.getClass());
		System.out.println(d.hashCode());
		
		//the object class is used ehen u want to refer any object whose data typr youdont know
		
		Object ob =new Object();
		System.out.println(ob.getClass());
		System.out.println(ob.hashCode());
		
		
	}

}