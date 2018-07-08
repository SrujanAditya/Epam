/*
 * @(#)StudentMain.java         08/07/18
 * This file contains studentMain class which is used to fetch the details from csv file
 */
package com.epam.SData;

import java.io.*;
import java.util.*;

/**
 * StudentMain class contains main method which is used to fetch the students data from the file
 * This class also displays a menu for the user and allow his to sort by available parameters
 * @version 1.0.0
 * @author SRUJAN ADITYA DASA
 */

public class StudentMain 
{
	/**
	 * Student List.
	 */
	private ArrayList<Student> StudentList=new ArrayList<Student>();
	/**
	 * This Method is used to load data from the csv file.
	 */
	public void loadCSVData(){
		BufferedReader buffer_reader=new BufferedReader(new FileReader("resources/Student_data.csv"));
		String line = null;	
		while((line = br.readLine()) != null) {
			try {
				StudentList.add(new Student(line.split(",")));
			}
			catch(Exception e) {
				System.err.println("Invalid file");
			}
		}
	}
	/**
	 * This Method is used to display the student list.
	 */
    public void displayStudentList(){
    	System.out.println("ID | First Name | Last Name | Branch | Year");
    	for(Student studentobject:StudentList)
		 {
			  System.out.println(studentobject.getId()+","+studentobject.getFirstName()+","+studentobject.getLastName()+","+studentobject.getBranch()+","+studentobject.getYear());
		 }
    }
    /**
	 * This Method is used to print the student object.
	 */
    public void printStudentList(Student studentobject){
    	System.out.println(studentobject.getId()+","+studentobject.getFirstName()+","+studentobject.getLastName()+","+studentobject.getBranch()+","+studentobject.getYear());
	}
    /**
	 * This Method is used to search the student list based on the search string
	 * @param search_string 
	 * @return resulted student list
	 */
    public ArrayList<Student> searchStudentList(String search_string){
    	ArrayList<Student> resultStudentList = new ArrayList<Student>();
    	for(Student student : StudentList) {
				if ((search_string.equalsIgnoreCase(student.getId()))
									|| (search_string.equalsIgnoreCase(student.getFirstName()))
									|| (search_string.equalsIgnoreCase(student.getLastName()))
									|| (search_string.equalsIgnoreCase(student.getDepartmentName())
								    || (search_string.equalsIgnoreCase(student.getYear())))) {

					resultStudentList.add(student);
				}
		}
		return resultStudentList;
    }
    /**
	 * It's a main method, The program starts from here
	 * @param args it takes command line arguments
	 */
	public static void main( String[] args )
    {
		StudentMain classObj= new StudentMain();
		Scanner sc=new Scanner(System.in);
		classObj.loadCSVData();
		int choice=0;
		do{
			System.out.print("++++MENU++++");
			System.out.println("1.Sort Student List\n2.Search Student\n3.Print Student\n4.EXIT\nEnter your choice:");
			choice=Integer.parseInt(sc.nextLine());
			switch(choice){
				case 1:
					System.out.println("1.Sort by ID\n2.Sort by First Name\n3.Sort by Last Name\n4.Sort by Branch\n5.Sort by Year");
					int sortChoice=Integer.parseInt(sc.nextLine());
					switch(choice){
						case 1:
							Collections.sort(StudentList, new SortById());
							System.out.println("Student List sorted by student ID");
							classObj.displayStudentList();
							break;
						case 2:
							Collections.sort(StudentList, new SortByFirstName());
							System.out.println("Student List sorted by student First Name");
							classObj.displayStudentList();
							break;
						case 3:
							Collections.sort(StudentList, new SortByLastName());
							System.out.println("Student List sorted by student Last Name");
							classObj.displayStudentList();
							break;
						case 4:
							Collections.sort(StudentList, new SortByBranch());
							System.out.println("Student List sorted by student Branch");
							classObj.displayStudentList();
							break;
						case 5:
							Collections.sort(StudentList, new SortByYear());
							System.out.println("Student List sorted by student year");
							classObj.displayStudentList();
							break;
						default:
							System.out.println("Wrong Choice....Try Again!!!!");
					}
					break;
				case 2:
					System.out.println("Enter the string to search:");
					String searchString=sc.nextLine();
					List<Student> resultList=classObj.searchStudentList(searchString);
					for(Student student : resultList)
						classObj.printStudentList(student);
					break;
				case 3:
					classObj.displayStudentList();
					break;
				case 4:		
					System.out.println("Thank you!!!");
					break;
				default:	
					System.out.println("Wrong Choice....Enter a valid number");
			}
		}while(choice!=4);
    }
}
