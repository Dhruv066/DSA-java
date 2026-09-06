package maths;

import java.util.Scanner;


public class countDigits {
    static long   countDigitsOfNum(long n){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return Math.toIntExact(-1 * n);
        }else {
            return (long)Math.log10(n)+1;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long n = sc.nextInt();
        System.out.println(countDigitsOfNum(n));
    }
}

