package loop.pattern_printing;

import java.util.Scanner;

public class pascalsTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(fact(i)/(fact(j)*fact(i-j))+"  ");
            }
            System.out.println();
        }
    }
    public static  int fact(int n){
        int mul=1;
        for(int i=1;i<=n;i++){
            mul*=i;
        }
        return mul;
    }
}
