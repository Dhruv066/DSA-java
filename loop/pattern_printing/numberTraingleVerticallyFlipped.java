package loop.pattern_printing;

import java.util.Scanner;

public class numberTraingleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=1;
            for(int j=1;j<=n;j++){
                if(i+j>n){
                    System.out.print(x++);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
