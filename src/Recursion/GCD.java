package Recursion;

public class GCD {
    static int GCDfunc(int x,int y){
        if(x == 0) return x;
        if(y == 0) return y;
        if(x == y) return x;
        if(x>y){
            return GCDfunc((x-y),y);
        }
        return GCDfunc(x,(y-x));

    }

    public static void main(String[] args) {
        System.out.println("the gcd of numbers is: "+GCDfunc(10,3));
    }
}
