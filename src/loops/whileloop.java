package loops;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int num = 1;
        while (num <=n){
            System.out.println(num);
            num++;
        }



    }
}
