package cci.ch2;

import java.util.HashSet;

/**
 * Author: Bryan Lee
 * Date: 10/9/16
 */
public class C21 {
    // remove duplicates from an unsorted linked list
    void removeDups(Node h) {
        HashSet<Integer> set = new HashSet<>();
        Node prev = null;
        while (h != null) {
            if (set.contains(h.data)) {
                prev.next = h.next;
            } else {
                set.add(h.data);
                prev = h;
            }
            h = h.next;
        }
    }

    public static void main(String[] args) {
        C21 c = new C21();
        Node n = new Node(5);
        n.addNext(2).addNext(3).addNext(4).addNext(5);


        c.removeDups(n);
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}
