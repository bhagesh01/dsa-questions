package arrays;
import java.util.*;
// question is == you will be given an array and you will have to print the largest element at the last of the array and the smallest element at the starting of the array.
public class SmallestAndLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];


        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }




    }
}
