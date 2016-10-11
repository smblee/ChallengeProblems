package ccup;

/**
 * Author: Bryan Lee
 * Date: 10/10/16
 */
public class LargeSmall {
    /**
     * Find the largest and smallest number in a list. The list is stored as
     * two sections, one in ascending order and the other in descending order.

     input [ 2 3 4 5 6 7 10 9 8 7]
     smallest : 2
     Largest 10
     */

    // smallest will be either at 0 or a.length-1
    // largest

    // O(n log n)
    public int getMax(int[] a) {
        if (a.length == 0) return -1;
        if (a.length == 1) return a[0];
        if (a.length == 2) return a[0] > a[1] ? a[0] : a[1];
        //int smallest = Math.min(a[0], a[a.length-1]);
        int start = 0;
        int end = a.length-1;
        int middle = (start + end) / 2;
        while (! (a[middle] > a[middle-1] && a[middle] > a[middle+1]) ) {
            if(a[middle+1] > a[middle])
                middle = (middle + end) / 2;
            else
                middle = (start + end) / 2;
        }
        return a[middle];
    }

    public static void main(String[] args) {
        LargeSmall ls = new LargeSmall();
        int[] a = {2,3,4,5,6,7,10,9,8,7};
        System.out.println(ls.getMax(a));
    }
}
