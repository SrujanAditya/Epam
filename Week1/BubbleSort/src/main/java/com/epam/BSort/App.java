package com.epam.BSort;

import java.util.*;
/**
 * Bubble Sort
 *
 */
public class App 
{
	int sizeOfArray;
	int[] inputNumbers;
	App(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of array Numbers to be sorted:");
		sizeOfArray=sc.nextInt();
		inputNumbers=new int[sizeOfArray];
		System.out.println("Enter the numbers:");
		for(int i=0;i<sizeOfArray;i++)
			inputNumbers[i]=sc.nextInt();
		
	}
	public void bubbleSort(){
		int temp=0;
		for(int i=0;i<sizeOfArray;i++){
			for(int j=i+1;j<sizeOfArray;j++){
				if(inputNumbers[i]>inputNumbers[j]){
					temp=inputNumbers[i];
					inputNumbers[i]=inputNumbers[j];
					inputNumbers[j]=temp;
				}
			}
		}
	}
	public void display(){
		for(int i=0;i<sizeOfArray;i++)
			System.out.print(inputNumbers[i]+" ");
	}
    public static void main( String[] args )
    {
		App obj=new App();
		obj.bubbleSort();
		System.out.println("Sorted Order:");
		obj.display();
    }
}