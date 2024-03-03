import java.util.Arrays;

/**
 * In-place
 * Stable, bubble up the biggest element to the right
 * O(n^2)
 */
public class BubbleSort {
     public static void bubbleSort(int[] arr){
         for (int i = 0; i < arr.length; i++) {
             // the last i elements are sorted
             for (int j = 0; j < i; j++) {
                 if (arr[j] > arr[j+1]){
                     swap(arr, j, j+1);
                 }
             }
         }
     }

     public static void swap(int[] arr, int i, int j){
         int tmp = arr[i];
         arr[i] = arr[j];
         arr[j] = tmp;
     }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 9, 77, 23, 12, 61};
        System.out.println("Before: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
