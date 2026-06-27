package if_else;

import java.util.Scanner;

public class checkProfitOrLoss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price :");
        double costPrice = sc.nextDouble();
        System.out.println("Enter the Selling Price :");
        double sellingPrice = sc.nextDouble();
        if (costPrice < sellingPrice) {
            System.out.println("You got profit of "+(sellingPrice-costPrice)+"  .");
        }
        if (costPrice > sellingPrice) {
            System.out.println("you got loss of "+(costPrice-sellingPrice)+"  .");
        }
        if (costPrice == sellingPrice) {
            System.out.println("You hav no profit and loss of");
        }
    }
}
