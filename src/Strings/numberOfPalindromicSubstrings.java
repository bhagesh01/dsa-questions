package Strings;

import java.util.Scanner;

public class numberOfPalindromicSubstrings {
    static String reverse(String s){
        int i=0;int j=s.length()-1;
        StringBuilder str = new StringBuilder(s);
        while(i<j){
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
            i++;
            j--;
        }
        s = str.toString();
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        StringBuilder str1 = new StringBuilder(s);

        int n = s.length();
        int count =0;
        for(int i=0;i<n+1;i++){
            for(int j=i+1;j<n+1;j++){
                String check1 = str1.substring(i,j);
                String check2 = reverse(check1);
                if(check1.equals(check2)){
                    count++;
                }
            }
        }

        System.out.println("there are " + count + " number of plaindromic substrings.");

    }
}
