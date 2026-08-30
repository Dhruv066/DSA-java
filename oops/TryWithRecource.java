package oops;

import java.util.Scanner;

public class TryWithRecource {
    static void main() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a file name:");
            String fileName = input.nextLine();

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
