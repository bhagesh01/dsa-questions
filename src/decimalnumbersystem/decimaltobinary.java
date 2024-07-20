package decimalnumbersystem;

import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int num = sc.nextInt();
//        int mult = 1;
//
//
//
//
//        while(num>0){
//            int unit_digit = num%2;
//            num = num / 2;
//            unit_digit *= mult;
//            mult *= 10;
//            System.out.print(" "+unit_digit);
//        }


        int ans = 0;
        int pw = 1;

        while(num>0){
            int parity = num%2;
            ans += (parity * pw);
            pw *= 10;
            num /=2;
        }
        System.out.println("your decimal number is: " +ans);



    }
}
