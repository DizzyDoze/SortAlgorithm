package src;

/**
 * In-place swap
 * Not stable, the last duplicate will be swapped, relative order changed
 * for i rounds, select the smallest item in the rest of the list
 */
public class SelectionSort {

    public void sort(int[] arr, int start, int end){
        for (int i=start; i <= end; i++){
            for (int j = i + 1; j <= end; j++){
                // compare to arr[i], update smallest index
                int smallestIndex = i;
                if (arr[j] < arr[smallestIndex]){
                    smallestIndex = j;
                }
                swap(arr, i, smallestIndex);
            }
        }
    }

    /**
     * Helper function, swap arr[i] and arr[j] in-place.
     * @param arr  original array
     * @param i    index i
     * @param j    index j
     */
    private void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
