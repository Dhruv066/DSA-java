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
    static int addDigitsAtfront(int num,int digit) {
        int count = 0;
        boolean isNegative=false;


        if (num<0) {
            num=-1*num;
            isNegative=true;

        }
        count=(int)Math.log10(num)+1;

        int res = digit *(int) Math.pow(10,count)+num;
        if (isNegative){
            return -1*res;
        }
        return res;
    }
    static int reverseNum(int num) {
        boolean isNegative=false;
        if (num<0) {
             num=-1*num;
             isNegative=true;
         }
        int res=0;
        while(num>0){
            int d=num%10;
            res= res*10+d;
            num=num/10;

        }
    if (isNegative){
        return -1*res;
    }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
//        System.out.println("Enter the digit which you want to add :");
//        int digit = sc.nextInt();
//        System.out.println(addDigits(num,digit));
//        System.out.println(addDigitsAtfront(num,digit));
        System.out.println("Your reversed number is "+reverseNum(num));
    }

}
