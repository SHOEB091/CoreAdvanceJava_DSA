package arrays;

public class ARRAY1 {

	public static void main(String[] args) {
		
		// array = used to strore multiple values in a single variable
		
		String[] cars = new String[3];
		// array declaration 
		cars[0]="Camaro";
		cars[1]="Corvette";
		cars[2]="Tesla";
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
	}

}
