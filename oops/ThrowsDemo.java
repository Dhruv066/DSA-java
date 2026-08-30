package oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {
    public static int getAge() throws InputMismatchException {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        return age;
    }
    static void main() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter a age ");
            getAge();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e);
        }
    }
}
