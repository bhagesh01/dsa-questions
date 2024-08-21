package Strings;

public class CheckIfTwoStringArraysareEquivalent {
    public static void main(String[] args) {
        // you can also take teh user input rather tha the hardcoded one.
        String[] word1 = {"a" , "bc"};
        String[] word2 = {"ab" , "c"};
        StringBuilder strB1 = new StringBuilder();
        StringBuilder strB2 = new StringBuilder();

        for(String e : word1){
            strB1.append(e);
        }
        for(String e : word2){
            strB2.append(e);
        }

        boolean flag  = false;

        if(strB1.toString().equals(strB2.toString())){
            flag = true;
        }


        System.out.println("The answer is : "+flag);
    }
}
