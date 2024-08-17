package arrays;

import java.util.Scanner;

public class TakeInputOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the size of the column: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("enter the elements of array : ");
        for(int i=0;i<r;i++){
            for(int j=0; j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
