package stacks;

import java.util.Stack;

public class displayRecursively {

    static void reverseDisplay(Stack<Integer> st){

        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        for(int i=1;i<11;i++){
            st.push(i);
        }
        reverseDisplay(st);
    }
}
