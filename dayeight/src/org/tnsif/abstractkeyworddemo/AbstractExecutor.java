package org.tnsif.abstractkeyworddemo;

public class AbstractExecutor {

	public static void main (String[] args) {
		//Remote r=new Remote();
		
		Remote r1 =new RemoteChild();
		r1.cellName="Durocell";
		r1.display();
		r1.functionremote();
		r1.create();
		RemoteChild r=new RemoteChild();
		r.cellName="Durocell";
		r.display();
		r.functionremote();
		r.create();
	}
}
