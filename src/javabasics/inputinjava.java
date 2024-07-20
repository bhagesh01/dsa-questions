package javabasics;// it just signifies in which folder our main code file is.

import java.util.Scanner;

public class inputinjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("enter your lucky number: ");
//        int num_1 = sc.nextInt();
//        System.out.print("enter your lucky number: ");
//        System.out.println("your lucky number is " + num_1);
        System.out.print("enter your name: ");
        String name = sc.nextLine();
        System.out.println("your name is: "+name);
    }
}
