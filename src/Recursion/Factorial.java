package Recursion;

public class Factorial {

    static int factorial(int  n){
       if(n == 0) return 1;
//       int smallAns = factorial(n-1);
//       int ans = n * factorial(n-1);

       return n * factorial(n-1);
    }

    static int fibonacciSeries(int n){
        if(n == 0 || n == 1) return n;
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);

    }
    public static void main(String[] args) {
        System.out.println("the factorial answer is: "+ factorial(5));;
        System.out.println("the fibonaci series answer is answer is: "+ fibonacciSeries(8));;
    }
}
