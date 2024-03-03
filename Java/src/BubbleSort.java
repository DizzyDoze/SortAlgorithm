package src;

/**
 * In-place
 * Stable, move the biggest element to the right, no swap during while key equals
 * O(n^2)
 */
public class BubbleSort {
     public void sort(int[] arr, int start, int end){
         for (int i = start; i <= end; i++) {
             // last i elements are sorted
             for (int j = 0; j < end - i; j++) {
                 // move largest element forward
                 if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                 }
             }
         }
     }

     private void swap(int[] arr, int i, int j){
         int tmp = arr[i];
         arr[i] = arr[j];
         arr[j] = tmp;
     }
}
