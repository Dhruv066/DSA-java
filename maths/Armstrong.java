package maths;

import java.util.Scanner;
import java.util.Scanner;

public class Armstrong {

    public void checkArmstrong(int n) {
        int original = n;
        int result = 0;

        int count = (int) Math.log10(n) + 1;

        while (n > 0) {
            int rem = n % 10;
            result += (int) Math.pow(rem, count);
            n = n / 10;
        }

        if (result == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        Armstrong ar = new Armstrong();
        ar.checkArmstrong(n);
    }
}