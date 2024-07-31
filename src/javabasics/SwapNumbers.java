package javabasics;
import java.util.*;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first element :");
        int a  = sc.nextInt();
        System.out.println("Enter the second element :");
        int b  = sc.nextInt();

        System.out.println("Element before swapping : "+ a + "  " + b);

// using temp variable .
//        int temp = a;
//        a =b;
//        b = temp;


        // using add and subtract symbol.

        a = a+b;
        b = a-b;
        a = a - b;

        System.out.println("Element after swapping : "+ a + "  " + b);


    }
}
