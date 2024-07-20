package conditionals;

import java.util.Scanner;

public class profitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price:");
        double costPrice = sc.nextDouble();
        System.out.println("enter the selling price:");
        double sellingPrice = sc.nextDouble();

        if(sellingPrice>costPrice){
            System.out.println("shopkeeper has made profit");
            System.out.println("the profit made is  = "+(sellingPrice-costPrice));
        } else if (costPrice>sellingPrice) {
            System.out.println("shopkeeper has made loss");
            System.out.println("loss made is = " + (costPrice-sellingPrice));
        }


    }
}
