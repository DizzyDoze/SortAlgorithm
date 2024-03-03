package src;

/**
 * By default, the last element is pivot
 * Return correct index for each round
 * O(NlogN)
 */
public class QuickSort {

    public void sort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int start, int end){
        // start >= end, no more partition needed
        if (start < end){
            int correctIndex = partition(arr, start, end);
            // correctIndex is sorted, skip it
            quickSort(arr, start, correctIndex - 1);
            quickSort(arr, correctIndex + 1, end);
        }
    }

    /**divide array into small|correct|large, and return correctIndex*/
    private int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start;
        int j = end - 1;
        // Always check boundary first
        while (i <= j){
            // when arr[i] > pivot, bigger element on the left is found
            while (i < end && arr[i] <= pivot){
                i++;
            }
            // when arr[j] < pivot, smaller element on the right is found
            while (j >= start && arr[j] >= pivot){
                j--;
            }
            // check boundary before swap
            if (i < j){
                swap(arr, i, j);
            }
        }
        // swap pivot back to i, the correctIndex
        swap(arr, i, end);
        return i;
    }

    private void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
