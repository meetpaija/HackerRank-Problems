package warmup.challenge;

/*
 * problem link : https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingValley {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		long size = sc.nextLong();
		int res=countValley(size);
		System.out.println(res);
	}

	private static int countValley(long size) {
		int countOfValley=0;
		int currentHeight=0;
		String in = sc.next();
		for (int i = 0; i < in.length(); i++) {
			if(in.charAt(i)=='U'){
				++currentHeight;
				if(currentHeight==0){
					++countOfValley;
				}
			}else{
				--currentHeight;
			}
		}
		return countOfValley;
	}
}
