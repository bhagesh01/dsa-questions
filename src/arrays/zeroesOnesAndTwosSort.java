package arrays;

import java.util.Scanner;

public class zeroesOnesAndTwosSort {
    static void swap(int[] arr ,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
    static void DNF(int[] arr){

        int low = 0;
        int mid =0;
        int n = arr.length;
        int high = n-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
//                swap(arr ,arr[mid] , arr[high]);
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];


        System.out.println("Enter the " + size +" elements of the array (only consisting 0's - 1's - 2's):");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }




        // but for this it will take tc = O(2N)
        // and SC = O(2)
//        int zeroes = 0;
//        int ones = 0;
//
//        for(int e : arr1){
//            if(e == 0){
//                zeroes += 1;
//            }
//            else if(e == 1){
//                ones += 1;
//            }
//        }
//
//        for(int i=0;i<arr1.length;i++){
//            if(i<zeroes){
//                arr1[i] = 0;
//            }
//            else if(i>zeroes-1 && i < (zeroes+ones)){
//                arr1[i] = 1;
//            }
//            else if(i>(zeroes+ones)-1){
//                arr1[i] = 2;
//            }
//        }





        // Dutch national flag algorithm ===> DNF {the algo is also known as\
        // the 0's 1's 2's . Such that there are only three types of elems in the array.}


        DNF(arr1);
        for(int e : arr1){
            System.out.print(e + " ");
        }

    }
}
