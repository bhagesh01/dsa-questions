package arrays;

import java.util.Scanner;
public class SortEvenAndOddNums {

    static void swapOfElems(int[] arr){
        int i=0;
        int n = arr.length;
        int j=n-1;

        while(i<j){
            if(arr[i]%2 == 0 && arr[j]%2 == 1){
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                i++;
                j--;
            }
            else if(arr[i]%2 == 1){
                i++;
            }
            else if(arr[j]%2 == 0){
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




        swapOfElems(arr1);
        for(int e : arr1){
            System.out.print(e + " ");
        }
    }
}
