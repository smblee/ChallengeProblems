package ccup;

/**
 * Author: Bryan Lee
 * Date: 10/5/16
 */
public class Surpasser {
    /**
     * The "surpasser" of an element in an array is defined as the number of
     * elements that are to the "right" and bigger than itself.

     Example:
     Array:
     [2, 7, 5, 5, 2, 7, 0, 8, 1]
     The "surpassers" are
     [5, 1, 2, 2, 2, 1, 2, 0, 0]

     [1,2,3,4,5,6,7] length = 7, piv = 3.

     Question: Find the maximum surpasser of the array.

     In this example, maximum surpasser = 5
     */

    public int findMaxSurpasser(int[] a) {
        // partition from i to j. Complexity: O (log n)
        // keep track of max surpasser.
        // last element will be 0 so don't loop for that. (optimization)
        if (a.length < 2) return 0;
        int max = 0;
        for (int i = 0; i < a.length-1; i++) {
            int[] sortingA = new int[a.length-i];
            System.arraycopy(a,i,sortingA,0, sortingA.length);
            // position of the pivot
            int pos = partition(sortingA);
            // count # of elements on right of pivot
            int diff = sortingA.length - pos - 1;
            max = Math.max(max, diff);
        }
        return max;
    }

    public int partition(int[] a) {
        int pivot = a[0];
        int i = 1;
        for (int j = 1; j < a.length; j++) {
            if (a[j] <= pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i-1, 0);
        return i-1;
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Surpasser s = new Surpasser();
        int[] a = {2, 0, 5, 5, 2, 7, 0, 8, 1, 2};
        System.out.println(s.findMaxSurpasser(a));
    }
}
