package com.epam.Sort;
import java.util.*;
/**
 * Quick Sort!
 *
 */
public class QuickSort 
{
	int sizeOfArray;
	int[] inputNumbers;
	/*
	Method Name: getInput
	Used to get input from the user
	*/
	public void getInput(){
		//try(Scanner sc=new Scanner(System.in)){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no. of array Numbers to be sorted:");
			sizeOfArray=sc.nextInt();
			inputNumbers=new int[sizeOfArray];
			System.out.println("Enter the numbers:");
			for(int i=0;i<sizeOfArray;i++)
				inputNumbers[i]=sc.nextInt();
		//}
	}
	/*
	Method Name: quickSort
	Used to sort the array elements using quick sort
	*/
	public void quickSort(int start,int end){
		if(start<end){
			int pivot=split(start,end);
			quickSort(start,pivot-1);
			quickSort(pivot+1,end);
		}
	}
	/*
	Method Name: split
	Used to split the array elements
	*/
	public int split(int start,int end){
		int temp=0;
		int pivot=inputNumbers[end];
		int index=start;
        for(int i=start;i<end;i++)
		{
				if(inputNumbers[i]<=pivot)
				{
					swapNumbers(i,index);
					index++;
				}
		}
		swapNumbers(end,index);
		return index;
	}
	/*
	Method Name: seapNumbers
	Used to swap two different elements in an array
	*/
	public void swapNumbers(int i,int j){
		int temp=0;
		temp=inputNumbers[i];
		inputNumbers[i]=inputNumbers[j];
		inputNumbers[j]=temp;
	}
	/*
	Method Name: display
	Used to display the array elements
	*/
	public void display(){
		for(int i=0;i<sizeOfArray;i++)
			System.out.print(inputNumbers[i]+" ");
	}
	/*
	Main Method
	*/
    public static void main( String[] args )
    {
        QuickSort obj=new QuickSort();
		obj.getInput();
		obj.quickSort(0,obj.sizeOfArray-1);
		System.out.println("Sorted Order:");
		obj.display();
    }
}
