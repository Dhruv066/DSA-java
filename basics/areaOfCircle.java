package basics;

import java.util.Scanner;

public class areaOfCircle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double r=sc.nextDouble();
        System.out.println("area of the circle : "+(3.14*r*r));
    }
}
