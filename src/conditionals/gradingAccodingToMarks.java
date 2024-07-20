package conditionals;

import java.util.Scanner;

public class gradingAccodingToMarks {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the marks of the student: ");
        int marks = sc.nextInt();

        if(marks>90 && marks<=100){
            System.out.println("you have got Excellent marks & your grade is 'A'");
        } else if (marks>80 && marks<=90) {
            System.out.println("You have got VERY GOOD marks and your grade is 'B'");
        } else if (marks>70 && marks<=80) {
            System.out.println("You have got GOOD marks and your grade is 'C'");
        } else if (marks>60 && marks<=70) {
            System.out.println("you can do better and you have got 'D' grade");
        }
        else if (marks>50 && marks<=60) {
            System.out.println("you have got AVERAGE marks and you have got 'E' grade");
        }
        else if (marks>40 && marks<=50) {
            System.out.println("you have got bellow average marks and you have got 'D' grade");
        }
        else{
            System.out.println("you have failed your exam");
        }

    }
}
