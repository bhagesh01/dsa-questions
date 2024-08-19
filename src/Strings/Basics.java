package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//        String name = "Ramesh lala";

//        char[] arr = new char[name.length()];
//
//        for(int i=0;i<name.length();i++){
//            arr[i] = name.charAt(i);
//        }



        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the sentence 1 : ");
//        String sentence = sc.nextLine();
////
//        System.out.println("Enter the sentence 2 : ");
//        String sentence2 = sc.nextLine();



        // check for the char index
//        System.out.println("The index of b : "+sentence.lastIndexOf("B"));

//        compairirng two strings

//        System.out.println(sentence.compareTo(sentence2));





        // contains or not in string

//        System.out.println(sentence.contains("R"));

//        System.out.println(sentence.toLowerCase());
        // DOSENT CHANGES THE ORIGINAL STRING.
//        System.out.println(sentence2.toUpperCase());
//        System.out.println(sentence.concat(sentence2));


//        System.out.println(99+"bhagesh"+10);
        // 99bhagesh10


//        System.out.println(sentence.substring(0,4));
        // or
//        System.out.println(sentence.substring(8));
//        System.out.println(sentence.substring(0));


        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
//        System.out.println(s1 == s3);// false == different address
//        System.out.println(s1==s2); // true === same address


//        System.out.println(s1.equals(s3)); // true for both.
        // this checks the address first and if the adres is different
        // then it checks the value of the string.







    }

}
