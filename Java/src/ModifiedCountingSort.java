package src;

/**
 * 1. Count the number and save to counting array
 * 2. Modify the counting array to startIndex array
 * 3. Backward to remain stable: put the number back to original array using original array based on startIndex
 * O(N)
 */
public class ModifiedCountingSort {

    public void sort(int[] arr, int maxValue){
        countingSort(arr, maxValue);
    }

    private void countingSort(int[] arr, int maxValue){
        int[] countArray = new int[maxValue + 1];

        // 1. Count the number and save to counting array
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }
        // 2. Modify the counting array to startIndex array
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i-1];
        }
        // 3. Backward to remain stable: put the number back to original array using original array based on startIndex
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            countArray[arr[i]]--;       // currentIndex should be -1
            result[countArray[arr[i]]] = arr[i];
        }
        // copy result back to original array
        System.arraycopy(result, 0, arr, 0, result.length);
    }
}
