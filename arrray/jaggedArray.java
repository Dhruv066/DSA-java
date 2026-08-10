package arrray;

import java.util.Scanner;

public class jaggedArray {
    static void main() {
        int arr[][]=new int[3][];
        Scanner sc=new Scanner(System.in);
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[5];
        for (int i=0;i<3;i++) {
            for (int j=0;j<arr[i].length;j++) {

                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println(" given jagged array is ");
        for (int i=0;i<3;i++) {
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
