package com.epam.MSort;
import java.util.*;
/**
 * Merge Sort!
 *
 */
public class MergeSort 
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
	Method Name: mergeSort
	Used to sort the array elements using merge sort
	*/
	public void mergeSort(int start,int end){
		if(start<end){
			int middle=(start+end)/2;
			System.out.println(start+" "+middle+" "+end);
			mergeSort(start,middle);
			mergeSort(middle+1,end);
			merge(start,middle,end);
		}
	}
	/*
	Method Name: merge
	Used to merge two parts of an array in a sorting order
	*/
	public void merge(int start,int middle,int end){
		int i,j;
		int l1 = middle-start + 1;
    	int l2 = end-middle;
    	int[] left=new int[l1+1];
    	int[] right = new int[l2+1];
		
		int k=start;
		for(i = 0; i < l1; i++)
    		left[i] = inputNumbers[k++];
		left[i]=Integer.MAX_VALUE;
    	for(i = 0; i < l2; i++)
    		right[i] = inputNumbers[k++];
		right[i]=Integer.MAX_VALUE;
    	
		i=0;j=0;
		for(k=start;k<=end;k++){
			if(left[i]<=right[j])
				inputNumbers[k]=left[i++];
			else
				inputNumbers[k]=right[j++];
		}
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
        MergeSort obj=new MergeSort ();
		obj.getInput();
		obj.mergeSort(0,obj.sizeOfArray-1);
		System.out.println("Sorted Order:");
		obj.display();
    }
}
