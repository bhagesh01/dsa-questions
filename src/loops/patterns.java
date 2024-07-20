package loops;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        // ******
        // ******
        // ******

//        for(int i =1; i<=3; i++){
//            for(int j=1; j<=6; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
// ******
// *    *
// *    *
// ******
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number row:");
        int r = sc.nextInt();
        System.out.println("enter the number coloumn:");
        int c = sc.nextInt();
//        for(int i =1; i<=r; i++){
//            for(int j=1; j<=c; j++){
//                if (i == 1 || i == r || j==1 || j==c)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//
//            }
//            System.out.println();
//        }

//*
//**
//***
//****

//        for (int i = 1;i<=4;i++){
//            for(int j =1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //****
        //***
        //**
        //*

//        for (int i = 1;i<=r;i++){
//            for(int j=1; j<=(r+1-i);j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // -------------------------or---------------------
//        for (int i = r;i>=1;i--){
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 1
        // 22
        // 333
        // 4444
//
//        for (int i=1; i<=r;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(i);
//            }
//            System.out.println("");
//        }


        // 1
        // 23
        // 456
        // 78910
//
//        int count  = 1;
//        for (int i=1; i<=r;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(count);
//                count++;
//            }
//            System.out.println("");
//        }


        // 1
        // 23
        // 345
        // 4567


//
//        for (int i=1; i<=r;i++){
//            int count  = i;
//            for (int j=1;j<=i;j++){
//                System.out.print(count);
//                count++;
//            }
//            System.out.println("");
//        }

        // 1
        // 21
        // 321
        // 4321

//
//        for (int i=1; i<=r;i++){
//            int count  = i;
//            for (int j=1;j<=i;j++){
//                System.out.print(count);
//                count--;
//            }
//            System.out.println("");
//        }

        // AAA
        // BBB
        // CCC

//        int num = 65;
//        char some = (char)num;
//        for (int i=1; i<=r;i++){
//            for (int j=1;j<=c;j++) {
//                System.out.print(some);
//            }
//
//            System.out.println("");
//            num++;
//        }




//
//        *
//       ***
//      *****
//     *******
//
//        for (int i = 1;i<=r;i++){
//            for (int j =1; j <= r-i; j++){
//                System.out.print(" ");
//                }
//            for(int k=1; k<=(2*i-1);k++){
//                System.out.print("*");
//            }
//
//
//            System.out.println();
//
//        }

//        1234567
//        2345671
//        3456712
//        4567123
//        5671234
//        6712345
//        7123456
//        for (int i = 1;i<=r;i++){
//            for (int j =i; j <= r; j++){
//                System.out.print(j);
//            }
//            for(int k=1; k<=(i-1);k++){
//                System.out.print(k);
//            }
//
//
//            System.out.println();
//
//        }

//        1234
//        1234
//        1234
//        1234
//        1234
//        for (int i = 1;i<=r;i++){
//            for (int j =1; j <= c; j++){
//                System.out.print(j);
//            }
//
//
//
//            System.out.println();
//
//        }


//        1212
//        2121
//        1212
//        2121
//        for (int i = 1;i<=r;i++){
//            for (int j =1; j <= c; j++){
//                if((i+j)%2==0){
//                    System.out.print("1");
//                }
//                else{
//                    System.out.print("2");
//                }
//            }
//
//
//
//            System.out.println();
//
//        }
//
//        1
//        12
//        123
//        1234

//        for (int i = 1;i<=r;i++){
//            for (int j =1; j <= i; j++){
//                System.out.print(j);
//            }
//
//
//
//            System.out.println();
//
//        }

//
//          1
//         121
//        12321
//       1234321
//        for (int i = 1;i<=r;i++){
//            for (int j =1; j <= r-i; j++){
//                System.out.print(" ");
//            }
//
//            for (int k = 1; k<=i;k++){
//                System.out.print(k);
//            }
//            for (int l=i-1; l>=1;l--){
//                System.out.print(l);
//            }
//
//            System.out.println();
//
//        }


        // 123
        // 123
        // 123

//        for (int i =1; i<=r;i++){
//            for (int j=1;j<=c;j++){
//                System.out.print(j);
//            }
//            System.out.println("");
//        }


        // 321
        // 321
        // 321

//        for (int i=r; i>=1;i--){
//            for (int j=c;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println("");
//        }

        // 123
        // 456
        // 789
//        int count = 1;
//
//        for (int i=1; i<=r;i++){
//            for (int j=1;j<=c;j++){
//                System.out.print(count);
//                count++;
//
//            }
//            System.out.println("");
//        }

        




    }
}
