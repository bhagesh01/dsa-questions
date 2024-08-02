package arrays;
import java.util.*;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];


        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }



        int n = arr1.length;
        int i = 0; int j = n-1;
        while (i < j){
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
            i++;
            j--;
        }

       for(int e : arr1){
           System.out.print(e + " " );
       }
    }
}
