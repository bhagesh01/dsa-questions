package arrays;

import java.util.Scanner;

public class removeDuplicates {
    static int remove(int[] arr){
        int n = arr.length;
        int j=1;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i - 1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
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

        System.out.println(remove(arr1));
    }
}
