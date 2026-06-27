package if_else;

import java.util.Scanner;

public class ternaryNestedIfElse {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("1st number: ");
        int a =sc.nextInt();
        System.out.println("2st number: ");
        int b =sc.nextInt();
        System.out.println("3st number: ");
        int c =sc.nextInt();
        System.out.println((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c)+" is the maximum.");
    }
}
