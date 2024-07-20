package loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of division of factorial");
        int n = sc.nextInt();
        int fact = 1;


        for(int num =1;num<=n; num++){
            fact = fact * num;
        }
        System.out.println("factorial of "+n+" is: "+fact);
    }
}
