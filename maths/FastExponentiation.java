package maths;

import java.util.Scanner;

public class FastExponentiation {
    public static double fastExpo (int a,int b){
        double res=1;boolean isNegative=false;
        if(b<0){
            b=-1*b;
            isNegative=true;
        }
        while(b>0){
            if(b%2!=0){
                res=res*a;
                b--;
            }
            b=b/2;
            a=a*a;
        }
        if(isNegative){
            return 1/res;
        }
        return res;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=sc.nextInt();
        System.out.println("Enter a power: ");
        int b=sc.nextInt();
        FastExponentiation fe=new FastExponentiation();
        System.out.println(fe.fastExpo(a,b));
    }
}
