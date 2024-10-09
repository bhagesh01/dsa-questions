package stacks;

import java.util.Stack;

public class insertAtBottomOrAnyIndex{
    static void inertAtBottom(Stack<Integer> st,int num){

        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        st.push(num);
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        System.out.println(st);
    }

    static void inertAtAnyIndex(Stack<Integer> st , int index ,int num){
        int len = st.size() - (index);
        Stack<Integer> st2 = new Stack<>();

        for(int i=0;i<len;i++){
            st2.push(st.pop());
        }

        st.push(num);

        while(!st2.isEmpty()){
            st.push(st2.pop());
        }

        System.out.println(st);
    }


    public static void main(String[] args) {
     Stack<Integer> st = new Stack<>();
     for(int i=0;i<10;i++){
         st.push(i);
     }


//        Stack<Integer> st2 = new Stack<>();
//     int num = 99 ;
//     while(!st.isEmpty()){
//         st2.push(st.pop());
//     }
//     st.push(num);
//     while(!st2.isEmpty()){
//         st.push(st2.pop());
//     }
//

        inertAtBottom(st,99);
        inertAtAnyIndex(st , 4,1001);


    }
}
