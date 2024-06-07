package arrays;

public class array_intro {

	public static void main(String[] args) {
		// Arrays in java are like a list of elements of the same type i.e. a list of integers, a list of intergers, a list of booleans etc. 
		
		// Creating Array (method 1)- with new Keyword
		int marks[]=new int[3];
		marks[0]=97;
		marks[1]=98;
		marks[2]=95;
		System.out.println(marks[0] + "and " + marks[1] + " and" +  marks[2]);

		// Creating an Array(method 2)
		int[] marks1= {98,97,95};
		System.out.println(marks1);

	}

}
