package arrays;

import java.util.*;

public class SortZerosAndOnes {
    static void sortZeroes(int[] arr){
        int i = 0 ; int n = arr.length; int j = n-1;
        while(i<j){
            if(arr[i] == 1 && arr[j] == 0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;

//                with no temp variable
                    // with no temprary variable.
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                i++;
                j--;
            }
            else if(arr[i] == 0){
                i++;
            }
            else if(arr[j] == 1){
                j--;
            }
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];


        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }

        // simple and takes O(n) Time complexity.
//        Arrays.sort(arr1);




        // second approach with brute force search.
//
//        int n = arr1.length;
//        int count = 0;
//        for(int i=0;i<n;i++){
//            if(arr1[i] == 0){
//                arr1[count] = arr1[i];
//                count++;
//            }
//        }
//
//        for(int i=count;i<n;i++){
//            arr1[i] = 1;
//        }





        // with the help of two pointer
        sortZeroes(arr1);
        for(int e: arr1){
            System.out.print(e + " ");
        }
    }
}
