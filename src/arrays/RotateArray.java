package arrays;
import java.util.*;
public class RotateArray {

    static void reverse(int[] arr , int start , int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter the amount of rotating degree k :");
        int k = sc.nextInt();


        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("The original array is :");
        for(int e : arr1){
            System.out.print(e + " ");
        }

        int n = arr1.length;
        k = k % n;




        // TC = O(n-k);
        // SC = O(k)
 // after using an extra space
//        if(k != 0){
//            int[] temp = new int[k];
//            // for storing element in the temp array.
//            for(int i =0;i<k;i++){
//                temp[i] = arr1[i];
//            }
//
//            // shifting the elements of the original array
//
//            for(int i =0;i<(n-k);i++){
//                arr1[i] = arr1[k+i];
//            }
//
//
//            // for inserting the last element from temp to original array.
//
//            for(int i=n-k; i<n;i++){
//                arr1[i] = temp[i - (n-k)];
//            }
//        }




        // without using extra space
        // TC = O(2n) && SC = O(1)

       if(k != 0){
           reverse(arr1 , 0 , n-k-1);
           reverse(arr1 , n-k , n-1);
           reverse(arr1 , 0 ,n-1);
       }

        System.out.println();
        System.out.println("The rotated array is : ");
        for(int e : arr1){
            System.out.print(e + " ");
        }



    }
}
