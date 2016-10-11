package cci.ch2;

/**
 * Author: Bryan Lee
 * Date: 10/9/16
 */
public class Node {
    Node next = null;
    int data;

    public Node(int data) {
        this.data = data;
    }

    Node addNext(int n) {
        Node end = new Node(n);
        this.next = end;
        return this.next;
    }
}
