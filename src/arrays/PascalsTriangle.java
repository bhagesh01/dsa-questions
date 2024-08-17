package arrays;

import java.util.Scanner;


// Q) generating the pascals triangle using the 2d array
public class PascalsTriangle {
    static void pascalsTriangleFunc(int[][] matrix ,int n){
        matrix[0][0] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 1;
        for(int i=2;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(j==0){
                    matrix[i][j] = 1;
                }
                else if(j == i){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = matrix[i-1][j-1]+matrix[i-1][j];
                }
            }
        }

        System.out.println("The pascals trianle is :");
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the height of the triangle: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        if(n ==1){
            System.out.println("your pascals triangle is :");
            System.out.println("1");
            return;
        }
        else if(n == 2){
            matrix[0][0] = 1;
            matrix[1][0] = 1;
            matrix[1][1] = 1;
            System.out.println("your pascals triangle is :");
            for(int i=0;i<n;i++) {
                for(int j=0;j<i+1;j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else if(n > 2){
            pascalsTriangleFunc(matrix ,n);
        }
    }
}
