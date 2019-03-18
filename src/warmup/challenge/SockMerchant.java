package warmup.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * Problem-link:https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
*/
public class SockMerchant {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long count = sc.nextLong();
		List<Integer> socks=new ArrayList<>();
		int res=findResult(socks, count);
		System.out.println(res);
	}

	private static int findResult(List<Integer> socks, long count) {
		int res=0;
		for (int i = 0; i < count; i++) {
			int data = sc.nextInt();
			if(socks.contains(data)) {
				++res;
				socks.remove(socks.indexOf(data));
			}else {
				socks.add(data);
			}
		}
		return res;
	}

}
