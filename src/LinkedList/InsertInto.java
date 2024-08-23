package LinkedList;
import java.util.*;

public class InsertInto {
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
            Node temp  = new Node(val);
           if(head == null){
               head = temp;
           }
           else {
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

        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            System.out.println();
            System.out.println("The size of the linkedlist is: " +count);
            return count;
        }

        void insertAtBegging(int val){
             Node temp = new Node(val);
             if(head != null){
                 temp.next = head;
                 head = temp;
             }
             else{
                 insertAtEnd(val);
             }

        }

        void insertInBetween(int index ,int val){
            Node t = new Node(val);
            Node temp = head;
            if(index == size()){
                insertAtEnd(val);
                return;
            }
            else if(index == 0){
                insertAtBegging(val);
                return;
            } else if (index<0) {
                System.out.println("Ijjat mae sahi number dalo ");
                return;
            }
            else if(index>size()){
                System.out.println("index provided is out bounds for the linkedlist.");
                return;
            }

            for(int i=0;i<=index-1;i++){
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;
        }

        void deleteElem(int index){
             Node temp = head;
             if(index > size()){
                 System.out.println("Index is out of bounds.");
                 return;
             }
             for(int i=0;i<index-2;i++){
                 temp = temp.next;
             }

             if(head == null){
                 System.out.println("list is empty {pehle se he khali aur kitna delete kru}");
                 return;
             }
             else if(index == 0){
                 head = temp.next;
             }
             else if(index == size()){
                 tail = temp;
             }
             temp.next  = temp.next.next;
        }

        void getelem(int index){
             Node temp = head;
             if(index>size() && index<0){
                 System.out.println("Index given is out of bounds. or worng index given");
             }
             for(int i=0;i<index;i++){
                 temp = temp.next;
             }
             if(head == null){
                 System.out.println("The list is empty");
             }
            System.out.println("The element is " + temp.data + " at " + index+"th position");

        }

    }


    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        Scanner sc = new Scanner(System.in);
//        int num = Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
//            num = (int)(Math.random() * 100);
            System.out.println("Enter the element to insert : ");
            int num = sc.nextInt();
            l1.insertAtEnd(num);
        }

//        l1.display();
//        l1.size();
//        l1.insertAtBegging(1000);
//        l1.display();
//        l1.size();


//        l1.insertInBetween(4,999);
//        l1.display();

//        l1.deleteElem(44);
        l1.getelem(3);
//        l1.display();
//        System.out.println();
//        System.out.println("This is  the tail data: "+l1.tail.data);
//        System.out.println("This is  the tail data: "+l1.head.data);
//        l1.size();
//
//        System.out.println(l1.tail.data);
//        System.out.println(l1.head.data);

//        l1.deleteElem(3);
    }
}
