package LinkedList;

import java.util.Scanner;

public class ListToArray {


    public static class Node {
        int data;
        Node next;

        Node(int data) {
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
        for(int i=0;i<4;i++){
            System.out.println("Enter the element: ");
            int num = sc.nextInt();
            l1.insertAtEnd(num);
        }


        int[] arr = new int[100000];
        Node temp = l1.head;
        int size = 0;
        while(temp != null){
            arr[size++] = temp.data;
            temp = temp.next;
        }

        int m= size/2;
        int max = 0;
        for(int i=0;i<m;i++){
            --size;
            if(arr[i]+arr[size] > max){
                max = arr[i]+arr[size];
            }
        }
        System.out.println("The max sum is: "+max);
    }

}
