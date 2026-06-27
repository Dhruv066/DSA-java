package if_else;

import java.util.Scanner;

public class isInteger {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double a = sc.nextDouble();
        int b = (int) a;
        if(a-b>0){
            System.out.println("The number is not Integer. ");
        }else {
            System.out.println("The number  is Integer. ");
        }

    }
}
