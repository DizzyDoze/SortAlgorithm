package src;

/**
 * partition(divide) recursively
 * merge sorted arrays, only send in pointer, start, mid, end
 * O(NlogN)
 */
public class MergeSort {
    public void sort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
    }

    private void mergeSort(int[] arr, int start, int end){
        // start >= end, no more partition needed
        if (start < end){
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    /**merge sorted result from start to mid and mid to end, copy the result back to original array*/
    private void merge(int[] arr, int start, int mid, int end){
        int i = start;  // pointer for left part
        int j = mid + 1;    // pointer for right part
        int k = start;      // pointer for temp array with sorted result
        int[] temp = new int[arr.length];
        while (i <= mid && j <= end){       // inclusive
            if (arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // handle the rest of the elements in the longer array
        while (i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end){
            temp[k] = arr[j];
            j++;
            k++;
        }
        // copy temp back to same part of original array
        for (int l = start; l <= end; l++) {
            arr[l] = temp[l];
        }
    }
}
