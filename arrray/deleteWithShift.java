package arrray;

import java.util.Arrays;
import java.util.Scanner;

 class deleteWithShift {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the index to be deleted: ");
        int index=sc.nextInt();
        int[] arr= {1,2,3,4,5,6};
        delete(arr,index);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void delete(int[] arr,int index) {
        int n=arr.length;
        for(int i=index;i<n-1;i++) {
            arr[i]=arr[i+1];
        }
        arr[n-1]=0;
    }
}
