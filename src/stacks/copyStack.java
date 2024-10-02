package stacks;

import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();


        for(int i=0;i<10;i++){
            st.push(i);
        }
        System.out.println(st);

        Stack<Integer> st2 = new Stack<>();
        int[] arr = new int[st.size()];
        int k = 0;
        while(!st.isEmpty()){
            arr[k++] = st.peek();
            st.pop();
        }
        for(int j=arr.length-1;j>-1;j--){
            st2.push(arr[j]);
        }

        System.out.println(st2);
    }
}
