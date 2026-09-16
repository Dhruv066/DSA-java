package search;

public class Search {
    static int LinearSearch(int[] arr,int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }

        }
        return -1;
    }

    static void main() {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int status= LinearSearch(arr,6);
        if(status==-1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index "+status+" in array");
        }

    }

}
