package javabasics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle: ");
        float p = sc.nextFloat();

        System.out.println("Enter rate of interest: ");
        float r = sc.nextFloat();

        System.out.println("Enter time: ");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("principle is: " + p);
        System.out.println("interest rate is "+r);
        System.out.println("time is "+t);
        System.out.println("the Simple interest is "+si);

    }
}
