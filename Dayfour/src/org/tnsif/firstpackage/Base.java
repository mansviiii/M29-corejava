package org.tnsif.firstpackage;

public class Base {

	/*
	 * declaring all the access specifer with variable and method
	 */
	
	int vardefault =10;
	public String name ="john";
	private int pinno = 2332;
	protected float salary  =3429f;
	
	//access specifer with method
	
	void methoddefault()
	{
		System.out.println("Default access method " +vardefault);
	}

	 public void methodpublic()
	{
		System.out.println("public access method " +name);
	}
	 
	 private void methoddprivate()
		{
			System.out.println("private access method " +pinno);
		}

	 protected void methodprotected()
		{
			System.out.println("protected access method " +salary);
		}
}
