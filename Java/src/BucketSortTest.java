package src;

import org.junit.Assert;
import org.junit.Test;
import test.TestUtil;

public class BucketSortTest {
    @Test
    public void testBucketSort() {
        BucketSort bucketSort = new BucketSort();
        int[] arr = TestUtil.generateRandomArray(10);
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxValue = Math.max(maxValue, arr[i]);
        }
        bucketSort.sort(arr, maxValue, 10);
        if (!TestUtil.isSorted(arr)) {
            Assert.fail();
        }
    }
}
