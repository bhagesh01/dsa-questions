package conditionals;

import java.util.Scanner;

public class checkingpointlyingcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x coordinate (x)");
        int x = sc.nextInt();
        System.out.println("enter the y coordinate (y)");
        int y = sc.nextInt();
        System.out.println("enter the x1 coordinate (x1)");
        int x1 = sc.nextInt();
        System.out.println("enter the y1 coordinate (y1)");
        int y1 = sc.nextInt();
        System.out.println("enter the value of radius(r)");
        int r = sc.nextInt();

        int d = ((x-x1)*(x-x1))+((y-y1)*(y-y1));
        System.out.println("the distance is: "+d);

        if(d > (r*r)){
            System.out.println("the point lies outside the circle.");
        } else if (d < (r*r)) {
            System.out.println("point lies inside the circle");
        }
        else{
            System.out.println("point is on the circle");
        }

//        int x = 3;
//        double y = 3.0;
//        if(x==y)
//            System.out.println("x and y are equal");
//        else System.out.println("x and y are not equal");
//// output = x and y are equal.

        // *********************************************************
        // ternary operator
//        String ans ;
//        ans = (condition) ? true : false;
    }
}
