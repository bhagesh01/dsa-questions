package arrays;

public class MaximumNum {
    public static void main(String[] args){
        int arr[] = {4,9,3,4,0,19,5,56,77};
        int max = 0;
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
