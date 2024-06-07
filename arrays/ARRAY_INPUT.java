package arrays;

import java.util.Scanner;

public class ARRAY_INPUT {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of an array: ");
		
		int size = sc.nextInt();
		int numbers[] = new int[size];
		
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		//print the numbers in array
		System.out.println("Now printing the array: ");
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]+" ");
		}

		sc.close();
	}

}
