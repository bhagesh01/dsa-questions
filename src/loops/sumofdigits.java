package loops;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
//        int sum = 0;
//
//        while(n>0){
//
//            n = n%10;
//            sum = sum +n;
//
//
//        }
//        System.out.println("the number "+n+" sum is "+sum);
         int sum = 0;
         int original  = n;

         while (n>0){
             sum += n%10;
             n = n / 10;
         }
        System.out.println("you sum of "+original+" is "+sum);
    }
}
