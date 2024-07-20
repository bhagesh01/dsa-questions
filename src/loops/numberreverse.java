package loops;

import java.util.Scanner;

public class numberreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int num ;
        while(n>0){
            num = n%10;
            n = n / 10;
            System.out.print(num+" ");
        }

    }
}
