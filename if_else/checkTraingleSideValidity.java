import java.util.Scanner;

public class checkTraingleSideValidity {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first side of triangle :");
        double a = sc.nextDouble();
        System.out.println("enter the second side of triangle :");
        double b = sc.nextDouble();
        System.out.println("enter the third side of triangle :");
        double c = sc.nextDouble();
        if(a+b < c && a+c < b && b+c < a){
            System.out.println("All the triangles are valid");
        }else {
            System.out.println("The triangle sides are not valid");
        }

    }
}
