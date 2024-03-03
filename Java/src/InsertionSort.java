package src;

/**
 * In place
 * Stable, it maintains the relative order
 * O(n^2)
 */
public class InsertionSort {
    public void sort(int[] arr, int start, int end){
        for (int i = start + 1; i <= end; i++) {
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
}
