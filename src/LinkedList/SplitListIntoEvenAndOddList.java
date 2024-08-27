package LinkedList;

import java.util.Scanner;

public class SplitListIntoEvenAndOddList {
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
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }
        public static void main(String[] args) {
            linkedList l1 = new linkedList();
            linkedList evenL = new linkedList();
            linkedList oddL = new linkedList();
            Scanner sc = new Scanner(System.in);
            int n= 6;
            for(int i=0;i<n;i++){
                System.out.println("Enter the elem to insert inn l1: ");
                int num = sc.nextInt();
                l1.insertAtEnd(num);
            }


            Node temp = l1.head;
            int  countOdd = 0;
            int countEven = 0;
            while(temp != null){
                if(temp.data%2 == 1){
                    oddL.insertAtEnd(temp.data);
                    countOdd += 1;
                }
                else{
                    evenL.insertAtEnd(temp.data);
                    countEven += 1;
                }
                temp = temp.next;
            }



            oddL.display();
            System.out.println();
            evenL.display();




        }
}
