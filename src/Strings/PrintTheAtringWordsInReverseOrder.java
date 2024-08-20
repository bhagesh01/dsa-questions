package Strings;

import java.util.Scanner;

public class PrintTheAtringWordsInReverseOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the the sentence: ");
        String s = sc.nextLine();

        String[] words = s.split("\\W+");

        int i=0;int j= words.length-1;
        while(i<j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;

            i++;
            j--;
        }


        StringBuilder reverse = new StringBuilder();
        for(String e : words){
            reverse.append(e);
            reverse.append(' ');
        }

        String string = reverse.toString();

        System.out.println(string);

    }
}
