package arrays;
import java.util.*;

public class BasicsUnderstanding {
    public static void main(String[] args){
        int[] arr = {5,4,3,7,6,5,8,3,4};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to rotate a array for : ");
        int rotateNum = sc.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        if(n == 0){
            System.out.println("the rotated array is :" + arr);
        }
        else if(n % rotateNum != 0 ){
            for(int i=0;i<n;i++){
                if(i<((n-rotateNum)-1)){
                    list1.add(arr[i]);
                }
                else{
                    list2.add(arr[i]);
                }
            }
            System.out.print("the rotated arrray is :" + list2 + list1);
        }
        else{
            System.out.println("the rotated num is :" + arr);
        }

    }
}
