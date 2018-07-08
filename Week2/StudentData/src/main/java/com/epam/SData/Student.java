/*
 * @(#)Student.java         08/07/18
 * This file contains student class
 */

package com.epam.SData;

/**
 * Student class contains student properties which are private.
 * all setter and getter methods are defined.
 * We can access the student properties using setter and getter methods only.
 * @version 1.0.0
 * @author SRUJAN ADITYA DASA
 */
public class Student {
	/**
	 * Student id.
	 */
	private String id;
	/**
	 * Student first name
	 */
	private String firstName;
	/**
	 * Student last name
	 */
	private String lastName;
	/**
	 * Student department name
	 */
	private String departmentName;
	/**
	 * Student year, Class of the student
	 */
	private String year;
	/**
	 * This constructor used to initialize the student parameters.
	 * @param id  student id
	 * @param firstName student first name
	 * @param lastName student last name
	 * @param departmentName student department name
	 */
	public Student(String id, String firstName, String lastName, String departmentName, String year) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
		this.year = year;
	}
	/**
	 * @return id student id
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * sets student id.
	 * @param student id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return firstName of the student
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * sets firstName of the student.
	 * @param student first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return lastName of the student
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * sets LastName of the student.
	 * @param lastName student last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return Department Name of student
	 */
	public String getDepartmentName() {
		return this.departmentName;
	}
	/**
	 * sets DepartmentName of the student.
	 * @param departmentName of the student
	 */
	public void setDepartment(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return student year
	 */
	public String getYear() {
		return this.year;
	}
	/**
	 * sets year of the student.
	 * @param year student class
	 */
	public void setYear(String year) {
		this.year = year;
	}
}