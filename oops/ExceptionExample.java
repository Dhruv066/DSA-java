package oops;

import java.util.Scanner;

public class ExceptionExample {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter number");
        try{
            n = sc.nextInt();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
