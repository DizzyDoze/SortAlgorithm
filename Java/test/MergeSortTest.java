package test;

import org.junit.Assert;
import org.junit.Test;
import src.MergeSort;

public class MergeSortTest {

    @Test
    public void testMergeSort(){
        MergeSort mergeSort = new MergeSort();
        int[] arr = TestUtil.generateRandomArray(10);
        mergeSort.sort(arr);
        if (!TestUtil.isSorted(arr)){
            Assert.fail();
        }
    }
}
