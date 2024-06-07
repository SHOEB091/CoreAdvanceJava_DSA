package arrays;

public class MissingNumber {

    public static int SearchNumber(int []arr)
    {
        int sumArr =0;
        for(int i=0;i<arr.length;i++)
        {
            sumArr+=arr[i];
        }
        int n = arr.length;
        int sumOfNumber = (n*(n+1)/2);

        return sumOfNumber-sumArr;
    }

    public static void main(String[] args) {
        int []arr={0,1,2,3,5};
        int ans =SearchNumber(arr);
        System.out.println(ans);
    }


}
