package arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class FillSquareOfElemsInSpiralMatrix {
    static void fillSpiralMatrix(int[][] arr , int n){
        int leftCol =0; int bottomRow = n-1; int topRow =0; int rightCol = n-1;
        int totalElements = 0;
        int value =1;
        while(totalElements < (n*n) && value <= (n*n)){
            for(int j=leftCol; j<=rightCol;j++){
                arr[topRow][j] = value;
                value++;
                totalElements++;
            }
            topRow += 1;
            for(int j=topRow; j<=bottomRow;j++){
                arr[j][rightCol] = value;
                value++;
                totalElements++;
            }
            rightCol--;
            for(int j=rightCol; j>=leftCol;j--){
                arr[bottomRow][j] = value;
                value++;
                totalElements++;
            }
            bottomRow--;
            for(int j=bottomRow; j>=topRow;j--){
                arr[j][leftCol] = value;
                value++;
                totalElements++;
            }
            leftCol++;
        }
    }
    static void PrintMatrix(int[][] arr ,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the row: ");
//        int r = sc.nextInt();
//        System.out.println("Enter the size of the column: ");
//        int c = sc.nextInt();
        System.out.println("Enter the number of inputs: ");
        int n = sc.nextInt();


        int[][] matrix = new int[n][n];

        fillSpiralMatrix(matrix ,n);
        PrintMatrix(matrix ,n);


    }
}
