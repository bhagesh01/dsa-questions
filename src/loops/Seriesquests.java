package loops;

import java.util.Scanner;

public class Seriesquests {
    public static void main(String[] args) {
        // S = 1-2+3-4+5-6+7.......
        // check ehat to if the anser is negative
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of inputs: ");
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        while(num<=n){
            if(num%2 == 0){
                sum -= num;
            }
            else{
                sum += num;
            }
            num++;
        }

        if(n%2 == 0){
            System.out.println("the sum is "+(-sum));
        }
        else{
            System.out.println("the sum is "+sum);
        }


    }
}
