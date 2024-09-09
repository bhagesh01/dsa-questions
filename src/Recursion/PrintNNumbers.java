package Recursion;

public class PrintNNumbers {
    static void printNumbers(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
//        System.out.println(n);
    }
    public static void main(String[] args) {
        printNumbers(10);
        printNumbers(20);
    }
}
