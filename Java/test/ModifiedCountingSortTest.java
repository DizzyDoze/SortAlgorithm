package test;

import org.junit.Assert;
import org.junit.Test;
import src.ModifiedCountingSort;

public class ModifiedCountingSortTest {
    @Test
    public void testMergeSort(){
        ModifiedCountingSort modifiedCountingSort = new ModifiedCountingSort();
        int[] arr = TestUtil.generateRandomArray(10);
        // find max value first
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxValue = Math.max(maxValue, arr[i]);
        }
        modifiedCountingSort.sort(arr, maxValue);
        if (!TestUtil.isSorted(arr)){
            Assert.fail();
        }
    }
}
