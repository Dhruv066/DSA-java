package bit_Manipulation;

import java.util.Scanner;

public class SwapNumbers {
    public void swapByBitManipulation(int a,int b){
        System.out.println("Numbers before swaping a = "+a+" and b = "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Numbers After swaping a = "+a+" and b = "+b);
    }

    static void main() {
        SwapNumbers swapNumbers = new SwapNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to swap: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapNumbers.swapByBitManipulation(a,b);
    }
}
