package arrays;

import java.util.*;

public class ReturnTheSquaresOfElem {
    static void reverse(int[] arr){
        int i = 0;
        int n = arr.length;
        int j = n-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
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
int i = 0; int n =arr1.length; int k=0; int j = n-1;int[] temp = new int[n];
while(i<=j){
    if(Math.abs(arr1[i]) > Math.abs(arr1[j])){
        temp[k++] = arr1[i] * arr1[i];
        i++;
    }else{
        temp[k++] = arr1[j] * arr1[j];
        j--;
    }
}

    reverse(temp);
        for(int e : temp){
            System.out.print(e + " ");
        }
    }
}
