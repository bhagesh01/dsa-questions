package stacks;
import java.util.*;

public class basics {
    public static void main(String[] args) {
        Stack<Integer>  st= new Stack<>();

        for(int i=0;i<10;i++){
            st.push(i);
        }
//        System.out.println(st.peek());
//        for(int i=0;i<9;i++){
//            st.pop();
//        }
//        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
