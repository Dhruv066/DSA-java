import java.util.Scanner;

public class CheckDivisiblity {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("the given number is divisible by both 3 and 5");
        }else {
            System.out.println("the given number is not divisible by both 3 and 5");
        }
        if (num % 5 == 0) {
            System.out.println("the given number is divisible by 5.");
        }
        if (num % 3 == 0) {
            System.out.println("the given number is divisible by 3.");
        }

    }
}
