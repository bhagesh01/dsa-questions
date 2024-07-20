package decimalnumbersystem;

import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int pw = 1;
       int ans = 0;

       while(num > 0){
           int unit_digit = num % 10;
           ans += unit_digit * pw;
           num /= 10;
           pw *= 2;
       }
        System.out.println("your decimal to digit conversion is" + ans);
    }
}
