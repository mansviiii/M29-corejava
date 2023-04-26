package org.tnsif.secondpackage;
import org.tnsif.firstpackage.*;
public class Executor {

	public static void main(String[] args) {
		Base b =new Base();
		//if any method is default we cannot access into another packge
		b.methodpublic();

	}

}