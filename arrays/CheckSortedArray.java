package arrays;

import java.util.Scanner;

public class CheckSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array\n");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements of an array\n");
		
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean isAscending =true;
		
		for(int i=0;i<size-1;i++)//size -1 as termination condition 
		{
			if(arr[i]>arr[i+1])//condition for descending order
			{
				isAscending = false;
			}
		}
		if(isAscending)
		{
			System.out.println("The array is orted in ascending order");
			
		}
		else
		{
			System.out.println("the array is non sorted in ascending order 0");
		}
		
		
		
		sc.close();
	}

}
