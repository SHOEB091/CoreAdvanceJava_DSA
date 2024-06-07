package arrays;

import java.util.Scanner;

public class Array_NAMEinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the sieze of an array\n");
		int size=sc.nextInt();
		
		System.out.println("Enter the name \n");
		String name[]=new String[size];
		
		for(int i=0;i<size;i++)
		{
			name[i]=sc.next();
		}
		
		System.out.println("Displaying the names\n");
		for(int i=0;i<name.length;i++)
		{
			System.out.println("name "+(i+1)+" is : "+ name[i]);
		}
	
		
		sc.close();

	}

}
