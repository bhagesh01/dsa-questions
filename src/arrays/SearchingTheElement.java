package arrays;
import java.util.*;
public class SearchingTheElement {
    public static void main(String[] args) {
        int arr[] = {7,5,7,2,9,3,4,5,0,10,55,43,28,65};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be searched: ");
        int searchNum = sc.nextInt();
        int num = -1;
       for(int i =0;i<arr.length;i++){
           if(arr[i] == searchNum){
               num = i;
           }
       }
        System.out.println("The index of the element " + searchNum + " is " + num);
    }
}
