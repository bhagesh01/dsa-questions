package javabasics;

//   bitwise operators (works on bits(1/0))
// betwise and (&)
// betwise or (|)
// betwise exclusive OR (^)
// BITWISE compliment (~)
// left shift (<<)
// right shift (>>)
public class bitwiseOperators {
    public static void main(String[] args) {
        int p=9 , q = 10;

        System.out.println(p | q);
        System.out.println(q & q);
        System.out.println(p ^ q);

        System.out.println(p << 1);
        System.out.println(p << 2);

        System.out.println(q >> 1);
        System.out.println(q >> 2);
    }
}
