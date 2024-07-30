package arrays;
import java.util.*;

// it is a not so , optimized code
// time complexity  = O(n^2)
// space complexity = O(3)  excluding the  array size.

public class TargetSum {
    static int checkingSum(int[] arr , int t){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j] == t){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];


        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the target number :");
        int target = sc.nextInt();

        System.out.println("The number of pairs having the sum of target is : " +checkingSum(arr1 , target));
    }
}
