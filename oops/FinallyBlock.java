package oops;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        try {
            int n = sc.nextInt();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally block get executed.");
        }
    }
}
