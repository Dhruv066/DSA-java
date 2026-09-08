package maths;

import java.util.Scanner;

public class FindPower {
    static double pow(int a,int b){
        double res=1;
        boolean isNegative=false;
        if(b<0)
        {
            b=b*-1;
            isNegative=true;
        }
        for(int i=1;i<=b;i++){
            res=res*a;
        }
        if(isNegative){
            res=1/res;
        }
        return res;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=sc.nextInt();
        System.out.println("Enter a power: ");
        int b=sc.nextInt();
        FindPower p=new FindPower();
        System.out.println(p.pow(a,b));
    }
}
