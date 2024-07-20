package loops;

import java.util.Scanner;

public class foorloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0;
        // for(init-statement;condition;final-expression){
        // code
        // }

        for (int num = 1; num<=n; num++){
            sum = sum +num;

        }
        System.out.println("the addition of integers is "+ sum);
    }
}
