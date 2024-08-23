package LinkedList;

import java.util.Scanner;

public class FindnthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{
        Node head  = null;
        Node tail = null;

        void findNodeNth(int index){
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            System.out.println("the node you are looking for is : "+ temp.data);
        }

        void insertAtEnd(int val){
            Node rage  = new Node(val);
            if(head == null){
                head = rage;
            }
            else {
                tail.next = rage;
            }

            tail = rage;
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return  count;
        }

    }

    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        Scanner sc = new Scanner(System.in);
//        int num = Integer.MIN_VALUE;
        for(int i=0;i<6;i++){
//            num = (int)(Math.random() * 100);
            System.out.println("Enter the element to insert : ");
            int num = sc.nextInt();
            l1.insertAtEnd(num);
        }

        int n = 2;
        int index = l1.size()-n;
        l1.findNodeNth(index);



    }
}
