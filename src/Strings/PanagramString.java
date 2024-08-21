package Strings;


import java.util.ArrayList;
import java.util.Scanner;

//Q/) if string contains all the alphabet in it.
public class PanagramString {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog"; // or any sentence.
        int n = sentence.length();
        ArrayList<Character> list = new ArrayList<>();
        boolean flag  = false;
        int count = 0;


        if(n>=26){
            for(int i=0;i<n;i++){
                if(!list.contains(sentence.charAt(i))){
                    list.add(sentence.charAt(i));
                    count = count + 1;
                }
                if(count >= 26){
                    break;
                }
            }

            if(count == 26){
                flag = true;
            }
        }

        System.out.println("The " + sentence +" is Panagram and it a " + flag + " statement.");
    }
}
