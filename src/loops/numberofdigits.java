package loops;

import java.util.Scanner;

public class numberofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();
        int numOfDigits = 0;
        int original_n = number;

        while(number>0){
            number = number / 10;
            numOfDigits++;

        }
        System.out.println("the number of digits in "+original_n+" is "+numOfDigits);

    }
}
