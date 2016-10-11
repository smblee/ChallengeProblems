package cci.ch1;

/**
 * Author: Bryan Lee
 * Date: 10/9/16
 */
public class C12 {
    // reverse a string
    public char[] reverse(char[] a) {
        int i = 0; int j = a.length-1;
        while (i != j) {
            swap(a, i , j);
            i++;
            j--;
        }
        return a;
    }

    public void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        C12 c = new C12();
        char[] a = {'a','b','c'};
        System.out.println(c.reverse(a));
    }
}
