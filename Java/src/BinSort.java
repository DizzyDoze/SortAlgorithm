package src;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 1. get the maxValue
 * 2. iterate original array and add to each LinkedList in the corresponding bin
 * 3. iterate bin and put it back to original array
 */
public class BinSort {

    public void sort(int[] arr, int maxValue){
        binSort(arr, maxValue);
    }

    private void binSort(int[] arr, int maxValue){
        LinkedList<Integer>[] bins = new LinkedList[maxValue + 1];
        // create empty linkedlist for each bin
        for (int i = 0; i < bins.length; i++) {
            bins[i] = new LinkedList<>();
        }

        // 2. iterate original array and add to each LinkedList in the corresponding bin
        for (int i = 0; i < arr.length; i++) {
            bins[arr[i]].add(arr[i]);
        }

        // 3. iterate bin and put it back to original array
        int arrIndex = 0;
        for (int i = 0; i < bins.length; i++) {
            LinkedList<Integer> linkedList = bins[i];
            Iterator<Integer> it = linkedList.iterator();
            // keep adding same elements until Null
            while (it.hasNext()){
                arr[arrIndex] = it.next();
                arrIndex++;
            }
        }
    }
}
