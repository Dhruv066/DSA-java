package if_else;
import java.util.Scanner;

import java.util.Scanner;

public class chekOddEven {
    static void main() {
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter an integer number");
        int a = sc.nextInt();
        if  (a%2==0) {
            System.out.println("The number is even");
        }else  {
            System.out.println("The number is odd");
        }
    }
}
