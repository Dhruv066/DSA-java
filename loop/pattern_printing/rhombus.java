package loop.pattern_printing;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print("  ");

            }
            for(int k=1;k<=n;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
