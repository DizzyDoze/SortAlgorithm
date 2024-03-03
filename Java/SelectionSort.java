import java.util.Arrays;

/**
    In-place swap
    Not stable, the last duplicate will be swapped, relative order changed
    for i rounds, select the smallest item in the rest of the list
 */
public class SelectionSort {

    public static void selectionSort(int[] arr){
        for (int i=0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
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
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 9, 77, 23, 12, 61};
        System.out.println("Before: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
