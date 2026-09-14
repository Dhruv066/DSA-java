package bit_Manipulation;

import java.util.Scanner;

public class CheckOddEven {
    public static boolean isEven(int a){
        if((a&1)==0){
            return true;
        }
        return false;
    }
    public static void  main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        a=sc.nextInt();
        CheckOddEven checkOddEven = new CheckOddEven();
        String res = CheckOddEven.isEven(a)?"Even":"Odd";
        System.out.println(a+" is "+res);


    }
}
