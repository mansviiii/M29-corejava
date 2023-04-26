package org.tnsif.firstpackage;

public class AssessExecutor {

	public static void main(String[] args) {
		Base b=new Base();
		b.methoddefault();
		b.methodpublic();
		b.methodprotected();
		/*
		 * b.methodprivte does not access bcoz of privte specifer
		 */
	
	//System.out.println(b  instaceof Base );

	}

}