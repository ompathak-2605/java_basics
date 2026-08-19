
public class basearray {
    /***Practice Questions:**
1. Print all elements of an array in reverse order without using an extra array.
2. Find the sum and average of all elements in an array.
3. Find the largest and smallest element in an array in a single traversal.
4. Print all elements at even indices, then all at odd indices.
5. Count how many elements are greater than the average of the array.

--- */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println();
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Sum of all elements is " + sum);
        double average = (double) sum / arr.length;
        System.out.println("Average of all elements is " + average);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x > largest) {
                largest = x;
            }
            if (x < smallest) {
                smallest = x;
            }
        }
        System.out.println("Smallest value of this array is " + smallest);
        System.out.println("Largest value of this array is " + largest);
        System.out.println("Even indexes");
        for (int i = 0; i <= arr.length - 1; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("odd indexes");
        for (int i = 1; i <= arr.length - 1; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
        int count = 0;
        for (int x : arr) {
            if (x > average) {
                count++;
            }
        }
        System.out.println();
        System.out.println(count + " elements are greater then average");

    }
}
