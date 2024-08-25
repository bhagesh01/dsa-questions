package LinkedList;

import java.util.Scanner;

public class IntersectionOftwoLinkedList {
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

    }

        public static void main(String[] args) {
            linkedList l1  = new linkedList();
            linkedList l2  = new linkedList();
            Scanner sc = new Scanner(System.in);
            int n=  5;
            int n2 = 6;


            for(int i=0;i<n2;i++){
                System.out.println("Enter the element for the l1 list :");
                int num = sc.nextInt();
                l1.inserAtEnd(num);
            }


            for(int i=0;i<n;i++){
                System.out.println("Enter the element for the l2 list :");
                int num = sc.nextInt();
                l2.inserAtEnd(num);
            }


            int length = Math.max(n,n2);

            Node headl1  = l1.head;
            Node headl2 = l2.head;
            Node crap  =new Node(-1);
           while(headl1 != null && headl2 != null){
               if(headl1.data == headl2.data && headl1.next.data == headl2.next.data){
                   System.out.println("The inersection element is :" + headl1.data);
                   return;
               }
               headl1 = headl1.next;
               headl2 = headl2.next;
           }









//            Node temp = l1.head;
//            while(temp != null){
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//            System.out.println();
//            Node temp2 = l2.head;
//            while(temp2 != null){
//                System.out.print(temp2.data + " ");
//                temp2 = temp2.next;
//            }


        }
}
