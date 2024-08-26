package LinkedList;

import java.util.Scanner;

public class rtemoveDuplicates {

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
        for(int i=0;i<5;i++){
            System.out.println("Enter the element: ");
            int num = sc.nextInt();
            l1.insertAtEnd(num);
        }



        Node temp1 = l1.head;
        Node temp2  = l1.head.next;
        while(temp2 != null){
            if(temp1.data == temp2.data){
                temp2 = temp2.next;
                l1.head.next = temp2;
                temp1 = temp1.next;
            }
                temp1 = temp1.next;
                temp2 = temp2.next;

        }


        l1.display();
    }
}
