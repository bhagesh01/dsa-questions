package Strings;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "abbannAAAAAAA";
        s = s.toLowerCase();
        System.out.println(s);

//        int n = s.length();
//        StringBuilder tempS = new StringBuilder(s);
//        StringBuilder str1 = new StringBuilder(tempS.substring(0,n/2));
//        StringBuilder str2 = new StringBuilder(tempS.substring(n/2));
//
//        System.out.println(str1);
//        System.out.println(str2);
//        int count1 = 0;
//        int count2 = 0;
//
//        for(int i=0;i<str1.length();i++){
//            char temp = str1.charAt(i);
//            char temp2 = str2.charAt(i);
//            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
//                count1++;
//            }
//            if(temp2 == 'a' || temp2 == 'e' || temp2 == 'i' || temp2 == 'o' || temp2 == 'u'){
//                count2++;
//            }
//
//        }
//
//        if(count1 == count2){
//            System.out.println("The strings are alike");
//        }
//        else{
//            System.out.println("The strings are not alike");
//        }
    }
}
