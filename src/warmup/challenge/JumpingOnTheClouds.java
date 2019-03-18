package warmup.challenge;

import java.util.Scanner;

/*
Problem link : https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
 */

public class JumpingOnTheClouds {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        long count = sc.nextLong();
        int res=findResult(count);
        System.out.println(res);
    }

    private static int findResult(long count) {
        int res = 0;
        int nums[] = new int[(int) count];
        for (int i = 0; i < count; i++) {
            nums[i]=sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            if (nums[i] == 0) {
                int j = i + 2;
                if (j < count && nums[j] == 0) {
                    ++res;
                    ++i;
                } else {
                    j=i+1;
                    if(j<count && nums[j]==0){
                        ++res;
                    }
                }
            }
        }
        return res;
    }
}
