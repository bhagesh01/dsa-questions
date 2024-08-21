package Strings;

public class DeleteColumnstoMakeSorted {
    static boolean check(String s){
        boolean flag = false;
        for(int i=0;i<s.length();i++){
            if(i == s.length()-1){
                break;
            }
            else if((int)s.charAt(i) < (int)s.charAt(i+1)){
                    flag = true;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        String[] words = {"cba","daf","ghi"};

        System.out.println(check("bah"));
//
//        int n = words.length;
//        StringBuilder str = new StringBuilder();
//        int count = 0;
//        int k=0;
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                str.append(words[j].charAt(k));
//            }
//
//            if(!check(str.toString())){
//                count++;
//                k++;
//                str.delete(0,str.length());
//            }
//            else{
//                k++;
//                str.delete(0,str.length());
//            }
//        }
//
//        System.out.println("The columns to be deleted: "+count);
    }
}
