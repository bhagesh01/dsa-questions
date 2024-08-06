package arrays;

import java.util.Scanner;

public class RearrangeElemOnBasisOfSign {

    static void rearrangeElems(int[] arr){

        // TC = O(3N);
        // SC = O(N);
        int n = arr.length;
        int[] tempNegative = new int[n/2];
        int[] tempPositive = new int[n/2];

        // for adding elements on the basis of the sign to different arrays
        int k=0;
        for(int e : arr){
            if(e < 0){
                tempNegative[k++] = e;
            }
        }
        k=0;
        for(int e : arr){
            if(e>0){
                tempPositive[k++] = e;
            }
        }


        k =0;int j = 0;
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                arr[i] = tempPositive[k++];
            }
            else{
                arr[i] = tempNegative[j++];
            }
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


        rearrangeElems(arr1);
        for(int e : arr1){
            System.out.print(e + " ");
        }

    }
}
