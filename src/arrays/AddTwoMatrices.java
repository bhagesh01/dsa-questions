package arrays;
import java.util.*;

public class AddTwoMatrices {
    static void addingMatrices(int[][] arr1 , int[][] arr2 , int r , int c){
        int[][] result = new int[r][c];


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the size of the column: ");
        int c = sc.nextInt();


        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r][c];

        System.out.println("enter the elements of matrix 1 : ");
        for(int i=0;i<r;i++){
            for(int j=0; j<c;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the elements of matrix 2 : ");
        for(int i=0;i<r;i++){
            for(int j=0; j<c;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        addingMatrices(matrix1 , matrix2 ,r ,c);
    }
}
