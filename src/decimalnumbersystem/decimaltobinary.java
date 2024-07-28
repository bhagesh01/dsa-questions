package decimalnumbersystem;

import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int num = sc.nextInt();
        int ans = 0;
        int pw = 1;
        while(num >0){
            int unit_digit = num % 2;
            ans += unit_digit * pw;
            pw *=10;
            num /= 2;
        }

        System.out.println(ans);




    }
}
