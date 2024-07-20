package loops;

import java.util.Scanner;

public class givenTwonumbersandtheirraise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number a:");
        int a = sc.nextInt();
        System.out.println("enter the first number b:");
        int b = sc.nextInt();
        int ans = 1;


        int n = 1;
        while(n<=b){
             ans = ans*a;
            n++;
        }
        System.out.println("the value of a raise to b is = "+ ans );
    }
}
