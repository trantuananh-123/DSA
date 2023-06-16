package LinkedList;// Java program for reversing the linked list

import java.util.Scanner;

class Reverse {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Reverse list = new Reverse();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        head = new Node(sc.nextInt());
        Node temp = head;
        for (int i = 0; i < n - 1; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

        head = list.reverse(head);
        list.printList(head);
    }
}
