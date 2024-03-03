package test;

import org.junit.Assert;
import org.junit.Test;
import src.InsertionSort;
import src.ShakerSort;

public class InsertionSortTest {
    @Test
    public void testInsertionSort(){
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = TestUtil.generateRandomArray(10);
        insertionSort.sort(arr, 0, arr.length-1);
        if (!TestUtil.isSorted(arr)){
            Assert.fail();
        }
    }
}
