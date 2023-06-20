//program to demonstrate Synchronization
package org.tnsif.synchorization;
//driver class
public class SynchorizationExample {

	public static void main(String[] args) {
		Power p=new Power();
		ThreadOne t1=new ThreadOne(p);
		ThreadTwo t2=new ThreadTwo(p);
		t1.start();
		t2.start();
	}

}