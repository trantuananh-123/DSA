package LinkedList;

import java.util.Scanner;

public class CountLength {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            newNode.next = head;
            head = newNode;
        }
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        System.out.println(count);
    }
}
