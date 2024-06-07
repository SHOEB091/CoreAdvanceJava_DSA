package practice_question;

import java.util.Scanner;

public class average {
	
	public static int averageThree(int a, int b , int c)
	{
      int sum = a+b+c;
	    
	  int average = sum/3;
	  
	  return average;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int a = sc.nextInt();
		System.out.println("Enter the second value: ");
		int b = sc.nextInt();
		System.out.println("Enter the third value: ");
		int c = sc.nextInt();
		
	    int average = averageThree(a,b,c);
	    System.out.println("The average of three is :"+ average);
		
	    sc.close();
	}

}
