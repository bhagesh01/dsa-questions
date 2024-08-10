package Instagram;

import java.util.Scanner;
//Q) In this dsa question you have given
// an array and a index{signifies the place of the person in a queue}
// you have to return the time taken to buy the tickets by that person.
// if dont got (leetcode - 2073)

// example {5,1,1,1} and k=0;
// time  = 8,
// how --> if first person of the arraybuys a ticket
// (the number of remaining tickets to buy are 4 by that person.)
// and all remaining peoples tickets gets to 0.

public class TicketBuying {
    static int buyingticket(int[] arr , int k){
        int n= arr.length;
        int time = 0;
        for(int i=0;i<n;i++){
            if(i<=k){
                time = time + Math.min(arr[i],arr[k]);
            }else{
                time = time + Math.min(arr[i],arr[k]-1);
            }
        }

        return time;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];

        System.out.println("Enter the persons number in queue {in between the size range }:");
        int k = sc.nextInt();

        System.out.println("Enter the " + size +" elements of the array :");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Time taken to buy the tickets is : "+buyingticket(arr1,k));
    }
}
