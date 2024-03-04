package src;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 1. Create buckets with empty LinkedList
 * 2. Calculate range of each bucket
 * 3. Add elements into LinkedLists in the buckets
 * 4. Put elements back to original array
 * O(N)
 */
public class BucketSort {

    public void sort(int[] arr, int maxValue, int numBuckets){
        bucketSort(arr, maxValue, numBuckets);
    }

    private void bucketSort(int[] arr, int maxValue, int numBuckets){
        // initiate buckets, each index is null
        LinkedList<Integer>[] buckets = new LinkedList[numBuckets];

        int bucketRange = maxValue / numBuckets + 1;    // eg. 99 / 10 + 1 = 10

        // Add elements into LinkedLists in the buckets
        for (int i = 0; i < arr.length; i++) {
            int currIndex = arr[i] / bucketRange;       // calculate where we should put arr[i]
            if (buckets[currIndex] == null) {           // ensure bucket LinkedList is not null
                buckets[currIndex] = new LinkedList<>();
            }
            buckets[currIndex].add(arr[i]);
        }

        // Put elements back to original array in sorted order
        int arrIndex = 0;
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] == null){
                continue;
            }
            Collections.sort(buckets[i]);               // sort current LinkedList
            Iterator<Integer> it = buckets[i].iterator();

            while (it.hasNext()){
                arr[arrIndex] = it.next();
                arrIndex++;
            }
        }
    }
}
