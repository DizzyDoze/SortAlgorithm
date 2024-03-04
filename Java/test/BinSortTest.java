package test;

import org.junit.Assert;
import org.junit.Test;
import src.BinSort;

public class BinSortTest {

    @Test
    public void testBubbleSort(){
        BinSort binSort = new BinSort();
        int[] arr = TestUtil.generateRandomArray(10);
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxValue = Math.max(maxValue, arr[i]);
        }
        binSort.sort(arr, maxValue);
        if (!TestUtil.isSorted(arr)){
            Assert.fail();
        }
    }
}
