package interview.preparationkit.arrays;

/*
 * 
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 * 
 * 
*/
import java.io.IOException;
import java.util.Scanner;


public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	
    	if (d==0) {
    		return a;
    	}
    	
    	if (a.length==0 || a.length==1) {
    		return a;
    	}
    	
    	if (a.length == d) {
    		return a;
    	}
    	
    	boolean isToRotateLeft = true;
    	
    	if (a.length-d < d) {
    		isToRotateLeft = false;
    	} else if (a.length-d == d){
    		return splitFromMid(a);
    	}
    	
		return isToRotateLeft ? rotateLeft(a, d) : rotateRight(a, a.length-d);
    }

    private static int[] splitFromMid(int[] a) {
    	
    	int newA[] = new int[a.length];
    	int midPos = (a.length)/2;
    	
    	for (int i=0; i< midPos; i++) {
    		newA[i] = a[midPos+i];
    		newA[midPos + i] = a[i];
    	}
    	
		return newA;
	}

	private static int[] rotateRight(int[] a, int d) {
		
    	int newA[] = new int[a.length]; 
    	
    	while (d!=0) {
    		
    		for (int i=0; i<a.length; i++) {
    			if (i != 0) {
    				newA[i] = a[i-1];
    			} else {
    				newA[i] = a[a.length-1];
    			}
    		}
    		
    		for (int i=0; i<a.length; i++) 
                a[i] = newA[i];
    		
    		--d;
    	}
    	
		return a;
	}

	private static int[] rotateLeft(int[] a, int d) {
    	
    	int newA[] = new int[a.length]; 
    	
    	while (d!=0) {
    		
    		for (int i=0; i<a.length; i++) {
    			if (i != a.length-1) {
    				newA[i] = a[i+1];
    			} else {
    				newA[i] = a[0];
    			}
    		}
    		
    		for (int i=0; i<a.length; i++) 
                a[i] = newA[i];
    		
    		--d;
    	}
    	
		return a;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

    	
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        

        int[] result = rotLeft(a, d);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}
