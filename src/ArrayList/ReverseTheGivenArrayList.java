package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseTheGivenArrayList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the element: ");
        int n = sc.nextInt();
        ArrayList<Integer> l1 = new ArrayList<>();
        int x=0;
        for(int i=0;i<n;i++){
            l1.add(x++);
        }

        System.out.println("the prevois array of without reversing");
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+",");
        }
        System.out.println();




        // this is the dsa a way
//        int s= 0;
//        int t = l1.size()-1;
//        while(s<t){
//            int val1 = l1.get(s);
//            int val2 = l1.get(t);
//
//            l1.set(s,val2);
//            l1.set(t,val1);
//            s++;
//            t--;
//
//        }


        Collections.reverse(l1);

        System.out.println("after the reversing of the array: ");
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i) + ",");
        }




    }
}
