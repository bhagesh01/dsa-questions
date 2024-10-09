package LinkedList;

public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }

//    public static class linkedList {
//        Node head = null;
//        Node tail = null;
//
//        void inserAtEnd(int val) {
//            Node temp = new Node(val);
//            if (head == null) {
//                head = temp;
//            } else {
//                tail.next = temp;
//            }
//            tail = temp;
//        }
//
//        void deleteNthNodeFromEnd(int index){
//            Node res = new Node(0);
//            res.next = head;
//            Node fast = head;
//            Node slow  = res;
//
//
//            for(int i=0;i<index;i++){
//                fast = fast.next;
//            }
//
//            while(fast != null){
//                fast = fast.next;
//                slow = slow.next;
//            }
//
//            slow.next = slow.next.next;
//            res.next = head;
//
//
//
//
//        }
//
//    }

    public static void displayReverse(Node head){
        Node temp  = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp =  temp.prev;
        }
        System.out.println();
    }
    public static void display(Node head){
        Node temp  = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp =  temp.next;
        }
        System.out.println();
    }

    public static void displayRandom(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp =  temp.prev;
        }

//        Node temp2 = temp.next;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

//        Node a = new Node(4);
//        Node b = new Node(100);
//        Node c = new Node(23);
//        Node d = new Node(54);
//        Node e = new Node(92);
//
//        a.prev = null;
//        a.next = b;
//        b.prev = a;
//        b.next = c;
//        c.prev = b;
//        c.next = d;
//        d.prev = c;
//        d.next = e;
//        e.prev = d;
//        e.next = null;
//
//        displayReverse(e);
//        display(a);
//        displayRandom(d);

        StringBuilder str1 = new StringBuilder();
        str1.append(12);
        String s = str1.toString();
    }
}
