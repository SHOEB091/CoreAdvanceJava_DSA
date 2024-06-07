package arrays;

import java.util.Scanner;

public class ARRAY_INPUT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner( System.in);
		
		System.out.println("Enter the size of the array \n");
		int size=sc.nextInt();
		
		System.out.println("enter the values in array \n");
		
		int number[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			number[i]=sc.nextInt();
		}
		//print the number in array
		System.out.println("displaying the array elements \n");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(number[i]+" ");
		}
		
		
		sc.close();
	}

}
