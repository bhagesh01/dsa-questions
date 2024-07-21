import java.util.Scanner;


public class ArraysInputAndPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter" + n + "elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(i == n){
                break;
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j] + " ");
        }
        System.out.print("  &&&&&  ");
        for(int k=n-1;k>=0;k--){
            System.out.print(arr[k] + " ");
        }

    }
}
