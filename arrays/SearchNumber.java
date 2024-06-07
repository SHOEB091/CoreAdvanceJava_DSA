package arrays;

import java.util.Scanner;

public class SearchNumber {
//option +command +y to toggle word wrap
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter the size of an array\n");
		int size= sc.nextInt();
		
		System.out.println("Enter the elements in an array\n");
		
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the numebr which you want to      search in the array\n");
		x=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]==x)
			{
				System.out.println(x+" found at index:"+i);
			}
		}
		
		
		
		sc.close();
	}

}
