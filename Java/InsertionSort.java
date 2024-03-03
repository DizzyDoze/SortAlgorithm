import java.util.Arrays;

/**
 * In place
 * Stable, it maintains the relative order
 * O(n^2)
 */
public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            // save current element, found the place to insert
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr){
                // replace; be careful, > is stable, >= is not stable
                arr[j+1] = arr[j];
                j--;
            }
            // insertion spot found
            arr[j+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 9, 77, 23, 12, 61};
        System.out.println("Before: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
