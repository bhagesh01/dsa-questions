package LinkedList;

import java.util.Scanner;

public class AraangeListInEvenOddManner {


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

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

        public static void main(String[] args) {
            linkedList l1 = new linkedList();

            Scanner sc = new Scanner(System.in);
            int n= 6;
            for(int i=0;i<n;i++){
                System.out.println("Enter the elem to insert inn l1: ");
                int num = sc.nextInt();
                l1.insertAtEnd(num);
            }

             linkedList l2 = new linkedList();
            Node fast1 = l1.head;
            Node fast2 = l1.head.next;

            while(fast1 != null && fast1.next != null){
                l2.insertAtEnd(fast1.data);
                fast1 = fast1.next.next;
            }
            while(fast2 != null && fast2.next != null){
                l2.insertAtEnd(fast2.data);
                fast2 = fast2.next.next;
            }


            l2.display();


        }
}
