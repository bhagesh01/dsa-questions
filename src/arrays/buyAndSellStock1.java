package arrays;

import java.util.Scanner;

public class buyAndSellStock1 {
    static int sellStockProfit(int[] arr){
        int n= arr.length;
        int maxProfit = 0;
        int cost = 0;
        int minimum = arr[0];
        if(n == 0){return 0;};
        if(n >= 1 && n <= 100000){
            for(int i=1;i<n;i++){
                cost = arr[i] - minimum;
                maxProfit = Math.max(maxProfit , cost);
                minimum = Math.min(minimum , arr[i]);
            }
        }
        return maxProfit;
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
        System.out.println("The max profit you can make through the data is : " +sellStockProfit(arr1) + " units");


    }
}
