package cci.ch1;

/**
 * Author: Bryan Lee
 * Date: 10/9/16
 */
public class C13 {
    // permutation or not
    public boolean isPermutation(String a, String b) {
        int[] chA = new int[128];
        for (char c: a.toCharArray()) {
            chA[c] += 1;
        }
        for (char c : b.toCharArray()) {
            if (--chA[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        C13 c = new C13();
        System.out.println(c.isPermutation("dog", "god"));
    }
}
