package test;

import org.junit.Assert;
import org.junit.Test;
import src.BubbleSort;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void testBubbleSort(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = TestUtil.generateRandomArray(10);
        bubbleSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        if (!TestUtil.isSorted(arr)){
            Assert.fail();
        }
    }
}
