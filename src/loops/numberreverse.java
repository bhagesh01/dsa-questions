package loops;

import java.util.Scanner;

public class numberreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int num=0 ,pw=10;
        while(n>0){
//            num = n%10;
//            n = n / 10;
//            System.out.print(num+" ");
            int unit_digit = n%10;
            num = (num*pw) + (unit_digit);
            n /= 10;
        }
        System.out.println(num);

    }
}
