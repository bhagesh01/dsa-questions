package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enert you string : ");
        String str = sc.nextLine();

        boolean flag = true;
        int i=0; int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
            }
            i++;
            j--;
        }

        if(flag == true) System.out.println("It is a palindrome");
        else System.out.println("NOt a palindrome");


    }
}
