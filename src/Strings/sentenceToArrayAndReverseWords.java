package Strings;

public class sentenceToArrayAndReverseWords {
    static String reverse(String s){
        StringBuilder str = new StringBuilder(s);
        int i=0;int j=s.length()-1;
        while(i<j){
            char temp = str.charAt(i);
            str.setCharAt(i , str.charAt(j));
            str.setCharAt(j , temp);
            i++;
            j--;
        }

        s = str.toString();
        return s;
    }
    public static void main(String[] args) {
        String s = "This is a sample sentence with bobby.";
        String[] words = s.split("\\W+");


        System.out.println("array to string: " + words.toString());
//        System.out.println("Array before the reversing : ");
//        for(String e : words){
//            System.out.print(e + " , ");
//        }
//
//
//
//        for(int i=0;i<words.length;i++){
//            String temp = reverse(words[i]);
//            words[i] = temp;
//        }
//
//        System.out.println();
//        System.out.println();
//
//
//        System.out.println("Array aftre the reversing : ");
//        for(String e : words){
//            System.out.print(e + " , ");
//        }

    }
}
