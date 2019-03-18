package warmup.challenge;

import java.util.Scanner;

public class RepeatedString {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        String str=sc.nextLine();
        long loopNum=sc.nextLong();
        long res= findResult(str, loopNum);
        System.out.println(res);
    }

    private static long findResult(String str, long loopNum) {
        long res=0;
        int strLen=str.length();
        if(strLen>loopNum){
            for(int i=0;i<loopNum;i++){
                if(str.charAt(i)=='a'){
                    ++res;
                }
            }
        } else{
            int asInStr=0;
            for (int i=0;i<strLen;i++){
                if(str.charAt(i)=='a'){
                    ++asInStr;
                }
            }
            long fullLenStrNum=loopNum/strLen;
            res=fullLenStrNum*asInStr;
            long remainingLen=loopNum-fullLenStrNum*strLen;
            for (int i=0;i<remainingLen;i++){
                if(str.charAt(i)=='a'){
                    ++res;
                }
            }
        }
        return res;
    }
}
