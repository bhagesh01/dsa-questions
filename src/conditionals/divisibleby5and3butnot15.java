package conditionals;

import java.util.Scanner;

public class divisibleby5and3butnot15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();


// divisible by 5 and 3 and 15
//        if(num%5==0 && num%3==0){
//            if(num%15 == 0){
//                System.out.println("the number is divisible by 3 ,5 and 15");
//            }
//            else{
//                System.out.println("the number is only divisible by 5 and 3");
//            }
//
//        }
//        else {
//            System.out.println("the number is not divisible by 3 and 5");
//        }

        // disvisible by 5 or 3 but not 15.
        if(num%5==0 || num%3==0){
            if(num%15 != 0){
                System.out.println("the number is divisible by 3 or 5 but not 15");
            }
            else{
                System.out.println("the number is only divisible by 3 or 5 and 15");
            }

        }
        else {
            System.out.println("the number is not divisible by 3 or 5");
        }

    }
}
