package conditionals;

import java.util.Scanner;

public class tellifitisthreedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int a = sc.nextInt();

         if (a>99 && a<1000){
             System.out.println("the input is a three digit positive number");
         } else if (a<-99 && a>-1000) {
             System.out.println("it's a three digit negative number");
         } else{
             System.out.println("it's not a three digit input");
         }
    }
}
