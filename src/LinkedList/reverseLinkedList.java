package LinkedList;

import java.util.Scanner;

public class reverseLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }


    public static void main(String[] args) {
        linkedList l1 = new linkedList();


        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++){
            System.out.println("Enter the element: ");
            int num = sc.nextInt();
            l1.insertAtEnd(num);
        }


        System.out.println("this is the list before reversing :");
        l1.display();

        Node agla = null;
        Node prev = null;
        Node curr = l1.head;

        while(curr != null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr=  agla;
        }


        System.out.println("this is the reversed list");
        l1.display();
    }


    private static int [] a = new int[100000];
    final int[] arr = a;

}
