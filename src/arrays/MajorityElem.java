package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];


        System.out.println("Enter the " + size +" elements of the array :");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }

// brute force solution ==> TC = O(n^2);
//        SC = O(1)

//        int count = 0;
        int n = arr1.length;
//        for(int i =0;i< arr1.length;i++){
//            for(int j= i+1;j< arr1.length;j++){
//                if(arr1[j] == arr1[i]){
//                    count++;
//                }
//            }
//            if(count > (n/2)){
//                System.out.println("The majority element is : "+arr1[i]);
//                return ;
//            }
//        }





        // better solution using the hashmap
        // optimal solution and using moore's voting algorithm

        int el =0;int count = 0;
        for(int i=0;i<n;i++) {
            if(count == 0){
                count = 1;
                el = arr1[i];
            }
            else if(arr1[i] == el){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 = 0;
        for(int e : arr1){
            if(e == el){
                count1++;
            }
        }

        if(count1 > (n/2)){
            System.out.print("The Majority elemnet is : " + el);
        }
        else{
            System.out.print("There is no majority element :(");
        }
    }
}
