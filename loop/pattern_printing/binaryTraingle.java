package loop.pattern_printing;

import java.util.Scanner;

public class binaryTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int k=1;k<=n;k++){
            for(int i=1;i<=k;i++){
                if((i+k)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
