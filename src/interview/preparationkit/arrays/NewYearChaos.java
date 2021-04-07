package interview.preparationkit.arrays;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * 
 * https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays&h_r=next-challenge&h_v=zen
 * 
*/

public class NewYearChaos {

	static int count = 0;
	
	static void minimumBribes(int[] q) {
		
		count = 0;

		boolean isBribeHappened = false;
		
		for (int i=0; i<q.length; i++) {
			
			if((i+1)!=q[i]) {
				isBribeHappened = true;
				break;
			}
		}
		
		if(isBribeHappened) {
			countMinBribes(q);
		} else {
			System.out.println(0);
		}
		
    }
	
	static void minimumBribes2(int[] q) {
		
		int totalBribes = 0;
	    
	    int expectedFirst = 1;
	    int expectedSecond = 2;
	    int expectedThird = 3;
	    
	    for (int i = 0; i < q.length; ++i) {
	        if (q[i] == expectedFirst) {
	            expectedFirst = expectedSecond;
	            expectedSecond = expectedThird;
	            ++expectedThird;
	        } else if (q[i] == expectedSecond) {
	            ++totalBribes;
	            expectedSecond = expectedThird;
	            ++expectedThird;
	        } else if (q[i] == expectedThird) {
	            totalBribes += 2;
	            ++expectedThird;
	        } else {
	            System.out.println("Too chaotic");
	            return;
	        }
	    }
	    
	    System.out.println(totalBribes);
		
	}

    private static void countMinBribes(int[] q) {
    	
    	for (int i=0; i<q.length; i++) {
    		
    		if((i+1) == q[i])
    			continue;
    			
    		if(validViceVersa(i, q)) {
    			
    			count++;
    			int key = q[i];
    			q[i] = i+1;
    			q[key-1] = key;
    			
    		} else if (validTriangle(i, q)) {
    			
    			count+=2;
    			int key1 = q[i];
    			int key2 = q[key1-1];
    			q[i] = i+1;
    			q[key1-1] = key1;
    			q[key2-1] = key2;
    			
    		} else {
    			
    			System.out.println("Too chaotic");
    			return;
    		}
    	}
    	
    	System.out.println(count);
	}

	private static boolean validTriangle(int i, int[] q) {
		
		int key1 = q[i];
		int value1 = i+1;
		int key2 = q[key1 - 1];

		return q[key2-1] == value1;
	}


	private static boolean validViceVersa(int i,int[] q) {
		
		int key = q[i];
		int value = i+1;
		
		return q[key-1] == value;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int tItr = 0; tItr < t; tItr++) {
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            int[] q = new int[n];
//
//            String[] qItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int qItem = Integer.parseInt(qItems[i]);
//                q[i] = qItem;
//            }
//
//            
//            minimumBribes(q);
//        }

//        int[] q = new int[]{1,2,5,3,7,8,6,4};
////        minimumBribes(q);
//        minimumBribes2(q);
//        
//        
//        Map<String,Integer> result = new HashMap<>();
//        result.put("Alice",0);
//        result.put("Bob",0);
        
       Double x = 0.488888888888;
       DecimalFormat df = new DecimalFormat();
       df.setMaximumFractionDigits(6);
       
       System.out.println((double)3.231736/5.41369);
       System.out.println(String.format("%.6f", (double)3.2/5.0));
       System.out.println(df.format(x));
        scanner.close();
    }
	
}
