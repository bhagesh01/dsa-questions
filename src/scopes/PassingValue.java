package scopes;

public class PassingValue {
    static void changeValue(int a){
        a *= 100;
        System.out.println("inside change value  "+a);
    }
    public static void main(String[] args){
     int a = 10;
        System.out.println("value before call / changing  "  + a);
        changeValue(a);
        System.out.println("value after call / changing  " + a);
        // there occur no change in value because the java uses pass by value method where the changeValue(a) creates a new "a" which dosen't allow change in value.
        // if we have passed by reference {where we pass the address of the value} then the value changes.

    }
}
