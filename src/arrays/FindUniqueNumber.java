package arrays;
import java.util.*;


// Q) given an array , provided that every element in the array has an same clone excluding a an unique element.
// find the unique element.
// note : array consists of non-negative elements.
// not so optimized but will upload one soon.
public class FindUniqueNumber {
    static void PairFinding(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
    }
    static int UniqueElem(int[] arr){
        PairFinding(arr);
        int num = -1;
        for(int e : arr){
            if(e > -1){
                num =e;
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
        for(int i=0;i<size;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("The unique element is :" + UniqueElem(arr1));
    }
}
