package problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxValue {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {

    	System.out.println(arr);
    	
    	Arrays.sort(arr);
    	System.out.print(arr[0] + arr[1] + arr[2] + arr[3]);
    	System.out.print(" ");
    	System.out.print(arr[1] + arr[2] + arr[3] + arr[4]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
