package test;

import org.junit.Assert;
import org.junit.Test;
import src.QuickSort;

public class QuickSortTest {
    @Test
    public void testMergeSort(){
        QuickSort quickSort = new QuickSort();
        int[] arr = TestUtil.generateRandomArray(10);
        quickSort.sort(arr);
        if (!TestUtil.isSorted(arr)){
            Assert.fail();
        }
    }
}
