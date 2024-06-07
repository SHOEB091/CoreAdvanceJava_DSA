package practice_question;

import java.util.Scanner;

public class POWER_OF_ANOTHER {

	public static int powerOfAnother(int a, int b)
	{
		int power = 1;
		for(int i=0;i<b;i++)
		{
			power=power*a;
		}
		return power;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		
		int power = powerOfAnother(a,b);
		
		System.out.println(power);
		
		sc.close();
	}

}
