package conditionals;

import java.util.Scanner;
public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = sc.nextInt();

        if (a%5 == 0){
            System.out.println("the number is divisible by 5");
        }
        else{
            System.out.println("the number is not divisible by 5");
        }



    }
}
