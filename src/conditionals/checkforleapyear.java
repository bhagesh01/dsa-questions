package conditionals;
import java.util.Scanner;
public class checkforleapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a (4-digit)year number:");
        int year = sc.nextInt();

        if(year%4 == 0){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is a normal year");
        }

    }
}
