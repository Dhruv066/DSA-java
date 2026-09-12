package maths;

import java.util.Scanner;

public class AllDivisors {
    void printAllDivisors(int n)
    {
        int sqrt = (int)Math.sqrt(n);
        for(int i=1;i<=sqrt;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                if(n/i!=i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        AllDivisors a = new AllDivisors();
        a.printAllDivisors(n);
    }
}
