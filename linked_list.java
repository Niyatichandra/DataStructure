import java.util.Scanner;
import java.util.LinkedList;
public class linked_list {
    public static class Node {
        int data;
        Node next;
    }
    public static class LinkedList {
        Node head;
        Node tail;
        int size;


        void addlast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }

        public static void taverse(LinkedList list) {
            for (Node temp = list.head; temp != null; temp = temp.next) {
                System.out.println(temp.data);
            }
            System.out.println("size="+list.size);
            if (list.size > 0)
                System.out.println("last data="+list.tail.data);
        }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (true) {
            System.out.println("enter 1 to create list");
            System.out.println("enter 2 to create display");
            int n = sc.nextInt();
            switch (n) {
                case 1:System.out.println("enter data");
                       int x = sc.nextInt();
                       list.addlast(x);
                       break;
                case 2: taverse(list);
                       break;

            }
        }

    }



}
