package arrays;

import java.util.Scanner;

public class SpiralMatrixTraversal {
    static void spiralMatrix(int[][] arr , int r , int c){
        int leftCol =0; int bottomRow = r-1; int topRow =0; int rightCol = c-1;
        int totalElements = 0;
        while(totalElements < (r*c)){
            for(int j=leftCol; j<=rightCol;j++){
                System.out.print(arr[topRow][j]+",");
                totalElements++;
            }
            topRow += 1;
            for(int j=topRow; j<=bottomRow;j++){
                System.out.print(arr[j][rightCol]+",");
                totalElements++;
            }
            rightCol--;
            for(int j=rightCol; j>=leftCol;j--){
                System.out.print(arr[bottomRow][j]+",");
                totalElements++;
            }
            bottomRow--;
            for(int j=bottomRow; j>=topRow;j--){
                    System.out.print(arr[j][leftCol]+",");
                totalElements++;
            }
            leftCol++;
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

        spiralMatrix(matrix ,r ,c);

    }
}
