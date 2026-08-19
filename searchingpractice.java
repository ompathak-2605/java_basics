public class searchingpractice {
    /***Practice Questions:**
6. Implement binary search recursively.
7. Find the first and last occurrence of a target element in a sorted array (with duplicates).
8. Find the "floor" and "ceiling" of a target value in a sorted array.
9. Search in a rotated sorted array (e.g., `[4,5,6,7,0,1,2]`, target = `0`).
10. Find the peak element in an array (an element greater than both its neighbors).

--- */

    public static int[] findFirstLast(int[] arr, int target) {
        int first = findBound(arr, target, true);
        int last = findBound(arr, target, false);
        return new int[]{first, last};
    }

    // isFirst = true  -> find leftmost index
    // isFirst = false -> find rightmost index
    private static int findBound(int[] arr, int target, boolean isFirst) {
        int lo = 0, hi = arr.length - 1;
        int r_2 = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {
                r_2 = mid;              // record a candidate answer
                if (isFirst) {
                    hi = mid - 1;           // keep searching left half
                } else {
                    lo = mid + 1;           // keep searching right half
                }
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return r_2;
    }

    static int binarysearch(int[] arr, int t, int hi, int lo){
        if(lo>hi) return -1;
        int mid = lo+(hi-lo)/2;
        if(arr[mid]==t) return mid;
        else if(t<arr[mid]) return binarysearch(arr, t, mid-1, lo);
        else return binarysearch(arr, t, hi, mid+1);
    }
    static double[] florseal(double[] arr, double t){
        int hi = arr.length-1;
        int lo = 0;
        int mid = lo+(hi-lo)/2;
        
    }
    
    public static void main(String[] args) {
        int[] q_1 = {1,3,7,11,17,20,21,23,25,28,29,30};
        int[] q_2 = {1,4,5,5,6,7,9,9,9,9,10};
        double[] q_3= {1.3,2.9,5.8,6.2,10.7};
        int t_1 = 20;
        int t_2 = 9;
        double t_3 = 10.7;
        int lo =0;
        int hi = q_1.length-1;
        int r_1 = binarysearch(q_1,t_1, hi, lo);
        int[] r_2= findFirstLast (q_2, t_2);
        System.out.println(r_1);

        System.out.println("First occurance of "+t_2+" is at "+r_2[0]+"th index and Second occurance is at "+r_2[1]+"th index.");
    }
}
