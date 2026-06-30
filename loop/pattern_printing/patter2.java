package loop.pattern_printing;

import java.util.Scanner;

public class patter2 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                char c='A';
                if(i%2==0){
                    for (int k=1;k<=i;k++){
                        System.out.print(c+" ");
                        c++;
                    }
                }else{
                    System.out.println(j);
                }

            }
            System.out.println();
        }
    }
}
