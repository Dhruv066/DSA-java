package maths;

import java.util.Scanner;

public class gcd {
    private static int findGcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
//        cases for handling zero:
        if(a==0 && b==0) return 0;
        if(a==0) return b;
        if(b==0) return a;

        int min = Math.min(a,b);
        int res=1;
        for(int i=2;i<=min;i++){
            if(a%i==0 && b%i==0){
                res = i;
            }
        }
        return res;
    }
    private static int findGcdWithEuclideanAlgorithm(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if (b>a){
            return findGcd(a,b);
        }
        while(b>0){
            int temp=a%b;
            a=b;
            b=temp;
        }return a;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
//        System.out.println(findGcd(a, b));
        System.out.println(findGcd(a,b));
    }
}
