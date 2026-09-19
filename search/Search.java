package search;

import java.util.Arrays;

public class Search {
    static int LinearSearch(int[] arr,int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }

        }
        return -1;
    }
    static int[] LinearMultipleSearch(int[] arr,int key){
        int[] elm = new int[arr.length];
        Arrays.fill(elm,-1);
        int k=0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                elm[k] = i;
                k++;
            }
        }
        return elm;
    }
    static int BinarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;

    }
    static int findmax(int[] arr){
        int max = Integer.MIN_VALUE;
        int high = arr.length-1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void main() {
        int[] arr ={1,6,3,4,5,6,7,8,6,10};
        System.out.println("Linear Search ");
        int status= LinearSearch(arr,6);
        if(status==-1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index "+status+" in array");
        }
        System.out.println("Binary Search ");
        int status1 = BinarySearch(arr,10);
        if(status1==-1){
            System.out.println("Element not found");
        }else  {
            System.out.println("Element found at index "+status1+" in array");
        }
        System.out.println("Multiply Search ");
        int[] mls =LinearMultipleSearch(arr,6);
        System.out.print("Element found at index : ");
        for (int i=0;i<mls.length;i++){
            if(mls[i]!=-1){
                System.out.print(mls[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Maximum element of the array is: "+findmax(arr));


    }

}
