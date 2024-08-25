package LinkedList;

import java.util.Scanner;

public class deleteMiddleNode {
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


            Node temp = l1.head;
            if(n%2 == 1){
                for(int i=0;i<(n/2)-1;i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            else{
                for(int i=0;i<(n/2)-1;i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }

            temp = l1.head;
            for(int i=0;i<n-1;i++){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }
}
