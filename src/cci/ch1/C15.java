package cci.ch1;

/**
 * Author: Bryan Lee
 * Date: 10/9/16
 */
public class C15 {
    // compress string
    // aabcccccaaa -> a2b1c5a3
    // if compressed string is longer than original, then return original.

    public String compressString(String s) {
        StringBuffer sb = new StringBuffer();
        char curr = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (curr == s.charAt(i)) {
                count++;
            } else {
                sb.append(curr);
                sb.append(count);
                curr = s.charAt(i);
                count = 1;
            }
        }
        sb.append(curr);
        sb.append(count);
        return sb.length() > s.length() ? s : sb.toString();
    }

    public static void main(String[] args) {
        C15 c = new C15();
        System.out.println(c.compressString("aabcccccaaa"));
    }
}
