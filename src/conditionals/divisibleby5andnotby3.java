package conditionals;

import java.util.Scanner;

public class divisibleby5andnotby3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit:");
        int num = sc.nextInt();

        if(num%5==0 && num%3!=0){
            System.out.println("the number is divisible by 5 but not by 3 ");
        }

    }
}
