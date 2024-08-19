package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
//        Integer x = Integer.valueOf(9);
//        System.out.println("the number is : "+x);

        // the Integers are the wrapper classes used for general purposes.


        ArrayList<Integer> list = new ArrayList<>();

        int x = 1;
        // inserting elements into the arraylist.
        for(int i=0;i<10;i++){
            list.add(x++);
        }

        // souting the elements.
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i) + " ");
//        }



        // inserting element into any index i.
//        list.add(index ,element);
//        list.add(2 ,999);


        // modifying element at index i
//        list.set(2 ,166);

        //removing element at index i.
//        list.remove(2);



        // removing a particulatr element from the arraylist not by
//        index but by the actual value
//        list.remove(Integer.valueOf(9));


        // checking if the element is in the list.
//        boolean check = list.contains(Integer.valueOf(27));
//        System.out.println("the ans is: "+check);
        // output = false

//        -------------------------
//        boolean check = list.contains(Integer.valueOf(7));
//        System.out.println("the ans is: "+check);
        // output true.

//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i) + " ");
//        }
    }
}
