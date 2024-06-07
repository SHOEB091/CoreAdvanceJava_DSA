package practice_question;

import java.util.Scanner;

public class FIBONACCI_SERIES {

	public static int printFIBONACCI(int n)
	{
		int t1=0;
		int t2=1;
		for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
		return t2;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number To find fibonacci series: ");
		int n = sc.nextInt();
		
		int t2 = printFIBONACCI(n);
		
		 System.out.println("First " + t2 + " terms of fibonnaci series: ");
		
		sc.close();
	}

}
