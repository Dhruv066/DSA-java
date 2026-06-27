package if_else;

import java.util.Scanner;

public class AbsoluteValue{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num<0){
            System.out.println((-1*num));
        }else {
            System.out.println(num);
        }

    }
}
