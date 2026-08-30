package oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw {
    public static int  age(int age) {

        if(age<18) {
            throw new InputMismatchException("invalid age");
        }else {
            return age;
        }
    }
    static void main() {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter your age");
            int age=sc.nextInt();
            age(age);

        } catch (Exception e) {
            throw new RuntimeException("invalid age enter correct value");
        }
    }
}
