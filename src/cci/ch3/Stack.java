package cci.ch3;

import cci.ch3.Node;

/**
 * Author: Bryan Lee
 * Date: 10/9/16
 */
public class Stack {
    Node top;
    int capacity;
    int count;
    Object pop() {
        if (top != null) {
            Object item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    void push(Object o) {
        Node n = new Node(o);
        if (top == null) {
            top = n;
        } else {
            top.next = n;
        }
    }

    Object peek() {
        return top.data;
    }
}
