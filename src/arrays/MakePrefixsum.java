package arrays;

import java.util.Scanner;


// this code contains both prefix sum and also another part of the questions
// like will have to answer some queries and print sum on the basis
// of the l and r index ?
public class MakePrefixsum {


    // with the help of an another array.
//    static void sumOfPrefix(int[] arr , int[] prefix){
//
//        int n  = arr.length;
//        prefix[0]  = arr[0];
//        for(int i=1;i<n;i++){
//            prefix[i] = prefix[i-1] + arr[i];
//        }
//    }


    // for the prefix sum without an external array
    static void sumOfPrefix(int[] arr){

        int n  = arr.length;
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size+1];


        System.out.println("Enter the " + size +" elements of the array :");
        for(int i=1;i<=size;i++) {
            arr1[i] = sc.nextInt();
        }

        // only for prefix with the external use of array
//        int n= arr1.length;
//        int[] prefix  = new int[n];
        sumOfPrefix(arr1);

        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("Enter the Left index: ");
            int l = sc.nextInt();
            System.out.println("Enter the right index: ");
            int r = sc.nextInt();
            int sum = arr1[r] - arr1[l-1];
            System.out.println("The sum of prefix is : "+ sum);

            q--;
        }

//        for(int e : arr1){
//            System.out.print(e + " ");
//        }

    }
}
