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
    private static char getChar(int r){
        switch (r){
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
            default:
                return (char)(r+'0');
        }
    }
static void convertFromDecimal(int  s, int n) {
        StringBuilder res = new StringBuilder();
    while(s>0){
        int r = s % n;
        char ch = getChar(r);
        res.append(ch);
        s = s/n;
    }
    System.out.println("Converted number is : " + res.reverse());
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        String a = sc.nextLine();
        System.out.println("Enter the number :");
        int  n = sc.nextInt();

        System.out.print("Enter the base of the number: ");
        int b = sc.nextInt();

//        convertToDecimal(a, b);
        convertFromDecimal(n,b);
    }
}