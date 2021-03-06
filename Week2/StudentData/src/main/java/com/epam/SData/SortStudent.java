/*
 * @(#)SortStudent.java         08/07/18
 * This file contains sorting classes
 */
package com.epam.SData;

/**
 * This file contains all classes which are used to sort the student list based on one tha parameters
 * This classes use Comparator interface to sort the student list 
 * @version 1.0.0
 * @author SRUJAN ADITYA DASA
 */

import java.util.Comparator;
/**
 *This class is used to sort the student list based on student firstname
 */
public class SortByFirstName implements Comparator<Student>{	//Comparator to sort by First Name
	public int compare(Student s1, Student s2) {
		return s1.getFirstName().compareTo(s2.getFirstName());
	}
}
/**
 *This class is used to sort the student list based on student lastname
 */	
public class SortByLastName implements Comparator<Student>{	//Comparator to sort by Last Name
	public int compare(Student s1, Student s2) {
		return s1.getLastName().compareTo(s2.getLastName());
	}
}
/**
 *This class is used to sort the student list based on student branch
 */
public class SortByBranch implements Comparator<Student>{	//Comparator to sort by Branch
	public int compare(Student s1, Student s2) {
		return s1.getDepartmentName().compareTo(s2.getDepartmentName());
	}
}
/**
 *This class is used to sort the student list based on student id
 */
public class SortById implements Comparator<Student>{	//Comparator to sort by Id
	public int compare(Student s1, Student s2) {
		return s1.getId() - s2.getId();
	}
}
/**
 *This class is used to sort the student list based on student year
 */
public class SortByYear implements Comparator<Student>{	//Comparator to sort by Year
	public int compare(Student s1, Student s2) {
		return s1.getYear() - s2.getYear();
	}
}
