package arrays;
import java.util.*;
public class FirstValueToRepeat {
    static int RepeatingNumber(int[] arr){
     int num = -1;
     int n = arr.length;
     // TC = O(N^2) && SC = O(1)
//     for(int i=0;i<n;i++){
//         for(int j =i+1;j<n;j++){
//             if(arr[i] == arr[j]){
//                 num  = arr[i];
//                 break;
//             }
//         }
//     }


        // better time complexity
        // TC = O(n) && SC = O(1)
        HashSet<Integer> set  = new HashSet<>();
        for (int j : arr) {
            if (set.contains(j)) {
                num = j;
                break;
            } else {
                set.add(j);
            }
        }
     return num;
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

        System.out.println("the first number to repeat in array is: "+RepeatingNumber(arr1));
    }
}
