package arrays;

import java.util.Scanner;

public class TransposeOfMatrix {



//    without inplace
    static void TrnasposeMatrix(int[][] matrix ,int r ,int c){

        int[][] trans = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                trans[i][j] = matrix[j][i];
            }
        }

        System.out.println("this is the resulatant matrix: ");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    // with inplace
    static void TrnasposeMatrixInplace(int[][] matrix ,int r ,int c){

        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("this is the resulatant matrix: ");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j] + " ");
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


        int[][] matrix = new int[r][c];

        System.out.println("enter the elements of matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0; j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

//        TrnasposeMatrix(matrix ,r ,c);
        TrnasposeMatrixInplace(matrix ,r ,c);



    }
}
