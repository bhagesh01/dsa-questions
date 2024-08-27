package LinkedList;

import java.util.Scanner;

public class LifeCycleII {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }
    public static class linkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }

            tail = temp;
        }
    }

    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        Scanner sc = new Scanner(System.in);
        int n = 6;
        for(int i=0;i<n;i++){
            System.out.println("Enter the element : ");
            int num = sc.nextInt();
            l1.insertAtEnd(num);
        }



//        if(temp == null) return temp;
//        if(head.next == null) return head.next;

        Node slow = l1.head;
        Node fast = l1.head;

        while(fast != null){
            if(slow.next == null) return;
            slow = slow.next;
            if(fast.next == null) return;
            fast = fast.next.next;
            if(slow == fast) break;
        }


        Node temp = l1.head;

        while(temp != slow){
            if(temp.next == null) return;
            temp = temp.next;
            if(slow.next == null) return;
            slow = slow.next;
        }

        System.out.println(slow.data);

//        Node temp = l1.head;
//        for(int i=0;i<n;i++){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

    }
}
