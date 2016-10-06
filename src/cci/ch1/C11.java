package cci.ch1;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Author: Bryan Lee
 * Date: 10/5/16
 */
public class C11 {
    /**
     * Implement an algorithm to determine if a string has all unique
     * characters. What if you cannot use additional data structures?
     */

    // O(n)
    public boolean uniqueChars(String s) {
        if (s.length() < 2) return true;
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c))
                return false;
            set.add(c);
        }
        return true;
    }

    // O(n log n)
    public boolean uniqueCharsNoDS(String s) {
        if (s.length() < 2) return true;
        char[] ca = s.toCharArray();
        Arrays.sort(ca); // use quicksort for space complexity of O(1)
        char prev = ca[0];
        for (int i = 1; i < ca.length; i++) {
            if (prev == ca[i]) {
                return false;
            }
            prev = ca[i];
        }
        return true;
    }

    public static void main(String[] args) {
        C11 c = new C11();
        System.out.println(c.uniqueCharsNoDS(""));
        System.out.println(c.uniqueCharsNoDS("a"));
        System.out.println(c.uniqueCharsNoDS("abcdef"));
        System.out.println(c.uniqueCharsNoDS("abcdefd"));
    }
}
