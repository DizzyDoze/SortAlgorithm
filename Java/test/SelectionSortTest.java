package test;

import org.junit.Assert;
import org.junit.Test;
import src.SelectionSort;

public class SelectionSortTest {

    @Test
    public void testSelectionSort(){
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = TestUtil.generateRandomArray(10);
        selectionSort.sort(arr, 0, arr.length-1);
        if (!TestUtil.isSorted(arr)){
            Assert.fail();
        }
    }
}
