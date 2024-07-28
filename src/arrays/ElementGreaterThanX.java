package arrays;
import java.util.*;

public class ElementGreaterThanX {
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


        int count = 0;
        for(int i=0;i<size;i++){
            if(arr1[i] > target){
                count++;
            }
        }

        if(count == 0){
            System.out.println("There are no element greater than target = " + target + " :(");
        }
        else{
            System.out.println("The number of element greater than the target present inside the array are: " + count);
        }
    }
}
