package org.tnsif.collection;

import java.util.Comparator;

public class StudentSortByName implements Comparator<CollegeStudent> {

	@Override
	public int compare(CollegeStudent o1, CollegeStudent o2) {
		return o1.getName().compareTo(o2.getName());

	}
}