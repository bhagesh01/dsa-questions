package arrays;
import java.util.*;

public class LastOccurenceOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        int[] arr1 = new int[size];

        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++){
                arr1[i] = sc.nextInt();
        }

        int index = -1;
        for(int i=0;i<size;i++){
            if(arr1[i] == target){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("The number is not present in the array :(");
        }
        else{
            System.out.println("The index of the last occurence is : "  + index);
        }
    }


}
