package arrays;

import java.util.HashMap;

public class ReferenceInArrayUsingHasMap {
    static void printArray(int[] arr){
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr_1 = {4,5,3,6,7,8,8};
        printArray(arr_1);
        HashMap<Integer,Integer> mapHash  = new HashMap<>();
        int i =0 ;
        for(int elem : arr_1){
            mapHash.put(i,elem);
            i++;
        }
        System.out.println(mapHash.keySet());
        System.out.println(mapHash.entrySet());
    }
}
