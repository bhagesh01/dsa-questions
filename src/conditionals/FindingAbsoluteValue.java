package conditionals;

import java.util.Scanner;

public class FindingAbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  a integer value");
        int a = sc.nextInt();

        if(a<0){
            System.out.println("the absolute of integer is "+ (-a));
        }
        else{
            System.out.println("the absolute of the integer is "+a);
        }


    }
}
