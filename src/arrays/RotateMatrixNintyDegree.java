package arrays;

import java.util.Scanner;

public class RotateMatrixNintyDegree {

    static void rotateMatrix(int[][] arr , int r ,int c){
        int[][] result = new int[r][c];
        int k=2;
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                result[i][j] = arr[k--][i];
            }
            k=2;
        }


        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the size of the column: ");
        int c = sc.nextInt();


        int[][] matrix = new int[r][c];

        System.out.println("enter the elements of matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0; j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The resultant matrix is: ");
        rotateMatrix(matrix,r,c);
    }
}
