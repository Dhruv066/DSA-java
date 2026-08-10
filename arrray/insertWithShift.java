package arrray;

import java.util.Scanner;

class insertWithShift {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,3,8,3,5,64};
        System.out.print("enter the element to be inserted :");
        int elm = sc.nextInt();
        System.out.print("enter the index at which to be inserted :");
        int index = sc.nextInt();
        insert(arr,elm,index);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
    public static void insert( int arr[],int element , int index){
        int n = arr.length;
        for(int j=n-2;j>=index;j--){
            arr[j+1]=arr[j];

        }
        arr[index]=element;
    }

}
