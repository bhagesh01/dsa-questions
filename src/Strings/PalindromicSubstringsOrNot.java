package Strings;

import java.util.Scanner;

public class PalindromicSubstringsOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the string: ");
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder(str);

        int n = str.length();
        boolean flag = true;
        for(int i=0;i<n+1;i++){
            for(int j=i+1;j<n+1;j++){
                StringBuilder subStr = new StringBuilder(s.substring(i,j));

                StringBuilder reversed = new StringBuilder();
                if(!subStr.toString().equals(reversed.toString())){
                    flag  = false;
                }
            }
        }


        if(!flag) System.out.println("it is not a plalindrome");
        else System.out.println("It is a palindrome and all of their strings also");
    }
}
