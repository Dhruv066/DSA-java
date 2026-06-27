import java.util.Scanner;

public class checkMax {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int a = sc.nextInt();
        System.out.println("Enter Second num: ");
        int b = sc.nextInt();
        System.out.println("Enter Third num: ");
        int c = sc.nextInt();
        if(a>=b){
            if(a>=c){
                System.out.println(a + " is the maximum.");
            }else {
                System.out.println(c + " is the maximum.");
            }
        }else {
            if(b>=c){
                System.out.println(b + " is the maximum.");
            }
            else  {
                    System.out.println(c + " is the maximum.");
                }
            }
        }
    }

