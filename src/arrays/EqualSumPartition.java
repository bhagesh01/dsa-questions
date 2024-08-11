package arrays;

import java.util.Scanner;

public class EqualSumPartition {

    static void PrefixSum(int[] arr){

        int n  = arr.length;
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];


        System.out.println("Enter the " + size +" elements of the array :");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }

//        PrefixSum(arr1);
//        System.out.println("Enter the sum of the array :");
//        int sum = sc.nextInt();
        for(int e : arr1){
            System.out.print(e + " ");
        }
//        int suffixSum = 0;
//        int prefixSum = 0;
        int n = arr1.length;



    }
}
