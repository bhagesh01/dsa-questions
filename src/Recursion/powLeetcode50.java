package Recursion;

import java.text.DecimalFormat;

public class powLeetcode50 {
    static double something(double d){
        DecimalFormat df = new DecimalFormat("#.00000");
        String formatted = df.format(d);
        double result = Double.parseDouble(formatted);
        return result;
    }
    public static void main(String[] args) {
        double d = 1234.6753893435;

        System.out.println(something(d));

    }
}
