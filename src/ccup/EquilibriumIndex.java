package ccup;

/**
 * Author: Bryan Lee
 * Date: 10/10/16
 */
public class EquilibriumIndex {
    /**
     * Equilibrium index of an array is an index such that the sum of
     * elements at lower indexes is equal to the sum of elements at higher
     * indexes.
     For example, in an array A:
     A[0] = -7, A[1] = 1, A[2] = 5, A[3] = 2, A[4] = -4, A[5] = 3, A[6]=0

     3 is an equilibrium index, because:
     A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

     6 is also an equilibrium index, because sum of zero elements is zero,
        i.e., A[0] + A[1] + A[2] + A[3] + A[4] + A[5]=0
     */

    /**
     1) Initialize leftsum as 0
     2) Get the total sum of the array as sum
     3) Iterate through the array and for each index i, do following.
     a)  Update sum to get the right sum.
     sum = sum - arr[i]
     // sum is now right sum
     b) If leftsum is equal to sum, then return current index.
     c) leftsum = leftsum + arr[i] // update leftsum for next iteration.
     4) return -1 // If we come out of loop without returning then
     // there is no equilibrium index
     */

    public int equilIndex(int[] a) {
        int leftsum = 0;
        int totalSum = 0;
        for (int n : a) {
            totalSum+=n;
        }
        
        for (int i = 0; i < a.length; i++) {
            totalSum -= a[i];
            if(leftsum == totalSum)
                return i;
            leftsum += a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {-7,1,5,2,-4,3,0};
        EquilibriumIndex e = new EquilibriumIndex();
        System.out.println(e.equilIndex(a));
    }
}
