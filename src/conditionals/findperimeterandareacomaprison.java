package conditionals;

import java.util.Scanner;

public class findperimeterandareacomaprison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length 0f rectangle(in cm):");
        int length = sc.nextInt();

        System.out.println("enter the breadth 0f rectangle(in cm):");
        int breadth = sc.nextInt();

        int area  = length * breadth;
        System.out.println("area of rectangle is "+area);
        int perimeter = 2 * (length+breadth);
        System.out.println("perimeter of rectangle is "+perimeter);

        if(area>perimeter){
            System.out.println("hence , the area of rectangle is greater than it's perimeter");
        }
        else{
            System.out.println("hence , the perimeter of rectangle is greater then it's area5");
        }

    }
}
