package arrays;

import java.util.*;

public class CheckElemInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];


        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }

// This one is AAM zindagi  , but
//        int num = Integer.MIN_VALUE;
//        for (int j : arr1) {
//            if (j < Math.pow(10, 5)) {
//                if(j > num){
//                    num = j;
//                }
//            }
//        }
//        System.out.println("The elem is :" + num);








        // this one is mentos zindagi
        // creating an frequency arrray.

        int[] freq = new int[100005];
        for(int i =0;i<arr1.length;i++){
            freq[arr1[i]]++ ;
        }

        System.out.println("Enter the number of queries : ");
        int q = sc.nextInt();

        while(q > 0){
            System.out.println("The number to be searched: ");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            q--;
        }
    }
}
