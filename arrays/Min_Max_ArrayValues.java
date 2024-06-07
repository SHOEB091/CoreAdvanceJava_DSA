package arrays;

import java.util.Scanner;

public class Min_Max_ArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of an array \n");
		int size = sc.nextInt();
		
		System.out.println("Enter the numbers in array \n");
		int number[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			number[i]=sc.nextInt();
		}
		int max= Integer.MIN_VALUE;
		int min= Integer.MAX_VALUE;
		
		for(int i=0;i<size;i++)
		{
			if(number[i]<min)
			{
				min=number[i];
			}
			if(number[i]>max)
			{
				max = number[i];
			}
		}
		System.out.println("Largest number is : " + max);
		System.out.println("Smallest number is : " + min);
		
		sc.close();
	}

}
