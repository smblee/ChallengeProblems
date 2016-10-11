package cci.ch3;

/**
 * Author: Bryan Lee
 * Date: 10/9/16
 */
public class Node {
    Node next = null;
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    Node addNext(Object n) {
        Node end = new Node(n);
        this.next = end;
        return this.next;
    }
}
