package practice_question;

import java.util.Scanner;

public class sum_allOddNumber {

	
	public static int sumOddNumber(int n)
	{
		int sum=0;
		for(int i=1;i<n;i+=2)
		{
			sum=sum+i;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter The Value Of N");
	       int n=sc.nextInt();
	       System.out.println("The N Odd Numbers: ");
	       
	       int sum = sumOddNumber(n);
	       System.out.println("The sum of Odd number form 1 to n is: "+ sum);
	       
	       sc.close();
	}

}
