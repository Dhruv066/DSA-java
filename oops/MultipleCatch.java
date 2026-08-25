package oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter an integer");

        try{
            int[] arr = {2,3};
            System.out.println(arr[5]);
            n = sc.nextInt();
            System.out.println(5/0);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArithmeticException | InputMismatchException e2){
            System.out.println(e2);
        }catch (Exception e){
            System.out.println("other exceptions are handled here"+e);
        }
    }
}
