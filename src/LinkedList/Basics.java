package LinkedList;

import java.util.List;

public class Basics {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;

       static void InsertAtEnd(int val){

        }
    }

    static void inertInto(Node n , int index){

    }
//    static void ListDisplay(Node head){
//        // recursive way of souting the linkedlist.
//        if(head == null) return;
//        System.out.print(head.data + " ");
//        ListDisplay(head.next);
//    }



//    static void ListDisplayReverse(Node head){
//        if(head == null) return;
//        ListDisplayReverse(head.next);
//        System.out.print(head.data + " ");
//    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(6);
        Node c = new Node(9);
        Node d = new Node(199);
        a.next = b;
        b.next = c;
        c.next = d;




        // Q)displaying the list.
//        Node temp  = a;
//        int count=0;
////      simple way of doing this
//     while(temp != null){
////             System.out.print(temp.data + " ");
//             count++;
//                 temp = temp.next;
//     }
//
//        System.out.println("The length of the list is: " + count);



//        Q) inert into any address



//        ListDisplayReverse(a);
    }
}
