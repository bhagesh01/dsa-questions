package conditionals;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // switch(expression){
        // case x:
        // break;
        // case y:
        // break;
        //default:
        // code
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day number");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("it's monday");
                break;
            case 2:
                System.out.println("it's tuesday");
                break;
            case 3:
                System.out.println("it's wednesday");
                break;
            case 4:
                System.out.println("it's thursday");
                break;
            case 5:
                System.out.println("it's friday");
                break;
            case 6:
                System.out.println("it's saturday");
                break;
            default:
                System.out.println("it's sunday");
                break;

        }

        }




}
