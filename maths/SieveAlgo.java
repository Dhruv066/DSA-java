package maths;

import java.util.Arrays;
import java.util.Scanner;

public class SieveAlgo {
    public void printPrimes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        int sqrt = (int)Math.sqrt(n);
        for (int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for (int j = i*i; j <= n; j+=i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        SieveAlgo obj = new SieveAlgo();
        obj.printPrimes(n);
    }
}
