package arrays;

import java.util.Scanner;

public class ArraySortedOrNot {
    static void ascending(int[] arr){
        // assuming there are no negative numbers
        int count = -1;
        for(int elem : arr){
            if(elem > count){
                count = elem;
            }
            else{
              count = -1;
            }
        }
        if(count == -1){
            System.out.println("the array is not sorted ascendingly :(");
        }
        else {
            System.out.println("the array is sorted ascendingly");
        }
    }
    static void descending(int[] arr){
        int count = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < count){
                count = arr[i];
            }
            else{
                count = -1;
            }
        }

        if(count == -1){
            System.out.println("the array is not sorted descendingly :(");
        }
        else {
            System.out.println("the array is sorted descendingly");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];


        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++){
            arr1[i] = sc.nextInt();
        }


//        ascending(arr1);
        descending(arr1);
    }
}



// time complexity here is  = O(n) ==> only one for loop for single check.
// Space complexity = O(1) ==> excludi0ng the array used .