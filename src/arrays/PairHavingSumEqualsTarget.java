package arrays;

import java.util.HashSet;
import java.util.Scanner;


// Q) find the numbers of pair satisfy the target(sum) and return the count?
public class PairHavingSumEqualsTarget {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter the target :");
        int target = sc.nextInt();


        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }
        int count = 0;
    for(int e : arr1){
        int compliment = target - e;
        if(set.contains(compliment)){
            count ++;
        }
        set.add(e);

    }
        System.out.println("the number of pairs :" + count);
    }
}
