package arrays;

import java.util.Scanner;

public class MultiplicationOfMatrices {


   static void multiplicationMatrixSameDimension(int[][] arr1 , int[][] arr2 ,int r ,int c){
        int[][] multi = new int[r][c];
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               multi[i][j] = arr1[i][j]*arr2[i][j];
           }
           System.out.println();
       }


       System.out.println("This is  the resulting matrix : ");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               System.out.print(multi[i][j] + " ");
           }
           System.out.println();
       }
    }


    static void multiplicationMatrixDifferentDimension(int[][] arr1 , int[][] arr2 , int r1 , int r2 , int c1 , int c2){
        int[][] multi = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
               for(int k=0;k<c1;k++){
                   multi[i][j] += (arr1[i][k]*arr2[k][j]);
               }
            }
        }

        System.out.println("This is  the resulting matrix : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix1 :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();


        System.out.println("Enter the size of the matrix2 :");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();



        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];


        System.out.println("Enter the elements of the matrix1 : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter the elements of the matrix2 : ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }




        if(r1 == r2 && c1 == c2){
            multiplicationMatrixSameDimension(matrix1 , matrix2 ,r1 ,c1);
        }
        else if(c1 == r2){
            multiplicationMatrixDifferentDimension(matrix1 , matrix2 , r1 ,r2 ,c1 ,c2);
        }


    }
}
