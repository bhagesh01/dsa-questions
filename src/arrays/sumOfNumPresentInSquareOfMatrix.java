package arrays;

import java.util.Scanner;

public class sumOfNumPresentInSquareOfMatrix {

    // higher time complexity.
//    static int SumOfSquare(int[][] matrix , int l1 ,int r1 ,int l2 ,int r2 ){
//        int sum=0;
//        for(int i=l1;i<=l2;i++){
//            for(int j=r1;j<=r2;j++){
//                sum += matrix[i][j];
//            }
//        }
//        return sum;
//    }



    static void SquareElemSum(int[][] matrix ,int l1 ,int r1 ,int l2 ,int r2 ,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        int sum =0;
        for(int i=r1;i<=r2;i++){
            if(r1 >= 1){
                sum += matrix[i][r2] - matrix[i][r1-1];
            }
            else{
                sum += matrix[i][r2];
            }
        }

        System.out.println("the sumation is :" + sum);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the size of the column: ");
        int c = sc.nextInt();
        System.out.println("Enter the cordinates : ");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();


        int[][] matrix = new int[r][c];

        System.out.println("enter the elements of matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0; j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

//        System.out.println("The sum of the square elements is: "+SumOfSquare(matrix ,l1,r1,l2,r2));

        SquareElemSum(matrix ,l1,r1,l2,r2,r,c);

    }
}
