package maths;

import java.util.Scanner;

public class BaseConversion {

    static int getDigit(char ch) {
        switch (ch) {
            case 'A': return 10;
            case 'B': return 11;
            case 'C': return 12;
            case 'D': return 13;
            case 'E': return 14;
            case 'F': return 15;
            default: return ch - '0';
        }
    }

    static void convertToDecimal(String s, int n) {
        int res = 0;
        int pos = 0;
        int len = s.length();

        for (int i = len - 1; i >= 0; i--) {
            int digit = getDigit(s.charAt(i));

            System.out.println(digit);

            res += digit * (int) Math.pow(n, pos);
            pos++;
        }

        System.out.print("Converted number is : " + res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String a = sc.nextLine();

        System.out.print("Enter the base of the number: ");
        int b = sc.nextInt();

        convertToDecimal(a, b);
    }
}