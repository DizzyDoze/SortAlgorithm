package src;

/**
 * src.ShakerSort/CocktailSort, variation of bubbleSort
 * the largest element to the right 0-->n-1
 * the smallest element to the left 0<--n-2
 * the largest element to the right 1-->n-2
 * the smallest element to the left 1<--n-3
 * ...
 * Stable
 * O(n^2)
 */
public class ShakerSort {

    public void sort(int[] arr, int start, int end){
        // two pointers, start and end
        while (start < end){
            bigForward(arr, start, end);
            end--;      // largest element at index end sorted
            smallBackward(arr, start, end);
            start++;    // smallest element at index start sorted
        }
    }

    private void bigForward(int[] arr, int start, int end){
        // last i elements are sorted, i can't reach end, i + 1 out of boundary
        for (int i = start; i < end; i++) {
            if (arr[i] > arr[i+1]){
                swap(arr, i, i+1);
            }
        }
    }

    private void smallBackward(int[] arr, int start, int end){
        // first i elements are sorted, i can't reach start, i - 1 out of boundary
        for (int i = end; i > start ; i--) {
            if (arr[i] < arr[i-1]){
                swap(arr, i, i-1);
            }
        }
    }

    private void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
