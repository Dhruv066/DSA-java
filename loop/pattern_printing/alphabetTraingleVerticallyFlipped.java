package loop.pattern_printing;

import java.util.Scanner;

public class alphabetTraingleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int x=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>n){
                    System.out.print((char)x+++" ");
                }else{
                    System.out.print("  ");
                };
            }
            System.out.println();
            x=65;
        }


        System.out.println();
        System.out.println();
        System.out.println();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>n){
                    System.out.print((char)x+++" ");
                }else{
                    System.out.print("  ");
                };
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();
        x=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>n){
                    System.out.print((char)x+" ");
                }else{
                    System.out.print("  ");
                };
            }
            System.out.println();
            x++;

        }
    }
}
