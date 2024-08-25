package LinkedList;

import java.util.Scanner;

public class DeleteNthNodeFromEnd {

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

        void inserAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void deleteNthNodeFromEnd(int index){
            Node res = new Node(0);
            res.next = head;
            Node fast = head;
            Node slow  = res;


            for(int i=0;i<index;i++){
                fast = fast.next;
            }

            while(fast != null){
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            res.next = head;




        }

    }
        public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);
            linkedList l1 = new linkedList();
            System.out.println("Enter teh elements to enter :");
            for(int i=0;i<4;i++){
                int num = sc.nextInt();
                l1.inserAtEnd(num);
            }
            Node temp  = l1.head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            l1.deleteNthNodeFromEnd(2);
            Node temp2  = l1.head;
            while(temp2 != null) {
                System.out.print(temp2.data + " ");
                temp2 = temp2.next;
            }




        }
}
