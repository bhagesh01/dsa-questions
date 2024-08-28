package LinkedList;

import java.util.Scanner;

public class MiddleElemnet {
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

        Scanner sc = new Scanner(System.in);
        int n=  5;

        for(int i=0;i<n;i++){
            System.out.println("Enter the element for the l1 list :");
            int num = sc.nextInt();
            l1.inserAtEnd(num);
        }

        Node temp = l1.head;
        if(n%2 == 1){
            for(int i=0;i<(n/2);i++){
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
        else{
            for(int i=0;i<(n/2);i++){
                temp = temp.next;
            }
            System.out.println(temp.next.data);
        }



    }

}
