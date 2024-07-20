package conditionals;

import java.util.Scanner;

public class threeintegergreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first integer:");
        int a = sc.nextInt();

        System.out.println("enter the second integer:");
        int b = sc.nextInt();

        System.out.println("enter the third integer:");
        int c = sc.nextInt();

//        if(a == b && a == c){
//            System.out.println("all inputs are same return and try again by putting different inputs");
//        } else if (a>b && a>c) {
//            System.out.println("a is the greatest integer of them");
//        }
//        else if (b>a && b>c){
//            System.out.println("b is the greatest integer of all");
//        }
//        else{
//            System.out.println("c is the greatest integer of all");
//        }

        // nested

        if(a>b){
            if (a>c){
                System.out.println("a is the largest");
            }
            else{
                System.out.println("c i the largest");
            }

        }
        else{
            if (b>c){
                System.out.println("b is the largest");
            }
            else {
                System.out.println("c is the largest");

            }
        }

    }
}
