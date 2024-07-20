package conditionals;

import java.util.Scanner;

public class threesidesandtrianglecheck {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the first side");
        int a = sc.nextInt();

        System.out.println("Enter the second side");
        int b = sc.nextInt();

        System.out.println("Enter the third side");
        int c = sc.nextInt();
//
//        if((a+b)>c){
//            System.out.println("eligible as a sides of triangle");
//        } else if ((a+c)>b) {
//            System.out.println("eligible as a sides of triangle");
//        } else if ((b+c)>a) {
//            System.out.println("eligible as a sides of triangle");
//        }
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("eligible as a sides of triangle");
        }
        else{
            System.out.println("they don't satisfy the condition and are not the sides of triangle.");
        }

    }
}
