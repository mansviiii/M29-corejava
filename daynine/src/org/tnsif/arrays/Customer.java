//Customer entity
package org.tnsif.arrays;
public class Customer {
	//Private data members
	private int Id;
	private String Name;
	//Constructor
	public Customer(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	//getters and setters
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}