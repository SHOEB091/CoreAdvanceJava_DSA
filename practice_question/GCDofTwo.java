package practice_question;

import java.util.Scanner;

public class GCDofTwo {
	// GCD formula = (n1*n2)/lcm of n1 and n2
	public static int gcdCalc(int n1, int n2)
	{
		int gcd = 1;
		for(int i=1;i<=n1&&i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
				gcd=i;
			
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1= sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int n2= sc.nextInt();
		
		int gcd = gcdCalc(n1,n2);
		
		System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
		
		sc.close();
	}

}
