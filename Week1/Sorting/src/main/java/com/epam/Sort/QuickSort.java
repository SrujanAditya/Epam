package com.epam.QSort;
import java.util.*;
/**
 * Quick Sort!
 *
 */
public class QuickSort 
{
	int sizeOfArray;
	int[] inputNumbers;
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
	public void quickSort(int start,int end){
		if(start<end){
			int pivot=split(start,end);
			quickSort(start,pivot-1);
			quickSort(pivot+1,end);
		}
	}
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
	public void swapNumbers(int i,int j){
		int temp=0;
		temp=inputNumbers[i];
		inputNumbers[i]=inputNumbers[j];
		inputNumbers[j]=temp;
	}
	public void display(){
		for(int i=0;i<sizeOfArray;i++)
			System.out.print(inputNumbers[i]+" ");
	}
    public static void main( String[] args )
    {
        QuickSort obj=new QuickSort();
	obj.getInput();
		obj.quickSort(0,obj.sizeOfArray-1);
		System.out.println("Sorted Order:");
		obj.display();
    }
}
