import java.util.Scanner;

public class checkFourDigitNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        if (num > 999 && num < 10000) {
            System.out.println("the given number is of four digit");
        }else {
            System.out.println("the given number is not of four digit");
        }
    }
}
