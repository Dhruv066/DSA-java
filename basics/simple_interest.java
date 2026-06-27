package basics;

import java.util.Scanner;

public class simple_interest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle ammount :");
        double p = sc.nextDouble();
        System.out.println("Enter the annual interest rate :");
        double r = sc.nextDouble();
        System.out.println("Enter the time period :");
        double t = sc.nextDouble();
        double si= (p*r*t)/100;
        System.out.println("The interest is "+si);
    }
}
