package maths;

import java.util.Scanner;

public class Pallindrome {
    public void checkPallindrome(int n){
        int p= n;
        int num=0;
        while(n>0){
            int r=n%10;
            num=num*10+r;
            n=n/10;
        }
        if(num==p){
            System.out.println("Pallindrome");
        }else {
            System.out.println("Not Pallindrome");
        }
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Pallindrome p = new Pallindrome();
        p.checkPallindrome(n);
    }
}
