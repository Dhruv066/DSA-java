package maths;

import java.util.Scanner;

public class Lcm {
    private static int findLcm(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);


        return (a*b)/gcd.findGcdWithEuclideanAlgorithm(a,b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Lcm lcm = new Lcm();
        int res = lcm.findLcm(a,b);
        System.out.println(res);
    }
}
