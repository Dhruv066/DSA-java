import java.util.Scanner;

public class checkLessThan69 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        if (num < 69) {
            System.out.println("the given number is less than 69.");
        }else  {
            System.out.println("the given number is not less than 69.");
        }
    }
}
