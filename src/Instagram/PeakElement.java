package Instagram;

import java.util.Scanner;

//Q) you are given an array of positive integers and you have to check
//and return then peak element.
// peak element is  = a number which is greater than the previous element and
// the element after the it.
// {10,20,30,40,50}
//==> peak element is 50.

// {5,10,20,15}
// the peak element is 20.
public class PeakElement {
    static int PeakElemFind(int[] arr){
        int n=arr.length;
        int j=1;int k=2;
        int peak = Integer.MIN_VALUE;
        if(arr[0] > arr[1]){
            peak = arr[0];
        }
        else{
            for(int i=0;i<n;i++){
                if(k==n){
                    if(arr[i] < arr[j]){
                        peak = arr[j];
                    }
                }
                else if(arr[i]<arr[j] && arr[k]<arr[j]){
                    peak  = arr[j];
                }
                else{
                    j++;
                    k++;
                }
            }
        }
        return peak;
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

        System.out.println("your peak element is : " +PeakElemFind(arr1));

    }
}
