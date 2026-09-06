package maths;

import java.util.Scanner;

public class DigitManupulation {
    static int addDigits(int num,int digit) {
        if (num<0) {
            return (num*-1)*10+digit;
        }else  {
            return num*10+digit;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        System.out.println("Enter the digit which you want to add :");
        int digit = sc.nextInt();
        System.out.println(addDigits(num,digit));
    }
}
