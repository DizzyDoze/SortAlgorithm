package test;

import org.junit.Assert;
import org.junit.Test;
import src.ShakerSort;

public class ShakerSortTest {
    @Test
    public void testShakerSort(){
        ShakerSort shakerSort = new ShakerSort();
        int[] arr = TestUtil.generateRandomArray(10);
        shakerSort.sort(arr, 0, arr.length-1);
        if (!TestUtil.isSorted(arr)){
            Assert.fail();
        }
    }
}
