package cci.ch1;

/**
 * Author: Bryan Lee
 * Date: 10/9/16
 */
public class C18 {
    // find out if a string is a rotation of another string.

    public boolean isRotation(String a, String b) {
        int len = a.length();
        return b.length() == len && len > 0 && isSubstring(a + a, b);
    }

    public boolean isSubstring(String a, String b) {
        return a.contains(b);
    }

    public static void main(String[] args) {
        C18 c = new C18();
        System.out.println(c.isRotation("waterbottle", "erbottlewat"));
    }

}
