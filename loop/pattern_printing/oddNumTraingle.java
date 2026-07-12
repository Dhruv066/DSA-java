package loop.pattern_printing;

import java.util.Scanner;

public class oddNumTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int x=1;
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
