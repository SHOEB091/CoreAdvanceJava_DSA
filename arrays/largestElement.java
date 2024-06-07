package arrays;
import java.util.*;

public class largestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in an array");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = searchLargest(arr); // Call the method and store the result
        System.out.println("The largest element in the array is: " + largest);
    }

    // Corrected the parameter name to 'largest'
    public static int searchLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
